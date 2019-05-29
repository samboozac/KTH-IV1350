package model;
import controller.OperationFailedException;
import integration.ItemDTO;
import integration.SaleDTO;
import util.Amount;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private SaleDTO saleDTO;
    private RegisteredItems registeredItems;
    private Payment payment;
    private Amount runningTotal = new Amount(0);
    private Amount totalVAT = new Amount(0);
    private List<TotalRevenueObserver> revenueObservers = new ArrayList<>();

    /**
     * Constructor, creates a structure to save the items in.
     */
    public Sale() {
        registeredItems = new RegisteredItems();
    }

    /**
     * Inserts the item/s and updates VAT, Rtotal and overwrites the current SaleDTO and returns it.
     * @param itemDTO
     * @param quantity
     * @return
     */
    public SaleDTO addItem(ItemDTO itemDTO, int quantity) throws OperationFailedException {
        try {
            registeredItems.put(itemDTO, quantity);
            totalVAT = totalVAT.add(new Amount(itemDTO.getPrice().getValue()*quantity/100*itemDTO.getVAT().getValue()));
            runningTotal = registeredItems.getRunningTotal();
            saleDTO = new SaleDTO("Jarmo", registeredItems, runningTotal, totalVAT);
            return saleDTO;
        } catch (OperationFailedException e){
            throw new OperationFailedException(e.getMessage());
        }

    }

    /**
     * Creates a payment for the sale, and calls verify to make sure the payment is legit.
     * @param amount
     * @return
     */
    public void pay(Amount amount){
        payment = new Payment(saleDTO);
        payment.verify(amount);
    }

    /**
     * Retrieves the payment to accessed in e.g. view at a later stage.
     * @return
     */
    public Payment getPayment(){
        return payment;
    }

    public void  endSale(){
        notifyObservers();
    }

    public void addTotalRevenueObservers(List<TotalRevenueObserver> revenueObservers) {
        this.revenueObservers.addAll(revenueObservers);
    }


    private void notifyObservers() {
        for(TotalRevenueObserver observer : revenueObservers) {
            observer.newTotalSalePrice(runningTotal);
        }
    }
}

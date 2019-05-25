package model;
import integration.ItemDTO;
import integration.SaleDTO;
import util.Amount;

public class Sale {
    private SaleDTO saleDTO;
    private RegisteredItems registeredItems;
    private Payment payment;
    private Amount runningTotal = new Amount(0);
    private Amount totalVAT = new Amount(0);

    public Sale() {
        registeredItems = new RegisteredItems();
    }

    /**
     *
     * @param itemDTO
     * @param quantity
     * @return
     */
    public SaleDTO addItem(ItemDTO itemDTO, int quantity){
        registeredItems.put(itemDTO, quantity);
        totalVAT = totalVAT.add(new Amount(itemDTO.getPrice().getValue()*quantity/100*itemDTO.getVAT().getValue()));
        runningTotal = registeredItems.getRunningTotal();
        saleDTO = new SaleDTO("Jarmo", registeredItems, runningTotal, totalVAT);
        return saleDTO;
    }

    /**
     *
     * @param amount
     * @return
     */
    public void pay(Amount amount){
        payment = new Payment(saleDTO);
        payment.verify(amount);
    }

    public Payment getPayment(){
        return payment;
    }
}

package model;
import integration.ItemDTO;
import integration.SaleDTO;
import util.Amount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sale {
    private SaleDTO saleDTO;
    private ItemDTO lastAddedItem;
    private RegisteredItems registeredItems;
    private Payment payment;
    private Amount runningTotal= new Amount(0);
    private Amount totalVAT = new Amount(0);

    /**
     *
     */
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
        System.out.println(itemDTO);
        System.out.println("Quantity: " + quantity);
        Amount linePrice = new Amount(itemDTO.getPrice(), quantity);
        runningTotal = runningTotal.add(linePrice);
        lastAddedItem = itemDTO;

        HashMap<ItemDTO, Integer> map = registeredItems.getMap();
        Iterator<Map.Entry<ItemDTO, Integer>> entrySet = map.entrySet().iterator();
        while (entrySet.hasNext()) {
            Map.Entry<ItemDTO, Integer> pair = entrySet.next();
            if(pair.getKey().equals(itemDTO)) {
                map.put(pair.getKey(), pair.getValue() + quantity);
                totalVAT = totalVAT.add(new Amount(itemDTO.getPrice().getValue()*quantity/100*itemDTO.getVAT().getValue()));
                saleDTO = new SaleDTO("Jarmo", registeredItems, runningTotal, totalVAT);
                return saleDTO;
            }
        }
        map.put(itemDTO, quantity);
        totalVAT = totalVAT.add(new Amount(itemDTO.getPrice().getValue()*quantity/100*itemDTO.getVAT().getValue()));
        saleDTO = new SaleDTO("Jarmo", registeredItems, runningTotal, totalVAT);
        return saleDTO;
    }

    public void signalLastItem() {
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
}

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
    private Amount runningTotal= new Amount(0);
    private Payment payment;
    private Amount change;

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
        runningTotal.add(linePrice);
        linePrice.setValue(new Amount(0));
        lastAddedItem = itemDTO;

        HashMap<ItemDTO, Integer> map = registeredItems.getMap();
        Iterator<Map.Entry<ItemDTO, Integer>> entrySet = map.entrySet().iterator();
        while (entrySet.hasNext()) {
            Map.Entry<ItemDTO, Integer> pair = entrySet.next();
            if(pair.getKey().equals(itemDTO)) {
                //System.out.println("Successfully added " + pair.getValue() + "of " + pair.getKey());
                map.put(pair.getKey(), pair.getValue() + quantity);
                saleDTO = new SaleDTO("Jarmo", registeredItems, runningTotal, change);
                return saleDTO;
            }
        }
        map.put(itemDTO, quantity);
        saleDTO = new SaleDTO("Jarmo", registeredItems, runningTotal, change);
        return saleDTO;
    }

    public void signalLastItem() {
        payment = new Payment(saleDTO);
    }
    /**
     *
     */
    public void recordInitialSalesInfo(){}

    /**
     *
     * @param amount
     * @return
     */
    public Amount pay(Amount amount){

        return change = payment.pay(amount);
    }
}

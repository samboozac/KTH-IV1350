package model;

import integration.ItemDTO;
import util.Amount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RegisteredItems {
    private HashMap<ItemDTO, Integer> register;
    private Amount runningTotal = new Amount(0);

    /**
     *
     */
    public RegisteredItems(){
        register = new HashMap<>();
    }


    public void put(ItemDTO itemDTO, int quantity){
        System.out.println(itemDTO);
        System.out.println("Quantity: " + quantity);
        Amount linePrice = new Amount(itemDTO.getPrice(), quantity);
        runningTotal = runningTotal.add(linePrice);

        HashMap<ItemDTO, Integer> map = register;
        Iterator<Map.Entry<ItemDTO, Integer>> entrySet = map.entrySet().iterator();
        while (entrySet.hasNext()) {
            Map.Entry<ItemDTO, Integer> pair = entrySet.next();
            if(pair.getKey().equals(itemDTO)) {
                map.put(pair.getKey(), pair.getValue() + quantity);
            }
        }
        map.put(itemDTO, quantity);
    }

    public Amount getRunningTotal() {
        return runningTotal;
    }
    /**
     *
     * @return
     */
    public HashMap<ItemDTO, Integer> getMap() { return register;}
}

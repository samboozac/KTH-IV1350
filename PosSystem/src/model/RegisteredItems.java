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
     * Constructor, creates the register HashMap.
     */
    public RegisteredItems(){
        register = new HashMap<>();
    }

    /**
     * Updates the ValueKey is the ItemDTO exists, else: create a new KeyValue pair.
     * @param itemDTO
     * @param quantity
     */
    public void put(ItemDTO itemDTO, int quantity){
        System.out.print("Added! -----> ");
        System.out.print(itemDTO);
        System.out.println("x" + quantity);
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

    /**
     * Retrieves the running total amount.
     * @return
     */
    public Amount getRunningTotal() {
        return runningTotal;
    }

    /**
     * Retrieves the HashMap.
     * @return
     */
    public HashMap<ItemDTO, Integer> getMap() { return register;}
}

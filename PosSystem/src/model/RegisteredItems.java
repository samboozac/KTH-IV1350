package model;

import controller.OperationFailedException;
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
    public void put(ItemDTO itemDTO, int quantity) throws OperationFailedException {
        System.out.print("Added! -----> ");
        System.out.print(itemDTO);
        System.out.println("x" + quantity);
        Amount linePrice = new Amount(itemDTO.getPrice(), quantity);
        runningTotal = runningTotal.add(linePrice);
        HashMap<ItemDTO, Integer> map = register;
        Integer currentValue = map.get(itemDTO);
        if(currentValue == null) {
            currentValue = 0;
        }
        map.put(itemDTO, quantity + currentValue);
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

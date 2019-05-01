package model;

import integration.ItemDTO;
import util.RunningTotal;

import java.util.HashMap;

public class AddedItems {
    private HashMap<ItemDTO, Integer> register;
    private Cost runningTotal;

    /**
     *
     */
    public AddedItems(){
        register = new HashMap<>();
    }

    /**
     *
     * @param itemDTO
     * @param quantity
     * @return
     */
    public double addItem(ItemDTO itemDTO, int quantity){
        return register.put(itemDTO, quantity);
    }

    /**
     *
     * @return
     */
    public HashMap<ItemDTO, Integer> getAddedItems() { return register;}

    /**
     *
     * @return
     */
    public Cost getRunningTotal(){
        for (HashMap.Entry<ItemDTO, Integer> it : register.entrySet()) {
            runningTotal = new Cost(it.getKey().getPrice().getCost(), it.getValue());
        }
        return runningTotal;
    }
}

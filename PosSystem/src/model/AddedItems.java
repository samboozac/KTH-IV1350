package model;

import integration.ItemDTO;
import util.RunningTotal;

import java.util.HashMap;

public class AddedItems {
    private HashMap<ItemDTO, Integer> register;
    private Cost runningTotal;

    public AddedItems(){
        register = new HashMap<>();
    }

    public double addItem(ItemDTO itemDTO, int quantity){
        return register.put(itemDTO, quantity);
    }

    public HashMap<ItemDTO, Integer> getAddedItems() {
        return register;
    }

    public Cost getRunningTotal(){
        for (HashMap.Entry<ItemDTO, Integer> it : register.entrySet()) {
            runningTotal = new Cost(it.getKey().getPrice().getCost(), it.getValue());
        }
        return runningTotal;
    }
}

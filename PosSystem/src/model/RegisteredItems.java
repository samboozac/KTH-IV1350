package model;

import integration.ItemDTO;
import util.Amount;
import util.RunningTotal;

import java.util.HashMap;

public class RegisteredItems {
    private HashMap<ItemDTO, Integer> register;

    /**
     *
     */
    public RegisteredItems(){
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
    public HashMap<ItemDTO, Integer> getMap() { return register;}
}

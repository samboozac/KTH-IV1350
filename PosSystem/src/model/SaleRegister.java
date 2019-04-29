package model;

import integration.ItemDTO;

import java.util.HashMap;

public class SaleRegister {
    private HashMap<ItemDTO, Integer> register;
    public SaleRegister(){
        register = new HashMap<>();
    }

    public double addItem(ItemDTO itemDTO, int quantity){
        return register.put(itemDTO, quantity);
    }
}

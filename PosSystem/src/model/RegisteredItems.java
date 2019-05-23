package model;

import integration.ItemDTO;

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
     * @return
     */
    public HashMap<ItemDTO, Integer> getMap() { return register;}
}

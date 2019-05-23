package model;

import integration.ItemDTO;
import util.Amount;
import util.RunningTotal;
import util.VAT;

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

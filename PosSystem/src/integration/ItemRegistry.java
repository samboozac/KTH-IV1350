package integration;

import model.Cost;
import util.ItemIdentifier;

import java.util.HashMap;

public class ItemRegistry {
    private HashMap<ItemIdentifier, ItemDTO> itemList = new  HashMap<>();

    public ItemRegistry(){
        addItems();
    }

    private void addItems(){
        itemList.put(new ItemIdentifier("1231231"), new ItemDTO("banan", "gul", new Cost(10.90, 1)));
        itemList.put(new ItemIdentifier("1231231"), new ItemDTO("Äpple", "röd", new Cost(10.90, 1)));
        itemList.put(new ItemIdentifier("1231231"), new ItemDTO("Päron", "grön", new Cost(10.90, 1)));
    }

    public HashMap<ItemIdentifier, ItemDTO> getItemList() {
        return itemList;
    }
}

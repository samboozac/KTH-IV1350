package integration;

import java.util.HashMap;

public class ItemRegistry {
    private HashMap<String, ItemDTO> itemList = new  HashMap<>();

    public ItemRegistry(){
        addItems();
    }

    private void addItems(){
        itemList.put("Banan", new ItemDTO("banan", "gul", 10.90));
        itemList.put("Äpple", new ItemDTO("Äpple", "röd", 5.80));
        itemList.put("Päron", new ItemDTO("Päron", "grön", 3.60));
    }
}

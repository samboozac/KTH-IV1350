package integration;

import util.Amount;
import util.ItemIdentifier;
import util.VAT;

import java.util.HashMap;

public class ExternalInventory {
    private HashMap<ItemIdentifier, ItemDTO> itemCatalog = new HashMap<>();

    public ExternalInventory(){
        addItems();
    }

    /**
     * Adds the item catalog.
     */
    private void addItems() {
        itemCatalog.put(new ItemIdentifier("100"), new ItemDTO("banana", "yellow", new Amount(20), new VAT(12)));
        itemCatalog.put(new ItemIdentifier("101"), new ItemDTO("apple", "green", new Amount(15), new VAT(12)));
        itemCatalog.put(new ItemIdentifier("102"), new ItemDTO("orange", "orange", new Amount(25), new VAT(12)));
        itemCatalog.put(new ItemIdentifier("103"), new ItemDTO("Salmon", "pink", new Amount(100), new VAT(12)));
    }

    public HashMap<ItemIdentifier, ItemDTO> getMap() {
        return itemCatalog;
    }

    /**
     * We don't deal with the database
     * @param saleDTO
     */
    private void updateInventory(SaleDTO saleDTO) {
        System.out.println("updates inventory database");
    }
}

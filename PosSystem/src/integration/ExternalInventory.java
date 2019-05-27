package integration;

import util.Amount;
import util.ItemIdentifier;
import java.util.HashMap;

public class ExternalInventory {
    private HashMap<ItemIdentifier, ItemDTO> itemCatalog = new HashMap<>();

    public ExternalInventory(){
        addItems();
    }

    /**
     * Adds example data for the test-run. What represents an inventory database.
     */
    private void addItems() {
        itemCatalog.put(new ItemIdentifier("100"), new ItemDTO("banana", "yellow", new Amount(20), new Amount(12)));
        itemCatalog.put(new ItemIdentifier("101"), new ItemDTO("apple", "green", new Amount(15), new Amount(12)));
        itemCatalog.put(new ItemIdentifier("102"), new ItemDTO("orange", "orange", new Amount(25), new Amount(12)));
        itemCatalog.put(new ItemIdentifier("103"), new ItemDTO("Salmon", "pink", new Amount(100), new Amount(12)));
    }

    /**
     * returns the item catalog.
     * @return
     */
    public HashMap<ItemIdentifier, ItemDTO> getMap() throws DatabaseConnectionFailureException{
        if(itemCatalog == null) {
            throw new DatabaseConnectionFailureException("No connection to database!");
        }
        return itemCatalog;
    }

    /**
     * Just a representation of updating the inventory database.
     * @param saleDTO
     */
    public void update(SaleDTO saleDTO) {
        System.out.println("Updated Inventory successfully!");
    }
}

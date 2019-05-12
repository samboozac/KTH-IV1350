package integration;
import model.RegisteredItems;
import util.ItemIdentifier;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DbHandler {
    private ExternalInventory externalInventory;
    private ExternalAccounting externalAccounting;
    private RegisteredItems registeredItems;

    public DbHandler(ExternalInventory externalInventory, ExternalAccounting externalAccounting){
        this.externalInventory = externalInventory;
        this.externalAccounting = externalAccounting;
        registeredItems = new RegisteredItems();
    }

    /**
     *
     * @param itemIdentifier
     * @return
     */
    public ItemDTO getItemDTO(ItemIdentifier itemIdentifier) {
        HashMap<ItemIdentifier, ItemDTO> map = externalInventory.getMap();
        Iterator<Map.Entry<ItemIdentifier, ItemDTO>> entrySet = map.entrySet().iterator();
        while (entrySet.hasNext()) {
            Map.Entry<ItemIdentifier, ItemDTO> pair = entrySet.next();
            if(pair.getKey().equals(itemIdentifier)) {
                //System.out.println(pair.getValue() + "exists!");
                return pair.getValue();
            }
        }
        return null;
    }

    /**
     *
     * @param saleDTO
     */
    public void registerSalesInformation(SaleDTO saleDTO){
        System.out.println("Sends file to external system");
    }
}

package integration;
import util.ItemIdentifier;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DbHandler {
    private ExternalInventory externalInventory;
    private ExternalAccounting externalAccounting;

    public DbHandler(ExternalInventory externalInventory, ExternalAccounting externalAccounting){
        this.externalInventory = externalInventory;
        this.externalAccounting = externalAccounting;
    }

    /**
     * Logic checks after the ID in the 'database', returns the information if found else 'null'.
     * @param itemIdentifier
     * @return
     * @throws NoSuchItemIdentifierException
     * @throws DatabaseConnectionFailureException
     */
    public ItemDTO getItemDTO(ItemIdentifier itemIdentifier) throws NoSuchItemIdentifierException, DatabaseConnectionFailureException{
        HashMap<ItemIdentifier, ItemDTO> map = externalInventory.getMap();
        if (map == null) {
            throw new DatabaseConnectionFailureException("Could not connect to Database..");
        }
        Iterator<Map.Entry<ItemIdentifier, ItemDTO>> entrySet = map.entrySet().iterator();
        while (entrySet.hasNext()) {
            Map.Entry<ItemIdentifier, ItemDTO> pair = entrySet.next();
            if(pair.getKey().equals(itemIdentifier)) {
                return pair.getValue();
            }
        }
        throw new NoSuchItemIdentifierException("Item: " + itemIdentifier + " could not be found in the database");
    }

    /**
     * Just a representation of the database updates (passed the complete saleDTO).
     * @param saleDTO
     */
    public void updateExternalSystems(SaleDTO saleDTO) {
        externalInventory.update(saleDTO);
        externalAccounting.update(saleDTO);
    }
}

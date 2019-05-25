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
                return pair.getValue();
            }
        }
        return null;
    }

    public void updateExternalSystems(SaleDTO saleDTO) {
        externalInventory.update(saleDTO);
        externalAccounting.update(saleDTO);
    }
}

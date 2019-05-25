package tests;

import integration.ExternalInventory;
import integration.ItemDTO;
import integration.SaleDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.ItemIdentifier;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExternalInventoryTest {
    private ExternalInventory externalInventory;

    @BeforeEach
    void setup() {
        externalInventory = new ExternalInventory();
    }

    @AfterEach
    void tearDown() {
        externalInventory = null;
    }

    @Test
    void testAddItems(){
        ItemIdentifier expected = new ItemIdentifier("103");
        ItemIdentifier actual = null;
        HashMap<ItemIdentifier, ItemDTO> map = externalInventory.getMap();
        Iterator<Map.Entry<ItemIdentifier, ItemDTO>> entrySet = map.entrySet().iterator();
        while (entrySet.hasNext()) {
            Map.Entry<ItemIdentifier, ItemDTO> pair = entrySet.next();
            if(pair.getKey().equals(expected)) {
                actual = expected;
            }
        }
        assertEquals(expected, actual, "addItems() fails!");
    }

    @Test
    void testGetMap(){
        HashMap<ItemIdentifier, ItemDTO> ic = externalInventory.getMap();
        assertNotNull(ic);
    }

    @Test
    void testUpdate() {
        SaleDTO saleDTO = new SaleDTO(null, null, null, null);
        externalInventory.update(saleDTO);
    }
}

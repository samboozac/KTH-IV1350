package tests;

import controller.OperationFailedException;
import integration.DatabaseConnectionFailureException;
import integration.ExternalInventory;
import integration.ItemDTO;
import integration.SaleDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.ItemIdentifier;

import javax.swing.plaf.OptionPaneUI;
import javax.xml.crypto.Data;
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

    /**
     *
     * @throws OperationFailedException
     */
    @Test
    void testAddItems() throws OperationFailedException {
        ItemIdentifier expected = new ItemIdentifier("103");
        ItemIdentifier actual = null;
        try {
            HashMap<ItemIdentifier, ItemDTO> map = externalInventory.getMap();
            Iterator<Map.Entry<ItemIdentifier, ItemDTO>> entrySet = map.entrySet().iterator();
            while (entrySet.hasNext()) {
                Map.Entry<ItemIdentifier, ItemDTO> pair = entrySet.next();
                if(pair.getKey().equals(expected)) {
                    actual = expected;
                }
            }
            assertEquals(expected, actual, "addItems() fails!");
        } catch (DatabaseConnectionFailureException e) {
            throw new OperationFailedException(e.getMessage());
        }

    }

    /**
     *
     * @throws OperationFailedException
     */
    @Test
    void testGetMap() throws OperationFailedException{
        try {
            HashMap<ItemIdentifier, ItemDTO> ic = externalInventory.getMap();
            assertNotNull(ic);
        } catch (DatabaseConnectionFailureException e) {
            throw new OperationFailedException(e.getMessage());
        }
    }

    @Test
    void testUpdate() {
        SaleDTO saleDTO = new SaleDTO(null, null, null, null);
        externalInventory.update(saleDTO);
    }
}

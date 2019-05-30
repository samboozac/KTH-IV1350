package tests;

import integration.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.ItemIdentifier;

public class NoSuchItemIdentifierExceptionTest {
    private ExternalInventory externalInventory;
    private DbHandler dbHandler;

    @BeforeEach
    void setup() {
        externalInventory = new ExternalInventory();
        dbHandler = new DbHandler(externalInventory, new ExternalAccounting());
    }

    @AfterEach
    void tearDown() {
        externalInventory = null;
        dbHandler = null;
    }

    @Test
    void testAddNonExistingItem(){
        Assertions.assertThrows(NoSuchItemIdentifierException.class, () -> {
            dbHandler.getItemDTO(new ItemIdentifier("1001"));
        });
    }
}

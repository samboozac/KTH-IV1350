package tests;

import controller.OperationFailedException;
import integration.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;
import util.ItemIdentifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DbHandlerTest {
    private DbHandler dbhandler;

    @BeforeEach
    void setup() {
        ExternalAccounting ea = new ExternalAccounting();
        ExternalInventory ei = new ExternalInventory();
        dbhandler = new DbHandler(ei, ea);
    }

    @AfterEach
    void tearDown() {
        dbhandler = null;
    }

    @Test
    void testGetItemDTO() throws OperationFailedException {
        try {
            ItemIdentifier getBanana = new ItemIdentifier("100");
            ItemDTO actual = dbhandler.getItemDTO(getBanana);
            ItemDTO expected = new ItemDTO("banana", "yellow", new Amount(20), new Amount(12));
            assertEquals(expected.getName(), actual.getName(), "getItemDTO() fails!");
        } catch (DatabaseConnectionFailureException | NoSuchItemIdentifierException e) {
            throw new OperationFailedException(e.getMessage());
        }

    }

    @Test
    void testUpdateExternalSystems(){
        SaleDTO saleDTO = new SaleDTO(null, null, null, null);
        dbhandler.updateExternalSystems(saleDTO);
    }
}

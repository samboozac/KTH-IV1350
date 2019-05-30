package tests;

import integration.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionFailureExceptionTest {
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
    void testConnectionToNonExistingDatabase(){
        Assertions.assertThrows(DatabaseConnectionFailureException.class, () -> {
            externalInventory.setMapNull();
            externalInventory.getMap();
        });
    }
}

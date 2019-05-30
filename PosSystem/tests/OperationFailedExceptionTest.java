package tests;

import controller.Controller;
import controller.OperationFailedException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.ItemIdentifier;

public class OperationFailedExceptionTest {
    private Controller controller;

    @BeforeEach
    void setup() {
        controller = new Controller();
    }

    @AfterEach
    void tearDown() {
        controller = null;
    }

    @Test
    void testAddNonExistingItem(){
        Assertions.assertThrows(OperationFailedException.class, () -> {
            controller.addItem(new ItemIdentifier("10001"), 1);
        });
    }
}

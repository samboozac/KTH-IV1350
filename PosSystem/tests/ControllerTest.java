package tests;

import controller.Controller;
import controller.OperationFailedException;
import integration.ItemDTO;
import integration.SaleDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;
import util.ItemIdentifier;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControllerTest {
    private Controller controller;

    @BeforeEach
    void setup() {
        controller = new Controller();
        controller.startSale();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testStartSale(){
        controller.startSale();
    }

    /**
     *
     * @throws OperationFailedException
     */
    @Test
    void testAddItem() throws OperationFailedException {
        ItemDTO itemDTO = new ItemDTO("banana", "yellow", new Amount(20), new Amount(12));
        try {
            SaleDTO saleDTO = controller.addItem(new ItemIdentifier("100"), 1);
            Amount actual = saleDTO.getRegisteredItems().getRunningTotal();
            Amount expected = itemDTO.getPrice();
            assertEquals(expected.getValue(), actual.getValue(), "addItem() fails!");
        } catch (OperationFailedException e) {
            throw new OperationFailedException(e.getMessage());
        }
    }

    /**
     *
     * @throws OperationFailedException
     */
    @Test
    void testPay() throws OperationFailedException{
        Amount amountToPay = new Amount(20);
        try {
            controller.addItem(new ItemIdentifier("100"), 2);
            controller.pay(amountToPay);
        } catch (OperationFailedException e) {
            throw new OperationFailedException(e.getMessage());
        }

    }

    @Test
    void testUpdateSystems(){
        controller.endSale();
    }
}

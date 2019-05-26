package tests;

import controller.Controller;
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

    @Test
    void testAddItem(){
        ItemDTO itemDTO = new ItemDTO("banana", "yellow", new Amount(20), new Amount(12));
        SaleDTO saleDTO = controller.addItem(new ItemIdentifier("100"), 1);

        Amount actual = saleDTO.getRegisteredItems().getRunningTotal();
        Amount expected = itemDTO.getPrice();
        assertEquals(expected.getValue(), actual.getValue(), "addItem() fails!");
    }

    @Test
    void testPay(){
        Amount amountToPay = new Amount(20);
        controller.addItem(new ItemIdentifier("100"), 2);
        controller.pay(amountToPay);
    }

    @Test
    void testUpdateSystems(){
        controller.endSale();
    }
}

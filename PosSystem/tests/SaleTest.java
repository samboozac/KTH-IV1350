package tests;

import controller.OperationFailedException;
import integration.ItemDTO;
import integration.SaleDTO;
import model.Sale;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleTest {
    private SaleDTO saleDTO;
    private Sale sale;
    private ItemDTO itemDTO;

    @BeforeEach
    void setup() throws OperationFailedException {
        sale = new Sale();
        itemDTO = new ItemDTO("1001", "Gul", new Amount(20), new Amount(12));
        try {
            sale.addItem(itemDTO, 2);
        } catch (OperationFailedException e) {
            throw new OperationFailedException(e.getMessage());
        }

    }

    @AfterEach
    void tearDown() {
        sale = null;
        itemDTO = null;
    }

    @Test
    void testAddItem() throws OperationFailedException{
        try {
            saleDTO = sale.addItem(itemDTO, 2);
            boolean actual = saleDTO.getRegisteredItems().getMap().containsKey(itemDTO);
            boolean expected = true;
            assertEquals(expected, actual, "addItem() fails!");
        } catch (OperationFailedException e) {
            throw new OperationFailedException(e.getMessage());
        }
    }

    @Test
    void pay(){
        Amount expected = new Amount(20);
        sale.pay(expected);
        Amount actual = sale.getPayment().getAmountPaid();
        assertEquals(expected.getValue(), actual.getValue(), "pay() fails!");
    }
}

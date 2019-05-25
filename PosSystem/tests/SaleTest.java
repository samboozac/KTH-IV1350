package tests;

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
    void setup() {
        sale = new Sale();
        itemDTO = new ItemDTO("1001", "Gul", new Amount(20), new Amount(12));
        sale.addItem(itemDTO, 2);
    }

    @AfterEach
    void tearDown() {
        sale = null;
        itemDTO = null;
    }

    @Test
    void testAddItem(){
        saleDTO = sale.addItem(itemDTO, 2);
        boolean actual = saleDTO.getRegisteredItems().getMap().containsKey(itemDTO);
        boolean expected = true;
        assertEquals(expected, actual, "addItem() fails!");
    }

    @Test
    void pay(){
        Amount expected = new Amount(20);
        sale.pay(expected);
        Amount actual = sale.getPayment().getAmountPaid();
        assertEquals(expected.getValue(), actual.getValue(), "pay() fails!");
    }
}

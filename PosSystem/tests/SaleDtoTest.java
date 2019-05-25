package tests;

import integration.ItemDTO;
import integration.SaleDTO;
import model.RegisteredItems;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleDtoTest {
    private String cashier;
    private RegisteredItems registeredItems;
    private Amount runningTotal;
    private Amount totalVAT;
    private SaleDTO saleDTO;

    @BeforeEach
    void setup() {
        cashier = "Jarmo";
        registeredItems = new RegisteredItems();
        runningTotal = new Amount(100);
        totalVAT = new Amount(12);

        ItemDTO itemDTO = new ItemDTO("Banan", "Gul", new Amount(50), new Amount(6));
        registeredItems.put(itemDTO, 2);

        saleDTO = new SaleDTO(cashier, registeredItems, runningTotal, totalVAT);
    }

    @AfterEach
    void tearDown() {
        cashier = null;
        registeredItems = null;
        runningTotal = null;
        totalVAT = null;
    }

    @Test
    void testGetCashier(){
        String expected = cashier;
        String actual = saleDTO.getCashier();
        assertEquals(expected, actual, "getName() fails!");
    }

    @Test
    void testGetItemDescription(){
        RegisteredItems expected = registeredItems;
        RegisteredItems actual = saleDTO.getRegisteredItems();
        assertEquals(expected, actual, "getItemDescription() fails!");
    }

    @Test
    void testGetPrice() {
        Amount expected = runningTotal;
        Amount actual = saleDTO.getRunningTotal();
        assertEquals(expected, actual, "getPrice() fails!");
    }

    @Test
    void testGetVAT() {
        Amount expected = totalVAT;
        Amount actual = saleDTO.getTotalVAT();
        assertEquals(expected, actual, "getVAT() fails!");
    }
}

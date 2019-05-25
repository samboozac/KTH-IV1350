package tests;

import integration.ItemDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemDtoTest {
    private ItemDTO itemDTO;
    private Amount price;
    private Amount vat;
    private String name;
    private String itemDescription;
    @BeforeEach
    void setup() {
        name = "1001";
        itemDescription = "Gul";
        price = new Amount(10);
        vat = new Amount(12);
        itemDTO = new ItemDTO("1001", "Gul",price, vat);
    }

    @AfterEach
    void tearDown() {
        itemDTO = null;
        name = null;
        itemDescription = null;
        price = null;
        vat = null;
    }

    @Test
    void testGetName(){
        String expected = name;
        String actual = itemDTO.getName();
        assertEquals(expected, actual, "getName() fails!");
    }

    @Test
    void testGetItemDescription(){
        String expected = itemDescription;
        String actual = itemDTO.getItemDescription();
        assertEquals(expected, actual, "getItemDescription() fails!");
    }

    @Test
    void testGetPrice() {
        Amount expected = price;
        Amount actual = itemDTO.getPrice();
        assertEquals(expected, actual, "getPrice() fails!");
    }

    @Test
    void testGetVAT() {
        Amount expected = vat;
        Amount actual = itemDTO.getVAT();
        assertEquals(expected, actual, "getVAT() fails!");
    }
}

package tests;

import integration.ItemDTO;
import model.RegisteredItems;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisteredItemsTest {
    private RegisteredItems registeredItems;

    @BeforeEach
    void setup() {
        registeredItems = new RegisteredItems();
    }

    @AfterEach
    void tearDown() {
        registeredItems = null;

    }

    @Test
    void testPut(){
        ItemDTO itemDTO = new ItemDTO("100", "Gul", new Amount(10), new Amount(12));
        registeredItems.put(itemDTO, 1);

        boolean expected = true;
        boolean actual = registeredItems.getMap().containsKey(itemDTO);
        assertEquals(expected, actual, "put() fails!");
    }

    @Test
    void testGetRunningTotal(){
        ItemDTO itemDTO = new ItemDTO("100", "Gul", new Amount(10), new Amount(12));
        registeredItems.put(itemDTO, 1);

        Amount expected = itemDTO.getPrice();
        Amount actual = registeredItems.getRunningTotal();
        assertEquals(expected.getValue(), actual.getValue(), "put() fails!");
    }

    @Test
    void testGetMap(){
        // Setting up Actual
        ItemDTO itemDTO = new ItemDTO("100", "Gul", new Amount(10), new Amount(12));
        registeredItems.put(itemDTO, 1);

        // Creating expected
        HashMap<ItemDTO, Integer> register = new HashMap<>();
        register.put(itemDTO, 1);

        HashMap<ItemDTO, Integer> expected = register;
        HashMap<ItemDTO, Integer> actual = registeredItems.getMap();
        assertEquals(expected, actual, "getMap() fails!");
    }
}

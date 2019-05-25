package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.ItemIdentifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemIdentifierTest {
    @BeforeEach
    void setup() {
        System.out.println("Setting up test dependencies!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down test dependencies!");
    }

    @Test
    void testEquals(){
        ItemIdentifier itemID1 = new ItemIdentifier("1004");
        ItemIdentifier itemID2 = new ItemIdentifier("1004");
        boolean actual = itemID1.equals(itemID2);
        boolean expected = true;
        assertEquals(expected, actual, "Equal fails!");
    }

    @Test
    void testGetValue() {
        String expected = "1001";
        ItemIdentifier amount = new ItemIdentifier(expected);
        String actual = amount.getValue();
        assertEquals(expected, actual, "GetValue fails!");
    }
}

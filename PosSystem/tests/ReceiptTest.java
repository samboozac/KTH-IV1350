package tests;

import integration.SaleDTO;
import model.RegisteredItems;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceiptTest {
    private SaleDTO saleDTO;

    @BeforeEach
    void setup() {
        System.out.println("Setting up test dependencies!");
        Amount runningTotal = new Amount(12);
        Amount totalVAT = new Amount(12*0.12);
        RegisteredItems registeredItems = new RegisteredItems();
        saleDTO = new SaleDTO("Jarmo",  registeredItems, runningTotal, totalVAT);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down test dependencies!");
    }

    @Test
    void testEquals(){
    }

    @Test
    void testGetValue() {
    }
}

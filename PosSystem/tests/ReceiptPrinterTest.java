package tests;

import controller.OperationFailedException;
import integration.ItemDTO;
import integration.Printer;
import integration.SaleDTO;
import model.Receipt;
import model.RegisteredItems;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;

public class ReceiptPrinterTest {
    private Receipt receipt;
    private Printer printer;

    /**
     *
     * @throws OperationFailedException
     */
    @BeforeEach
    void setup() throws OperationFailedException {
        // Sale parameters
        String cashier  = "Jarmo";
        Amount runningTotal = new Amount(12);
        Amount totalVAT = new Amount(12*0.12);
        RegisteredItems registeredItems = new RegisteredItems();
        // Add something
        ItemDTO itemDTO = new ItemDTO("banan", "yellow", new Amount(10), new Amount(12));
        try {
            registeredItems.put(itemDTO, 2);
        } catch (OperationFailedException e) {
            throw new OperationFailedException(e.getMessage());
        }
        // Receipt parameters
        Amount paidAmount = new Amount(40);
        Amount changeAmount = new Amount(16);
        receipt = new Receipt(new SaleDTO(cashier,  registeredItems, runningTotal, totalVAT), paidAmount, changeAmount);
        printer = new Printer();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString(){
        printer.printReceipt(receipt);
    }
}

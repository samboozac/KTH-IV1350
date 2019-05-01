package model;

import integration.ItemDTO;
import integration.SaleDTO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static.org.junit.Assert.*;

/**
 *
 */
public class ReceiptTest {
    private SaleDTO saleDTO;
    private ItemDTO itemDTO;
    private ItemDTO itemDTO2;
    private AddedItems addedItems;
    private Receipt receipt;

    /**
     *
     */
    @Before
    public void setup(){
        itemDTO = new ItemDTO("banan", "gul", new Cost(10, 1));
        itemDTO2 = new ItemDTO("päron", "grön", new Cost(12, 1));
        addedItems = new AddedItems();
        addedItems.addItem(itemDTO, 2);
        saleDTO = new SaleDTO("Jarmo", new Cost(10,1), itemDTO, addedItems, new Cost(9, 1));
        receipt = new Receipt(saleDTO);
    }

    /**
     *
     * @throws Exception
     */
    @After
    public void teardown() throws Exception { }

    /**
     *
     */
    @Test
    public void toString() {
        receipt.toString();
    }
}

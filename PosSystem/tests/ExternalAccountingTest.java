package tests;

import integration.ExternalAccounting;
import integration.SaleDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ExternalAccountingTest {
    private ExternalAccounting externalAccounting;

    @BeforeEach
    void setup() {
        externalAccounting = new ExternalAccounting();
    }

    @AfterEach
    void tearDown() {
        externalAccounting = null;
    }

    @Test
    void testUpdate() {
        SaleDTO saleDTO = new SaleDTO(null, null, null, null);
        externalAccounting.update(saleDTO);
    }

    @Test
    void testGetSaleLog(){
        List<SaleDTO> salesLog = externalAccounting.getSaleLog();
        salesLog.toArray().toString();
    }
}

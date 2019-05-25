package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Amount;
import static org.junit.jupiter.api.Assertions.*;

public class AmountTest {
    @BeforeEach
    void setup() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testAdd(){
        double firstDouble = 2.0;
        double secondDouble = 5.0;
        Amount amountOne = new Amount(firstDouble);
        Amount amountTwo = new Amount(secondDouble);
        Amount expResult = new Amount(firstDouble + secondDouble);
        Amount result = amountOne.add(amountTwo);
        assertEquals(expResult.getValue(), result.getValue(), "Addition fails!");
    }

    @Test
    void testSubtract(){
        double firstDouble = 4.0;
        double secondDouble = 6.0;
        Amount amountOne = new Amount(firstDouble);
        Amount amountTwo = new Amount(secondDouble);
        Amount expResult = new Amount(firstDouble - secondDouble);
        Amount result= amountOne.subtract(amountTwo);
        assertEquals(expResult.getValue(), result.getValue(), "Subtraction fails");
    }

    @Test
    void testGetValue() {
        double expected = 1.0;
        Amount amount = new Amount(expected);
        double actual = amount.getValue();
        assertEquals(expected, actual, "GetValue fails!");
    }
}

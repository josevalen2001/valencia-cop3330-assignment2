package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_returns_right_answer() {
        PaymentCalculator appTest = new PaymentCalculator();
        int output = appTest.calculateMonthsUntilPaidOff(12, 5000, 100);

        assertEquals(70, output);
    }
}
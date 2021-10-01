package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    public void calculateMonthsUntilPaidOff() {
        double balance = 5000;
        double apr = .12;
        double monthlyPayment = 100;
        double dailyRate = apr/365;

        PaymentCalculator p1 = new PaymentCalculator(balance, apr, monthlyPayment);
        int actual_answer = p1.calculateMonthsUntilPaidOff();
        int expected_answer = 70;

        assertEquals(expected_answer, actual_answer);

    }
}
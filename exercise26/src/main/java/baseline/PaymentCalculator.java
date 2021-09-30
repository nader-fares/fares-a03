package baseline;

public class PaymentCalculator {
    //declare instance variables
    double balance;
    double apr;
    double monthlyPayment;

    //declare constructor
    PaymentCalculator(double balance, double apr, double monthlyPayment) {
        this.balance = balance;
        this.apr = apr;
        this.monthlyPayment = monthlyPayment;
    }

    //declare instance methods
    public int calculateMonthsUntilPaidOff() {
        //calculate months using formula
        //Math.log method to obtain log
        return 1;
    }
}

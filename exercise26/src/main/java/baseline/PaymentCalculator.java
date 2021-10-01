package baseline;

public class PaymentCalculator {
    //declare instance variables
    double balance;
    double apr;
    double monthlyPayment;
    double dailyRate;

    //declare constructor
    PaymentCalculator(double balance, double apr, double monthlyPayment) {
        this.balance = Math.ceil(balance * 100) / 100;
        this.apr = apr/100;
        this.monthlyPayment = Math.ceil(monthlyPayment * 100)/100;
        this.dailyRate = this.apr/365;
    }

    //declare instance methods
    public int calculateMonthsUntilPaidOff() {
        //calculate months using formula
        //Math.log method to obtain log
        return (int) (Math.ceil((-(1.0/30.0) * Math.log(1 + this.balance/this.monthlyPayment * (1.0 - Math.pow(1.0 + this.dailyRate, 30.0))) / Math.log(1.0 + this.dailyRate))) * 100 ) / 100;
    }
}

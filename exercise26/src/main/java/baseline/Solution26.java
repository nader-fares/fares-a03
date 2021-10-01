/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Write a program that will help you determine how many months it will take to pay off a credit card balance.
The program should ask the user to enter
    the balance of a credit card,
    the APR of the card, and
    their monthly payment.
The program should then return the number of months needed (rounded up to the next integer value).

The formula for this is
    n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.

Constraints:
Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which takes no parameters and returns the number of months.
Round fractions of a cent up to the next cent for internal calculations
 */
package baseline;

import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        displayDirections();
        //declare and ask for balance, apr, and monthly payment
        System.out.print("What is your balance? ");
        double balance = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = input.nextDouble();;
        System.out.print("What is your monthly payment you can make? ");
        double monthlyPayment = input.nextDouble();;

        //declare constructor with inputs
        PaymentCalculator person1 = new PaymentCalculator(balance, apr, monthlyPayment);

        //declare int months and set equal to method
        int months = person1.calculateMonthsUntilPaidOff();

        //print results
        System.out.println("It will take you " + months + " months to pay off this card.");

    }

    //display directions
    private static void displayDirections() {
        System.out.println("This program will calculate how many months it will take to pay off credit card balance.");
        System.out.println("You will be prompted to enter your credit card balance, APR (as a percentage), and monthly payment.");
    }
}

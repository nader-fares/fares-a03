package baseline;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.
Constraints
Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.
 */

import java.util.Scanner;

public class Solution29 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution29 app = new Solution29();

//        declare user input variable
        String userInput;
//        create a do while loop
        do {
//        for each iteration: prompt for rate of return
            System.out.print("What is the rate of return? ");
            userInput = input.nextLine();

//        if input is valid, stop loop
        } while (!app.validateInput(userInput));
//        convert input to a number
        double rateOfReturn = Double.parseDouble(userInput);
//        calculate and print the years to double the investment
        int years = (int) (72 / rateOfReturn);
        System.out.println("It will take " + years + " years to double your initial investment.");
    }

    public boolean validateInput(String userInput) {
        try {
//        check if input is non-numeric
            double userInputDouble = Double.parseDouble(userInput);
//        check if input is 0
            if (userInputDouble > 0)
                return true;
            else
                return false;
        } catch(NumberFormatException error) {
            return false;
        }

    }
}

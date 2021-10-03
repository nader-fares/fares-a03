/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Write a program that prompts the user for five numbers and computes the total of the numbers.

Constraints
    The prompting must use repetition, such as a counted loop, not three separate prompts.
 */

package baseline;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution28 {
    private static final Scanner input = new Scanner(System.in);
    // declare total instance variable
    public int total = 0;

    public static void main(String[] args) {
        Solution28 app = new Solution28();
//        loop 5 times
        for (int i = 0; i < 5; i++) {
//        for each iteration: prompt number and add it to the total
            int num = app.promptNumber();
            app.addToTotal(num);
        }
//        print the result
        System.out.print("The total is " + app.getTotal() + ".");
    }

    public int promptNumber() {
        try {
//        prompt the user for a number
        System.out.print("Enter a number: ");
//        return user input
        return input.nextInt();
        } catch(NoSuchElementException error) {
            return 0;
        }
    }

    public void addToTotal(int num) {
//        add number to the total
        this.total += num;
    }

    public int getTotal() {
        return total;
    }
}

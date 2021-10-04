/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until the user enters done.

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Constraints
Create functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */

package baseline;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution36 {
    private static final Scanner input = new Scanner(System.in);
    public ArrayList<Integer> millisecondsList = new ArrayList<Integer>();

    public static void main(String[] args) {
        Solution36 app = new Solution36();
//        create done variable
        boolean done = false;
//        loop millisecond prompts until user enters "done"
        while (!done) {
            String userInput = app.promptMilliseconds(-1);
            if (userInput.equals("done"))
                done = true;
            else
                app.millisecondsList.add(Integer.parseInt(userInput));
        }
//        print all calculations
        String numbers = "Numbers: ";
        for (int i = 0; i < app.millisecondsList.size(); i++) {
            if (i > 0)
                numbers += ", ";
            numbers += app.millisecondsList.get(i);
        }
        numbers +=".";
        System.out.println(numbers);
        System.out.println("The average is " + app.average());
        System.out.println("The minimum is " + app.min());
        System.out.println("The maximum is " + app.max());
        System.out.println("The standard deviation is " + new DecimalFormat("#.##").format(app.std()));

    }

    public String promptMilliseconds(int customValue) {
//        ask user for a number
//        check if it's "done"
//        check if it's not a number and loop if it isnt
//        return milliseconds as string

        if (customValue >= 0)
            return "" + customValue;

        try {
            System.out.print("Enter a number: ");
            String userInput = input.nextLine();
            if (userInput.equals("done"))
                return userInput;
            else {
                Integer.parseInt(userInput);
                return userInput;
            }
        } catch(NumberFormatException error) {
            return this.promptMilliseconds(-1);
        } catch(NoSuchElementException error) {
            return "done";
        }
    }

    public double average() {
        int sum = 0;
//        get sum of values and divide by the size of the responseTimes array
        for (int i = 0; i < millisecondsList.size(); i++)
            sum += millisecondsList.get(i);
        return (double) (sum) / (double) (millisecondsList.size());
    }

    public int min() {
//        return the minimum value in the array
        return Collections.min(millisecondsList);
    }

    public int max() {
//        return the maximum value in the array
        return Collections.max(millisecondsList);
    }

    public double std() {
//        create sum variable
//        loop through array to calculate each value's difference from the mean and add to sum
//        divide by list size and return

        double sum = 0;

        double average = this.average();

        for (int i = 0; i < millisecondsList.size(); i++) {
            sum += Math.pow(((double) millisecondsList.get(i) - average), 2);
        }


        return Math.sqrt(sum / (double) millisecondsList.size());

    }
}

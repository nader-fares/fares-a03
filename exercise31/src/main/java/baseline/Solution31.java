/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the example output. The formula is
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.
 */

package baseline;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution31 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution31 app = new Solution31();
//        declare and prompt for resting hr and age
        int restingHR = app.promptNumber("Enter your resting heart rate: ");
        int age = app.promptNumber("Enter your age: ");
//
//        declare output string
        String output = "";
//        concatenate resting hr, age, and table header to the output string
        output += String.format("%-25s%-15s\n", "Resting Pulse: " + restingHR, "Age: " + age);
        output += String.format("%-10s | %-10s\n", "Intensity", "Rate");
        output += String.format("%-10s-|-%-10s\n", "----------", "----------");
//        loop 55 through 95 intensity (increments of 5)
        for (int intensity = 55; intensity <= 95; intensity += 5) {
            output += app.getTableRowString((double) intensity / 100, app.calculateTargetHeartRate(restingHR, age, (double) intensity / 100));
        }
//        get the target heart rate and concatenate table rows to output string
        System.out.println(output);

    }

    public int promptNumber(String promptMessage) {
        int num;
//      create a do while loop
        System.out.print(promptMessage);
        try {
            if (input.hasNextInt())
                num = input.nextInt();
            else {
                input.next();
                return this.promptNumber(promptMessage);
            }
        } catch(NoSuchElementException error) {
            return 0;
        }

//      stop the loop and return the input if it's a number
        return num;
    }
//
    public int calculateTargetHeartRate(int restingHR, int age, double intensity) {
//        return target heart rate based on given formula
        return (int) ((((220 - age) - restingHR) * intensity) + restingHR);
    }
//
    public String getTableRowString(double intensity, int targetHeartRate) {
//        return a formatted row string with given params
        return String.format("%-10s | %-10s\n", (int) (intensity * 100) + "%", targetHeartRate + " bpm");
    }
}

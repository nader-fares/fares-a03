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

public class Solution31 {
    public static void main(String[] args) {
//        declare and prompt for resting hr and age
//        get the target heart rate
//        declare output string
//        concatenate resting hr, age, and table header to the output string
//        loop 55 through 95 intensity (increments of 5)
//        concatenate table rows to output string

    }

    public int promptNumber(String promptMessage) {
//      create a do while loop
//      stop the loop and return the input if it's a number
    }

    public double calculateTargetHeartRate(int restingHr, int age, int intensity) {
//        return target heart rate based on given formula
    }

    public String getTableRowString(int intensity, int targetHeartRate) {
//        return a formatted row string with given params
    }
}

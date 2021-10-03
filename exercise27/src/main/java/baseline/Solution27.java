/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */
/*
Write a program that prompts for
    a first name,
    last name,
    employee ID, and
    ZIP code.

Ensure that the input is valid according to these rules:
    The first name must be filled in.
    The last name must be filled in.
    The first and last names must be at least two characters long.
    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    The ZIP code must be a number.
    Display appropriate error messages on incorrect data.

Constraints
    Create a function for each validation rule. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
    Use a single output statement to display the outputs.
 */

package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution27 app = new Solution27();

//        declare and prompt user for first name, last name, employee id, zip code
        String firstName;
        String lastName;
        String employeeID;
        int zipCode;

//        declare and initialize output string variable
        String output = "";

//        check if each input is valid and concat error messages to it if needed
//        print results
    }

    //    used for first and last name
    public boolean validateName(String name) {
        // return true if name is 2 or more characters
    }

    //    used for employee ID
    public boolean validateEmployeeID(String employeeId) {
        // return true if employee ID follows the specified format (AA-1234)
    }

    //    used for zip code
    public boolean validateZipCode(int zipCode) {
        // return true if zip code is a number
    }
}

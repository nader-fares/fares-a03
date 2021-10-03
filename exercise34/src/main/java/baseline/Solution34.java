/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.
 */

package baseline;

import java.util.ArrayList;

public class Solution34 {
//        declare list of employees
    public ArrayList<String> employees;

    Solution34() {
//        add employees to list
        employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
    }

    public static void main(String[] args) {
//        print all employees
//        prompt user to remove an employee
//        print list of remaining employees

    }

    public void removeEmployee(String name) {
//        remove employee with given name
    }
}

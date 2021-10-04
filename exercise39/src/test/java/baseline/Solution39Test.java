/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Given the following data set, create a program that sorts all employees by last name and prints them to the screen in a tabular format.
Constraint
Store the data using a list of maps.
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void sortArray() {
        Solution39 app = new Solution39();
        app.sortArray();
        String expected_answer = "Jackson";
        String actual_answer = app.employees.get(0).get("Last Name");
        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void getRowString() {
        Solution39 app = new Solution39();

        Map<String, String> john = new HashMap<String, String>();
        john.put("First Name", "John");
        john.put("Last Name", "Johnson");
        john.put("Position", "Manager");
        john.put("Separation Date", "2016-12-31");

        String row = app.getRowString(john);
        assertTrue(row.startsWith(" John"));

    }
}
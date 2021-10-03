/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
Constraint
Use a nested loop to complete this program.
Align each column within the table without using the tab character.
 */

package baseline;

public class Solution30 {
    public static void main(String[] args) {
        Solution30 app = new Solution30();
//        loop 1 through 12 and print a row for each number as the multiplier
        for (int i = 1; i <= 12; i++) {
            System.out.println(app.getRowString(i));
        }
    }

    public String getRowString(int multiplier) {
//        declare empty row string
        String rowString = "";
//        loop 1 through 12
        for (int i = 1; i <= 12; i++) {
//        concatenate the product each number and the multiplier to the string
            int product = i * multiplier;
            if (product >= 100)
                rowString += "  ";
            else if (product >= 10)
                rowString += "   ";
            else
                rowString += "    ";
            rowString += product;
        }
//        return the row string
        return rowString;
    }
}

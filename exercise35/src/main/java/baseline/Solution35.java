/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.
Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data structure, like an ArrayList.
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner input = new Scanner(System.in);

//    create list of names
    public ArrayList<String> names = new ArrayList<String>();

    public static void main(String[] args) {
        Solution35 app = new Solution35();
//        create variable to notify when names are done being entered
        boolean isDone = false;
//        loop until isDone is true
        while (!isDone) {
//        in each iteration, prompt for a name and insert into array
            System.out.print("Enter a name: ");
            String userInput = input.nextLine();
            if (userInput.length() > 0) {
                app.addName(userInput);
            } else {
//        if input is blank, break loop
                isDone = true;
            }
        }
        int winnerIndex = (int) Math.floor(Math.random() * app.names.size());
        String winner = app.names.get(winnerIndex);
        System.out.println("The winner is... " + winner + ".");
//        randomly select winner and print
    }

    public void addName(String name) {
//        add name to list
        names.add(name);
    }
}

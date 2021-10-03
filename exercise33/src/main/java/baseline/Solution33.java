/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Nader Fares
 */

/*
Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."
Constraint
The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list and select one at random.
 */

package baseline;

import java.util.Scanner;

public class Solution33 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Solution33 app = new Solution33();
//        create array of responses
        String[] responses = {"Yes", "No", "Maybe", "Ask again later."};
//        prompt user for question
        System.out.println("What's your question?");
        String question = input.nextLine();
//        output a random response from list
        System.out.println(app.getRandomResponse(responses));

    }

    public String getRandomResponse(String responses[]) {
        // generate a random number between 1 and 3
        int randomNumber = (int) Math.floor(Math.random() * 4);
        // get a random response from the list and return
        return responses[randomNumber];
    }
}

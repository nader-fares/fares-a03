package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution37 {
    private static final Scanner input = new Scanner(System.in);
    public static ArrayList<Character> letters = new ArrayList<Character>();
    public static ArrayList<Character> numbers = new ArrayList<Character>();
    public static ArrayList<Character> specials = new ArrayList<Character>();

    Solution37() {
        Character[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Character[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        Character[] spec = {'+', '-', '&', '|', '!', '(', ')', '{', '}', '[', ']', '^', '~', '*', '?', ':','"','\\'};
        letters.addAll(Arrays.asList(alpha));
        numbers.addAll(Arrays.asList(num));
        specials.addAll(Arrays.asList(spec));
    }

    public static void main(String[] args) {
        Solution37 app = new Solution37();

//        prompt user for min length, special characters, and numbers count
        System.out.print("What's the minimum length? ");
        int minLength = input.nextInt();

        System.out.print("How many special characters? ");
        int specialCharsCount = input.nextInt();

        System.out.print("How many numbers? ");
        int numCount = input.nextInt();

//        check if not enough room for letters
        int length = Math.max(minLength, 2 * (specialCharsCount + numCount));
//        call password generation method
        String password = app.generatePassword(length, specialCharsCount, numCount);

        System.out.println("Your password is " + password);
    }

    public String generatePassword(int length, int specCount, int numCount) {
//        generate letters string greater than or equal to minLength - specCount - numCount
        int lettersCount = length - specCount - numCount;
        String letters = "";
        String specs = "";
        String nums = "";
        for(int i = 0; i < lettersCount; i++)
            letters += getRandomValue(Solution37.letters);
        for(int i = 0; i < specCount; i++)
            specs += getRandomValue(Solution37.specials);
        for(int i = 0; i < numCount; i++)
            nums += getRandomValue(Solution37.numbers);


//        add nums and special chars
        return letters + specs + nums;
    }

    public char getRandomValue(ArrayList<Character> arrList) {
        // return a value between index 0 and arrayList length
        return arrList.get((int) Math.floor(Math.random() * arrList.size()));
    }
}

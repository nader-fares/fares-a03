package baseline;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution37 {
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

//        prompt user for min length, special characters, and numbers count
//        check if not enough room for letters
//        call password generation method
    }

    public String generatePassword(int minLength, int specCount, int numCount) {
//        generate letters string greater than or equal to minLength - specCount - numCount
//        add nums and special chars
    }

    public char getRandomValue(ArrayList arrList) {
        // return a value between index 0 and arrayList length
    }
}

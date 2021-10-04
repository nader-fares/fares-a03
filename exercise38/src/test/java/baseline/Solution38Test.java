package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void stringToArray() {
        Solution38 app = new Solution38();
        ArrayList<String> arr = app.stringToArray("1 2");
        String expected_answer = "2";
        String actual_answer = arr.get(1);
        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void arrayToString() {
        Solution38 app = new Solution38();

        ArrayList<String> arr = app.stringToArray("1 2");

        String expected_answer = "1 2";
        String actual_answer = app.arrayToString(arr);
        assertEquals(expected_answer, actual_answer);
    }
}
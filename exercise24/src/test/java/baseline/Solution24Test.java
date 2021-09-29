package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    public void test_anagram_checker() {
        Solution24 app = new Solution24();
        String firstString = new String("note");
        String secondString = new String("tone");

        boolean actual_answer = app.isAnagram(firstString, secondString);
        boolean expected_answer = true;

        assertEquals(expected_answer, actual_answer);
    }

}
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void promptNumber() {
        Solution28 app = new Solution28();
        int actual_answer = app.promptNumber();
        int expected_answer = 0;
        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void addToTotal() {
        Solution28 app = new Solution28();
        app.addToTotal(3);
        int actual_answer = app.getTotal();
        int expected_answer = 3;
        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void getTotal() {
        Solution28 app = new Solution28();
        int actual_answer = app.getTotal();
        int expected_answer = 0;
        assertEquals(expected_answer, actual_answer);
    }
}
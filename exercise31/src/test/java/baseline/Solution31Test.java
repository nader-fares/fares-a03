package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void promptNumber() {
        Solution31 app = new Solution31();

        int actual_answer = app.promptNumber("Enter an age:");
        int expected_answer = 0;

        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void calculateTargetHeartRate() {
        Solution31 app = new Solution31();

        int actual_answer = app.calculateTargetHeartRate(65, 22, 0.95);
        int expected_answer = 191;

        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void getTableRowString() {
        Solution31 app = new Solution31();

        String actual_answer = app.getTableRowString(0.95, 191);
        String expected_answer = String.format("%-10s | %-10s\n", "95%", "191 bpm");;

        assertEquals(expected_answer, actual_answer);
    }
}
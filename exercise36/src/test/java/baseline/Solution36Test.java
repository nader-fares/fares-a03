package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    @Test
    void promptMilliseconds() {
        Solution36 app = new Solution36();
        String actual_answer = app.promptMilliseconds(5);
        String expected_answer = "5";
        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void average() {
        Solution36 app = new Solution36();
        app.millisecondsList.add(5);
        app.millisecondsList.add(15);
        double expected_answer = 10;

        double actual_answer = app.average();

        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void min() {
        Solution36 app = new Solution36();
        app.millisecondsList.add(5);
        app.millisecondsList.add(15);
        double expected_answer = 5;

        double actual_answer = app.min();

        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void max() {
        Solution36 app = new Solution36();
        app.millisecondsList.add(5);
        app.millisecondsList.add(15);
        double expected_answer = 15;

        double actual_answer = app.max();

        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void std() {
        Solution36 app = new Solution36();
        app.millisecondsList.add(5);
        app.millisecondsList.add(15);
        double expected_answer = 5;

        double actual_answer = app.std();

        assertEquals(expected_answer, actual_answer);
    }
}
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void generateRandomNumber() {
        Solution32 app = new Solution32();

        app.generateRandomNumber(1);


        assertTrue(app.getRandomNumber() <= 10);
    }

    @Test
    void promptNumber() {
        Solution32 app = new Solution32();

        int actual_answer = app.promptNumber("Enter a number: ");
        int expected_answer = 0;

        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void getRandomNumber() {
        Solution32 app = new Solution32();

        app.generateRandomNumber(2);


        assertTrue(app.getRandomNumber() <= 100);
    }
}
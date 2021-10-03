package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInput() {
        Solution27 app = new Solution27();
        String actual_answer = app.validateInput("John", "Smith", "JS-3333", "12345");
        String expected_answer = "There were no errors found.";
        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void validateName() {
        Solution27 app = new Solution27();
        boolean actual_answer = app.validateName("J");
        boolean expected_answer = false;
        assertEquals(expected_answer, actual_answer);

    }

    @Test
    void validateNotEmpty() {
        Solution27 app = new Solution27();
        boolean actual_answer = app.validateNotEmpty("");
        boolean expected_answer = false;
        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void validateEmployeeID() {
        Solution27 app = new Solution27();
        boolean actual_answer = app.validateEmployeeID("JW-3213");
        boolean expected_answer = true;
        assertEquals(expected_answer, actual_answer);
    }

    @Test
    void validateZipCode() {
        Solution27 app = new Solution27();
        boolean actual_answer = app.validateZipCode("3312");
        boolean expected_answer = false;
        assertEquals(expected_answer, actual_answer);
    }
}
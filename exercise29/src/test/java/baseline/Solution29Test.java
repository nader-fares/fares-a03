package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void validateInput() {
        Solution29 app = new Solution29();
        boolean actual_answer = app.validateInput("3");
        boolean expected_answer = true;
        assertEquals(expected_answer, actual_answer);
    }
}
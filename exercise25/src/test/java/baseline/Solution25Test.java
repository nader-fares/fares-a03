package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator() {
        Solution25 app = new Solution25();
        String password = new String("1231232312");

        int actual_answer = app.passwordValidator(password);
        int expected_answer = 0;

        assertEquals(expected_answer, actual_answer);

    }
}
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void generatePassword() {
        Solution37 app = new Solution37();
        String password = app.generatePassword(10, 2, 2);

        assertTrue(password.length() == 10);
    }

    @Test
    void getRandomValue() {
        Solution37 app = new Solution37();

        ArrayList<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('b');
        Character val = app.getRandomValue(list);
        assertTrue(val == 'a' || val == 'b');
    }
}
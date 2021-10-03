package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    @Test
    void getRowString() {
        Solution30 app = new Solution30();
        String expected_output = "    1    2    3    4    5    6    7    8    9   10   11   12";
        String actual_output = app.getRowString(1);
        assertEquals(expected_output, actual_output);
    }
}
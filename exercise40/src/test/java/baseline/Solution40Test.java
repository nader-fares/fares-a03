package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {

    @Test
    void filterArray() {
    }

    @Test
    void getRowString() {
        Solution40 app = new Solution40();

        Map<String, String> john = new HashMap<String, String>();
        john.put("First Name", "John");
        john.put("Last Name", "Johnson");
        john.put("Position", "Manager");
        john.put("Separation Date", "2016-12-31");

        String row = app.getRowString(john);
        assertTrue(row.startsWith(" John"));
    }
}
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void addName() {
        Solution35 app = new Solution35();
        String name = "nader";
        app.addName(name);
        assertEquals(name, app.names.get(0));
    }
}
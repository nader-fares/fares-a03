package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void removeEmployee() {
        Solution34 app = new Solution34();
        app.removeEmployee("Jackie Jackson");

        assertTrue(app.employees.size() == 4);
    }

    @Test
    void printEmployees() {
        Solution34 app = new Solution34();
        app.printEmployees();

        assertTrue(app.employees.size() == 5);
    }
}
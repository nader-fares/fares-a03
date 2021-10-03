package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void getRandomResponse() {
        String[] responses = {"Yes", "No", "Maybe", "Ask again later."};
        Solution33 app = new Solution33();
        String response = app.getRandomResponse(responses);
        boolean includes = false;
        for (int i = 0; i < 4; i++) {
            if (responses[i].equals(response))
                includes = true;
        }
        assertTrue(includes);
    }
}
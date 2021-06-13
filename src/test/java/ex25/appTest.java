package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void passwordValidator_returns_1_when_very_weak() {
        app testApp = new app();
        int output = testApp.passwordValidator("12345");
        assertEquals(1, output);
    }

    @Test
    void passwordValidator_returns_2_when_weak() {
        app testApp = new app();
        int output = testApp.passwordValidator("abcdef");
        assertEquals(2, output);
    }

    @Test
    void passwordValidator_returns_3_when_strong() {
        app testApp = new app();
        int output = testApp.passwordValidator("abc123xyz");
        assertEquals(3, output);
    }

    @Test
    void passwordValidator_returns_4_when_very_strong() {
        app testApp = new app();
        int output = testApp.passwordValidator("1337h@xor!");
        assertEquals(4, output);
    }
}
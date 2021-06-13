package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void guessStatus_when_guess_is_too_low() {
        app testApp = new app();
        int output = app.guessStatus(5, 4);

        assertEquals(0, output);
    }

    @Test
    void guessStatus_when_guess_is_too_high() {
        app testApp = new app();
        int output = app.guessStatus(5, 6);

        assertEquals(1, output);
    }

    @Test
    void guessStatus_when_guess_is_right() {
        app testApp = new app();
        int output = app.guessStatus(5, 5);

        assertEquals(2, output);
    }
}
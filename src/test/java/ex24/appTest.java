package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void isAnagram_returns_true_when_anagram() {
        app testApp = new app();
        boolean output = testApp.isAnagram("note", "tone");
        assertTrue(output);
    }

    @Test
    void isAnagram_returns_true_when_anagram2() {
        app testApp = new app();
        boolean output = testApp.isAnagram("car", "car");
        assertTrue(output);
    }

    @Test
    void isAnagram_returns_false_when_nonanagram() {
        app testApp = new app();
        boolean output = testApp.isAnagram("Car", "Bar");
        assertFalse(output);
    }

    @Test
    void isAnagram_returns_false_when_nonanagram2() {
        app testApp = new app();
        boolean output = testApp.isAnagram("Helicopter", "Helicopters");
        assertFalse(output);
    }

}
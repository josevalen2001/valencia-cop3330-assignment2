package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void isNameValid_returns_true_when_valid() {
        app testApp = new app();
        boolean output = testApp.isNameValid("Jose");
        assertTrue(output);
    }

    @Test
    void isNameValid_returns_false_when_invalid() {
        app testApp = new app();
        boolean output = testApp.isNameValid("J");
        assertFalse(output);
    }

    @Test
    void isNameValid_returns_false_when_empty() {
        app testApp = new app();
        boolean output = testApp.isNameValid("");
        assertFalse(output);
    }

    @Test
    void isZipCodeValid_returns_true_when_valid() {
        app testApp = new app();
        boolean output = testApp.isZipCodeValid("12345");
        assertTrue(output);
    }

    @Test
    void isZipCodeValid_returns_false_when_invalid() {
        app testApp = new app();
        boolean output = testApp.isZipCodeValid("asc12");
        assertFalse(output);
    }

    @Test
    void isZipCodeValid_returns_false_when_invalid2() {
        app testApp = new app();
        boolean output = testApp.isZipCodeValid("123456");
        assertFalse(output);
    }

    @Test
    void isZipCodeValid_returns_false_when_empty() {
        app testApp = new app();
        boolean output = testApp.isZipCodeValid("");
        assertFalse(output);
    }


    @Test
    void isEmployeeIdValid_returns_true_when_valid() {
        app testApp = new app();
        boolean output = testApp.isEmployeeIdValid("ab-1234");
        assertTrue(output);
    }

    @Test
    void isEmployeeIdValid_returns_false_when_invalid() {
        app testApp = new app();
        boolean output = testApp.isEmployeeIdValid("ab12-1234asd");
        assertFalse(output);
    }

    @Test
    void isEmployeeIdValid_returns_false_when_empty() {
        app testApp = new app();
        boolean output = testApp.isEmployeeIdValid("");
        assertFalse(output);
    }
}
package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void sum_adds_up_correctly() {
        app testApp = new app();
        int[] testNumArray = {1, 2, 3, 4, 5};
        int output = testApp.sum(testNumArray);

        assertEquals(15, output);
    }

    @Test
    void sum_adds_up_correctly2() {
        app testApp = new app();
        int[] testNumArray = {6, 7, 8, 9, 10};
        int output = testApp.sum(testNumArray);

        assertEquals(40, output);
    }
}
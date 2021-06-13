package ex39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void sortArray_sorts_array_correctly() {
        String[] lastNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        String[] expected = {"Jackson", "Jacobson", "Johnson", "Michaelson", "Webber", "Xiong"};

        app testApp = new app();
        app.sortArray(lastNames);

        assertArrayEquals(lastNames, expected);
    }
}
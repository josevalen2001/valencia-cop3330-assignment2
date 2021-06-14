package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void getEvenNumbers_works_correctly() {
        app test=new app();

        int[] array={2, 5, 3, 6, 45, 76, 34, 56, 37, 100};
        int[] output=test.getEvenNumbers(array);
        int[] expected={2, 6, 76, 34, 56, 100};

        assertArrayEquals(expected, output);

    }
}
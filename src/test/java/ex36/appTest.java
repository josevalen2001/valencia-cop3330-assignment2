package ex36;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class appTest {

    @Test
    void findMin_works_correctly() {
        ArrayList<Integer> numbers=new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        app test = new app();
        int output = test.findMin(numbers);

        assertEquals(2, output);
    }

    @Test
    void findMax_works_correctly() {
        ArrayList<Integer> numbers=new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        app test = new app();
        int output = test.findMax(numbers);

        assertEquals(5, output);
    }

    @Test
    void findAverage_works_correctly() {
        ArrayList<Integer> numbers=new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        app test = new app();
        double output = test.findAverage(numbers);

        assertEquals(3.5, output);
    }

    @Test
    void findStandardDeviation_works_correctly() {
        ArrayList<Integer> numbers=new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        app test = new app();
        double output = test.findStandardDeviation(numbers);

        assertEquals(1.12, output);
    }
}
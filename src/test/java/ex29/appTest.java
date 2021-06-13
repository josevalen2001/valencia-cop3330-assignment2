package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void calculateYears_it_takes_to_double_investment() {
        app testApp = new app();
        double output = app.calculateYears(4);

        assertEquals(18.0, output);
    }

    @Test
    void calculateYears_it_takes_to_double_investment2() {
        app testApp = new app();
        double output = app.calculateYears(5);

        assertEquals(14.4, output);
    }
}
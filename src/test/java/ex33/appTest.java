package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void output_if_random_number_is_zero() {
        app test=new app();

        String[] choices={"Yes.","No.","Maybe.","Ask again later."};
        String output=test.output(choices, 0);

        assertEquals("Yes.", output);
    }

    @Test
    void output_if_random_number_is_one() {
        app test=new app();

        String[] choices={"Yes.","No.","Maybe.","Ask again later."};
        String output=test.output(choices, 1);

        assertEquals("No.", output);
    }

    @Test
    void output_if_random_number_is_two() {
        app test=new app();

        String[] choices={"Yes.","No.","Maybe.","Ask again later."};
        String output=test.output(choices, 2);

        assertEquals("Maybe.", output);
    }

    @Test
    void output_if_random_number_is_three() {
        app test=new app();

        String[] choices={"Yes.","No.","Maybe.","Ask again later."};
        String output=test.output(choices, 3);

        assertEquals("Ask again later.", output);
    }
}
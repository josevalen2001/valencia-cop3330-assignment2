package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void removeEmployee_If_removed_is_Chris() {
        app test = new app();
        String[] employees={"John Smith","Jackie Jackson","Chris Johns","Amanda Cullen","Jeremy Goodwin"};
        String[] expected={"John Smith","Jackie Jackson","Amanda Cullen","Jeremy Goodwin"};

        String[] output=test.removeEmployee(employees, "Chris Johns");

        assertArrayEquals(expected, output);
    }
}
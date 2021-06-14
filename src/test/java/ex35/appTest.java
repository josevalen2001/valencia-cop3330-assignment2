package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void getRandomPerson_will_remove_the_correct_person() {
        app test=new app();

        ArrayList<String> peopleList = new ArrayList<String>();
        peopleList.add("Jose");
        peopleList.add("Juan");
        peopleList.add("Adri");
        peopleList.add("Loyda");
        peopleList.add("Daniel");

        String output=test.getRandomPerson(peopleList, 1);

        assertEquals(output, "Juan");
    }
}
package pl.marekkalkowski;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest {

    private List<Human> humans = new ArrayList<>();


    @Test
    @DisplayName("Should return true if second name will be first")
    void sortByNameCorectlyAsc() {

        //arrange

        humans.add(new Human("Marek", 12));
        humans.add(new Human("Adam", 23));

        //act
        List<Human> result = new Human().sort(humans);

        //assert
        assertEquals( true,result.get(0).getName().equals("Adam"));
    }

    @Test
    @DisplayName("Should return true if second name will be first")
    void sortByNameUncorectlyASC() {

        //arrange

        humans.add(new Human("Marek", 12));
        humans.add(new Human("Adam", 23));

        //act
        List<Human> result = new Human().sort(humans);

        //assert
        assertEquals( false,result.get(0).getName().equals("Marek"));
    }
}
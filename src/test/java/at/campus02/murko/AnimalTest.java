package at.campus02.murko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal = new Animal();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        animal.setAge(20);
        animal.setName("Mia");
        animal.setSpecies("Katze");
        animal.giveAnimalLoud();
        animal.setAnimalLoud("Miau");

    }

    @Test
    void giveAnimalLoudTest() {
        Assertions.assertEquals(animal.getAnimalLoud(),"Miau");
    }

    @Test
    void getNameAndAgeTest() {
        Assertions.assertEquals(String.format("%s %d",animal.getName(),animal.getAge()),"Mia 20");

    }

    @Test
    void ageCategoryTest() {
        Assertions.assertEquals(animal.getSpecies(),"Katze");
    }


}
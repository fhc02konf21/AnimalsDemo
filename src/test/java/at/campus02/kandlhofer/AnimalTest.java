package at.campus02.kandlhofer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    private Animal dog;
    private Animal cat;
    private Animal lion;

    /**
     * Vor jedem einzelnen TestCase wird diese Methode aufgerufen
     * So stehen im die selben Werte (Objekte) für die Tests zur Verfügung
     */
    @BeforeEach
    void setUp() {
        dog = new Animal("Bello", 2, "Dog", "Wuff");
        cat = new Animal("Kitty", 5, "Cat", "Miau");
        lion = new Animal("Simba", 0, "Lion", "Roarr");
    }

    @Test
    @DisplayName("Teste den Konstruktor, ob alle Attribute korrekt gesetzt werden")
    void constructor() {
        Animal animal = new Animal("name", 3, "species", "animalLoud");
        assertEquals("name", animal.getName());
        assertEquals(3, animal.getAge());
        assertEquals("species", animal.getSpecies());
        assertEquals("animalLoud", animal.getAnimalLoud());
    }

    @Test
    @DisplayName("Wenn age < 0, dann wird age auf 0 gesetzt")
    void testAgeHasToBeGreaterThan0() {
        dog.setAge(-3);
        assertEquals(0, dog.getAge());

        Animal animal = new Animal("name", -4, "species", "animalLoud");
        assertEquals(0, animal.getAge());
    }

    @Test
    @DisplayName("Teste den Laut des Tieres")
    void giveAnimalLoud() {
        assertEquals("Wuff", dog.giveAnimalLoud());
        assertEquals("Miau", cat.giveAnimalLoud());
        assertEquals("Roarr", lion.giveAnimalLoud());
    }

    @Test
    void getNameAndAge() {
        assertEquals("Name: Bello; Alter: 2", dog.getNameAndAge());
        assertEquals("Name: Kitty; Alter: 5", cat.getNameAndAge());
        assertEquals("Name: Simba; Alter: 0", lion.getNameAndAge());
    }

    @Test
    void ageCategory() {
        assertEquals("baby animal", dog.ageCategory());
        assertEquals("old animal", cat.ageCategory());
        assertEquals("baby animal", lion.ageCategory());

        dog.setAge(3);
        assertEquals("young animal", dog.ageCategory());
    }
}

package at.campus02.kandlhofer;

import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private String species;
    private String animalLoud;

    // Konstruktor mit allen 4 Attributen als Input Parameter
    public Animal(String name, int age, String species, String animalLoud) {
        this.name = name;
        setAge(age); // damit das age nur an einer Stelle geprüft werden muss, wird hier der setter aufgerufen
        this.species = species;
        this.animalLoud = animalLoud;
    }

    // getter und setter (ALT + Einfg)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // age kann nicht kleiner 0 sein
    public void setAge(int age) {
        this.age = age < 0 ? 0 : age; // wenn age kleiner 0, setze 0 sonst age
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    // equals und hashcode (ALT + Einfg)
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
               Objects.equals(name, animal.name) &&
               Objects.equals(species, animal.species) &&
               Objects.equals(animalLoud, animal.animalLoud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, species, animalLoud);
    }

    // toString (ALT + Einfg)

    @Override
    public String toString() {
        return "Animal{" +
               "name='" +
               name +
               '\'' +
               ", age=" +
               age +
               ", species='" +
               species +
               '\'' +
               ", animalLoud='" +
               animalLoud +
               '\'' +
               '}';
    }

    // Methods
    public String giveAnimalLoud() {
        // animalLoud kann direkt retourniert werden - 2 Möglichkeiten
        // return this.animalLoud;
        return getAnimalLoud();
    }

    public String getNameAndAge() {
        return "Name: " + name + "; Alter: " + age;
    }

    public String ageCategory() {
        if (age > 4) {
            return "old animal";
        }
        if (age > 2) {
            return "young animal";
        }
        return "baby animal";
    }
}

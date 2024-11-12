package zoo;

import exceptions.ZooFullException;
import exceptions.InvalidAgeException;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private final int maxAnimals = 3;  // Max animals the zoo can hold

    public void addAnimal(Animal animal) throws InvalidAgeException, ZooFullException {
        // Remove check for "full zoo" from here
        if (animals.size() >= maxAnimals) {
            throw new ZooFullException("Le zoo est plein.");
        }
        animals.add(animal);  // Add the animal to the zoo
    }

    public int getNumberOfAnimals() {
        return animals.size();  // Return the number of animals in the zoo
    }
}

package main;

import zoo.Zoo;
import zoo.Animal;
import exceptions.InvalidAgeException;
import exceptions.ZooFullException;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();  // Create a new zoo

        try {
            // Add animals to the zoo
            Animal animal1 = new Animal("Lion", 5);
            zoo.addAnimal(animal1);
            System.out.println("Nombre d'animaux après ajout: " + zoo.getNumberOfAnimals());

            Animal animal2 = new Animal("Elephant", 10);
            zoo.addAnimal(animal2);
            System.out.println("Nombre d'animaux après ajout: " + zoo.getNumberOfAnimals());

            // Add the third animal
            Animal animal3 = new Animal("Monkey", 3);
            zoo.addAnimal(animal3);
            System.out.println("Nombre d'animaux après ajout: " + zoo.getNumberOfAnimals());

            // Attempt to add a fourth animal (this will throw ZooFullException)
            Animal animal4 = new Animal("Tiger", 4);  // This should throw the ZooFullException
            zoo.addAnimal(animal4);
        } catch (InvalidAgeException e) {
            System.out.println("Erreur: " + e.getMessage());
        } catch (ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}

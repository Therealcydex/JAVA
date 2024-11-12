package zoo;

import exceptions.InvalidAgeException;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) throws InvalidAgeException {
        this.name = name;
        setAge(age);  // Validate age during instantiation
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }
}

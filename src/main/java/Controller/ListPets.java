package Controller;

import Model.Pet;

import java.util.ArrayList;

public class ListPets {
    ArrayList<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public Pet getPet(String name) {
        Pet resultPet = null;
        for (Pet el : pets) {
            if (el.getName().equals(name))
                resultPet = el;
        }
        return resultPet;
    }

    public void getListPets() {
        pets.forEach(System.out::println);
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "ListPets{" +
                pets +
                '}';
    }
}

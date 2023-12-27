package Controller;

import Model.Pet;

import java.util.ArrayList;

public class ListPets {
    ArrayList<Pet> pets;

    public ListPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    public void addPet(Pet pet){
        pets.add(pet);
    }
    public Pet getPet(String name){
        Pet resultPet=null;
        for (Pet el:pets) {
            if (el.getName().equals(name))
                     resultPet=el;
        }
        return resultPet;
    }
}

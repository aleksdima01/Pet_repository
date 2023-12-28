package Controller;

import Model.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class ListPets {
    ArrayList<Pet> pets = new ArrayList<>();
Scanner scanner=new Scanner(System.in);
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
        int count =1;
        for (Pet el:pets) {
            System.out.println(count+"."+el);
            count++;
        }
        System.out.println(" ");
    }
    public String getCommand(Integer num){
        return pets.get(num-1).getCommands();
    }
    public String getModifyCommand(Integer num,String command){
        String commands=pets.get(num-1).getCommands();
        String result=commands+","+command;
        pets.get(num-1).setCommands(result);
        return pets.get(num-1).getCommands();
    }
    public Integer getSize(){
        return pets.size();
    }

    @Override
    public String toString() {
        return "ListPets{" +
                pets +
                '}';
    }
}

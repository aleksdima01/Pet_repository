package Controller;

import Model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class AddingPets {
    String name;
    Date formatbirthDate;
    String birthDate;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    String commands;
    static Scanner scanner = new Scanner(System.in);
    ListPets listPets = new ListPets();

    public void addPet() {
        System.out.print("Введите имя животного:");
        name = scanner.nextLine();
        System.out.print("Введите дату рождения животного в формате YYYY-MM-DD:");
        birthDate = scanner.nextLine();
        boolean b = true;
        while (b) {
            try {
                formatbirthDate = formatter.parse(birthDate);
                System.out.println(formatter.format(formatbirthDate));
                System.out.println();
                b = false;
            } catch (ParseException e) {
                System.out.println(e.getMessage());
                System.out.println("Повторите ввод даты в правильном формате!");
                birthDate = scanner.nextLine();
            }
        }
        System.out.print("Введите команды для животного:");
        commands = scanner.nextLine();
        System.out.println("Выберете,какое животное хотите создать:");
        System.out.println("1 - Собака");
        System.out.println("2 - Кошка");
        System.out.println("3 - Хомяк");
        System.out.println("4 - Лошадь");
        System.out.println("5 - Верблюд");
        System.out.println("6 - Осёл");
        while (!scanner.hasNextDouble() && !scanner.hasNextInt()) {
            System.out.println("Введите число!");
            scanner.nextLine();
        }
        int no = Integer.parseInt(scanner.nextLine());
        System.out.println(" ");
        switch (no) {
            case 1:
                System.out.println("Выбрано создание собаки!");
                System.out.println(" ");
                Dog dog = new Dog(name, formatbirthDate, commands);
                listPets.addPet(dog);
                break;
            case 2:
                System.out.println("Выбрано создание кошки!");
                System.out.println(" ");
                Cat cat = new Cat(name, formatbirthDate, commands);
                listPets.addPet(cat);
                break;
            case 3:
                System.out.println("Выбрано создание хомяка!");
                System.out.println(" ");
                Hamster hamster = new Hamster(name, formatbirthDate, commands);
                listPets.addPet(hamster);
                break;
            case 4:
                System.out.println("Выбрано создание лошади!");
                System.out.println(" ");
                Horses horse = new Horses(name, formatbirthDate, commands);
                listPets.addPet(horse);
                break;
            case 5:
                System.out.println("Выбрано создание верблюда!");
                System.out.println(" ");
                Camels camel = new Camels(name, formatbirthDate, commands);
                listPets.addPet(camel);
                break;
            case 6:
                System.out.println("Выбрано создание осла!");
                System.out.println(" ");
                Donkeys donkey = new Donkeys(name, formatbirthDate, commands);
                listPets.addPet(donkey);
                break;
        }
    }

    public ListPets getListPets() {
        return listPets;
    }

    public void printListPets() {
        listPets.getListPets();
    }
}

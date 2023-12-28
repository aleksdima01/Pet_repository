package View;

import Controller.AddingPets;
import Controller.ListPets;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    AddingPets addingPets = new AddingPets();

    public void menu() {
        boolean f = true;
        while (f) {
            System.out.println("Укажите желаемое действие с реестром животных:");
            System.out.println("1 - Завести новое животное");
            System.out.println("2 - Увидеть список команд который выполняет животное");
            System.out.println("3 - Обучить животное новым командам");
            System.out.println("4 - Показать весь реестр животных");
            System.out.println("0 - Завершение работы приложения");
            while (!scanner.hasNextDouble() && !scanner.hasNextInt()) {
                System.out.println("Введите число!");
                scanner.nextLine();
            }
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println(" ");
            switch (no) {
                case 1:
                    System.out.println("Выбрано заведение нового животного!");
                    addingPets.addPet();
                    break;
                case 2:
                    System.out.println("Показ списка команд!");
                    // findMin(myList);
                    break;
                case 3:
                    System.out.println("Выбрано обучение новым командам!");
                    // findMax(myList);
                    break;
                case 4:
                    System.out.println("Выбран показ реестра животных!");
                    if (addingPets.getListPets() == null)
                        System.out.println("Реестр животных пока пуст!");
                    else
                        addingPets.printListPets();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер действия,\nповторите попытку ввода.");
                    break;
            }
        }
    }
}


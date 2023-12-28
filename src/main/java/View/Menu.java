package View;

import Controller.AddingPets;
import Controller.ListPets;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    AddingPets addingPets = new AddingPets();

    public void menu() {
        boolean f = true;
        while (f) {
            System.out.println("Укажите желаемое действие с реестром животных:");
            System.out.println("1 - Завести новое животное");
            System.out.println("2 - Увидеть список команд которые выполняет животное");
            System.out.println("3 - Обучить животное новым командам");
            System.out.println("4 - Показать весь реестр животных");
            System.out.println("0 - Завершение работы приложения");
            scanner.useLocale(Locale.US);
            while (!scanner.hasNextDouble() && !scanner.hasNextInt()) {
                System.out.println("Введите число!");
                scanner.nextLine();

            }
            int no = Integer.parseInt(scanner.nextLine());
            int num = 0;
            System.out.println(" ");
            switch (no) {
                case 1:
                    System.out.println("Выбрано заведение нового животного!");
                    addingPets.addPet();
                    break;
                case 2:
                    System.out.println("Выбран показ списка команд!");
                    if (addingPets.getListPets() == null || addingPets.getListPets().getSize() == 0) {
                        System.out.println("Реестр животных пока пуст!");
                        System.out.println(" ");
                    } else {
                        addingPets.printListPets();
                        System.out.println("Выберете номер животного из списка:");

                        while (!scanner.hasNextDouble() && !scanner.hasNextInt()) {
                            System.out.println("Введите число!");
                            scanner.nextLine();
                        }
                        num = Integer.parseInt(scanner.nextLine());
                        while (num > addingPets.getListPets().getSize()||num<1) {
                            System.out.println("Неправильно введен номер. Повторите ввод:");
                            num = Integer.parseInt(scanner.nextLine());
                        }
                        addingPets.getPetCommands(num);
                    }
                    break;
                case 3:
                    System.out.println("Выбрано обучение новым командам!");
                    if (addingPets.getListPets() == null || addingPets.getListPets().getSize() == 0) {
                        System.out.println("Реестр животных пока пуст!");
                        System.out.println(" ");
                    } else {
                        addingPets.printListPets();
                        System.out.println("Выберете номер животного из списка:");

                        while (!scanner.hasNextDouble() && !scanner.hasNextInt()) {
                            System.out.println("Введите число!");
                            scanner.nextLine();
                        }
                        num = Integer.parseInt(scanner.nextLine());
                        while (num > addingPets.getListPets().getSize()||num<1) {
                            System.out.println("Неправильно введен номер. Повторите ввод:");
                            num = Integer.parseInt(scanner.nextLine());
                        }
                        System.out.println("Введите новые команды:");
                        String newCommands = scanner.nextLine();
                        addingPets.addPetCommands(num, newCommands);
                    }
                    break;
                case 4:
                    System.out.println("Выбран показ реестра животных!");
                    if (addingPets.getListPets() == null || addingPets.getListPets().getSize() == 0) {
                        System.out.println("Реестр животных пока пуст!");
                        System.out.println(" ");
                    } else
                        addingPets.printListPets();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер действия,\nповторите попытку ввода.");
                    System.out.println(" ");
                    break;
            }
        }
    }
}


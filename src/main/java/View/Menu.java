package View;

import Controller.PetsController;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    PetsController petsController = new PetsController();
    int num = 0;
    int no = 0;

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
            boolean d = true;
            while (d) {
                try {
                    no = Integer.parseInt(scanner.nextLine());
                    d = false;
                } catch (NumberFormatException e) {
                    System.out.println("Введены неправильные данные. Повторите ввод!");
                    d = true;
                }
            }
            System.out.println(" ");
            switch (no) {
                case 1:
                    System.out.println("Выбрано заведение нового животного!");
                    petsController.addPet();
                    break;
                case 2:
                    System.out.println("Выбран показ списка команд!");
                    if (petsController.getListPets() == null || petsController.getListPets().getSize() == 0) {
                        System.out.println("Реестр животных пока пуст!");
                        System.out.println(" ");
                    } else {
                        check();
                        petsController.getPetCommands(num);
                    }
                    break;
                case 3:
                    System.out.println("Выбрано обучение новым командам!");
                    if (petsController.getListPets() == null || petsController.getListPets().getSize() == 0) {
                        System.out.println("Реестр животных пока пуст!");
                        System.out.println(" ");
                    } else {
                        check();
                        System.out.println("Введите новые команды:");
                        String newCommands = scanner.nextLine();
                        petsController.addPetCommands(num, newCommands);
                    }
                    break;
                case 4:
                    System.out.println("Выбран показ реестра животных!");
                    if (petsController.getListPets() == null || petsController.getListPets().getSize() == 0) {
                        System.out.println("Реестр животных пока пуст!");
                        System.out.println(" ");
                    } else
                        petsController.printListPets();
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

    public void check() {
        petsController.printListPets();
        System.out.println("Выберете номер животного из списка:");
        boolean c = true;
        while (c) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                c = false;
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Введены неправильные данные. Повторите ввод!");
                c = true;
            }
        }
        if (num > petsController.getListPets().getSize() || num < 1) {
            c = true;
            while (c) {
                while (num > petsController.getListPets().getSize() || num < 1) {
                    System.out.println("Неправильно введен номер. Повторите ввод:");
                    try {
                        num = Integer.parseInt(scanner.nextLine());
                        c = false;
                    } catch (NumberFormatException e) {
                        System.out.println("Введены неправильные данные. Повторите ввод!");
                        c = true;
                    }
                }
            }
        }
    }
}


package View;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean f = true;
        while (f) {
            System.out.println("Укажите желаемое действие с животными");
            System.out.println("1 - Завести новое животное");
            System.out.println("2 - Увидеть список команд который выполняет животное");
            System.out.println("3 - Обучить животное новым командам");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println(" ");
            switch (no) {
                case 1:
                    System.out.println("Выбрано заведение нового животного!");
                    //deleting(myList);
                    break;
                case 2:
                    System.out.println("Показ списка команд!");
                    // findMin(myList);
                    break;
                case 3:
                    System.out.println("Выбрано обучение новым командам!");
                    // findMax(myList);
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


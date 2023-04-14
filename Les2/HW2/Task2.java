import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
/*
2. Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
*/
    public static void main(String[] args) {
        catchRes();
    }

    public static void catchRes() throws ArithmeticException {
        try {
            int [] intArray = new int [] {8, 35, 4, 8, 99, 10, 14, 18, 204, 5}; // необходимо объявить массив intArray с количеством элементов не менее 9
            int d = enterData();
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

// Создал метод по типу задания 1 для ввода элемента d, чтобы его определял пользователь
    public static int enterData () {
        Scanner enterData = new Scanner(System.in);
        System.out.println("Enter divider:");
        try {
            int number = enterData.nextInt();
            enterData.close();
            return number;
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong value!");
            return enterData();
        }
    }
}

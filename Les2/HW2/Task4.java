import java.util.Scanner;

public class Task4 {

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

public static void main(String[] args) {
    enterData();
}

public static void enterData () throws RuntimeException {
    Scanner enterData = new Scanner(System.in);
    System.out.println("Введите строку и нажмите Enter:");
    String data = enterData.nextLine();
    enterData.close();
    if (data!="") {
        System.out.println("Вот Ваша строка: " + data);
    }
        else {
            throw new RuntimeException("Строка не должна быть пустой!");
        }
    }
}
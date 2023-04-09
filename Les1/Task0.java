// Написать метод, который принимает на вход массив
// и возвращает длинну массива или -1, если длина
// меньше определенного минимума

public class Task0 {
    static int arrayLength(int[] array) {
        if (array.length < 2) {
            return -1;
        
        }
        return array.length;
    }

    public static void main(String[] args) {
        int[] array = {1};
        int length = arrayLength(array);
        if (length < 0) {
            System.out.println("Length of array less then minimum");
        }
        else {
            System.out.println("Length of array: " + length);
        }
    }
}

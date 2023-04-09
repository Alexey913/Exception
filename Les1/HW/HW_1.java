package HW;
/*
1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */

public class HW_1 {
    public static void main(String[] args) {
        division(10, 0); // ArithmeticException
        int[] array = new int[10];
        arrayElement(array, 400); // ArrayIndexOutOfBoundsException
        String line = null;
        stringLength(line); // NullPointerException
        // получили 3 типа разных исключений
    }

    public static Integer division(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    public static int arrayElement(int[] array, int index) {
        int result = array[index];
        return result;
    }

    public static int stringLength (String line) {
        int length = line.length();
        return length;
    }

}

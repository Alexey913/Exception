package HW;
/*
* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class HW_3 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {9, 8, 6, 5, 6};
        int[] arr2 = new int[] {-1, 2, 0, 3, 7};
        sumOfArrays(arr1, arr2);
    }

    public static int[] sumOfArrays(int[] array1, int[] array2) throws RuntimeException {
        int length = array1.length;
        int [] resultArray = new int [length];
        if (length != array2.length) {
            throw new RuntimeException("Array lengths are not equal!");
        }
        else {
            for (int i = 0; i < length; i++) {
                if (array2[i] == 0) {
                    throw new RuntimeException("Division by zero is not supported! (Element[" + i + "] equals 0)");
                }
                resultArray[i] = array1[i] / array2[i];
            }
            for (int i : resultArray) {
                System.out.print(i + " ");
            }
        }
        return resultArray;
    }
}

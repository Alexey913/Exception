package HW;
/*
2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class HW_2 {

    public static void main(String[] args) {
        int[] arr1 = new int[] {9, 8, 6, 5};
        int[] arr2 = new int[] {-1, 2, 4, 3, 7};
        sumOfArrays(arr1, arr2);
    }

    public static int[] sumOfArrays(int[] array1, int[] array2) {
        int length = array1.length;
        int [] sumArray = new int [length];
        if (length != array2.length) {
            System.out.println("Array lengths are not equal!");
            return null;
        }
        else {
            for (int i = 0; i < length; i++) {
                sumArray[i] = array1[i] + array2[i];
            }
            for (int i : sumArray) {
                System.out.print(i + " ");
            }
        }
        return sumArray;
    }
}
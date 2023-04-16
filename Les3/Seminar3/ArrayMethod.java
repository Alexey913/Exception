/*
Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось
(например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException
с детализацией, в какой именно ячейке лежат неверные данные.
В методе main() вызвать полученный метод,
обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
 */

public class ArrayMethod {
    
    public static int sumElementsArray (String[][] inputArray) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (Check.check(inputArray)) {
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    try {
                        int element = Integer.parseInt(inputArray[i][j]);
                        sum+=element;
                    }
                    catch (Exception e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        else {
            throw new MyArraySizeException("Невреный размер массива!");
        }
        return sum;
    }
}
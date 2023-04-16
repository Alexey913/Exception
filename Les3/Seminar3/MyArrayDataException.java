public class MyArrayDataException extends Exception{
    public MyArrayDataException (int i, int j) {
        super("Ошибка данных в элементе [" + i + ", " + j + "]");
    }
}
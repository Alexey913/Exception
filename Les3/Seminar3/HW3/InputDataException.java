package HW3;

public class InputDataException extends IllegalArgumentException{
    public static final int QUANTITY_PARAMETERS = 6;
    public InputDataException (String message, int quantity_args) {
        super(message + "Вы ввели " + quantity_args + " элементов. Необходим ввод " + QUANTITY_PARAMETERS + " элементов\n");
    }
}
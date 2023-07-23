package HW3;

public class Splitter{
    public static final int QUANTITY_PARAMETERS = 6;
    private String data;

    public Splitter(String data) {
        this.data = data;
    }

    public String[] spliting() throws InputDataException {
        String[] value = this.data.split(" ");
        if (this.checkInput(value)) {
            return value;
        }
        else {
            throw new InputDataException("Неверный формат ввода!\n", value.length);
        }
    }

    private boolean checkInput(String[] data) {
        if (data.length == QUANTITY_PARAMETERS){
            return true;
        }
        return false;
    }
}
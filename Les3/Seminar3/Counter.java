import java.io.IOException;

public class Counter implements AutoCloseable {
    /*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке
try-with-resources.
Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод
для проверки, закрыт ли ресурс.
При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
     */

    private int value;
    private boolean closer;

    public Counter() {
        this.value = 0;
    }

    public int add(int value) throws IOException {
        if (closer) {
            throw new IOException ("Counter is not found");
        }
        else {
            value ++;
        }
        return value;
    }

    @Override
    public void close() throws Exception {
        this.closer = true;
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

    public boolean checkingClose() {
        return closer;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

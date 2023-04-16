    /*
Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
Создайте класс исключений, которое будет возникать при обращении к пустому
элементу в массиве ссылочного типа. Исключение должно отображать понятное для
пользователя сообщение об ошибке
Создайте класс исключения, которое будет возникать при попытке открыть
несуществующий файл. Исключение должно отображать понятное для пользователя
сообщение об ошибке.
     */
public class NullExeception extends NullPointerException{
    public NullExeception() {
        super("Элемент массива равен null");
    }

    public NullExeception(String s) {
        super(s);
    }
}

/*
Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
(либо HashMap, если студенты с ним знакомы).
В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
заменить его на соответствующее число.Если на каком-то месте встречается символ,
отличный от числа или ?, бросить подходящее исключение.
Записать в тот же файл данные с замененными символами ?
*/

package Les2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("C:/Alex/GB/Except/Les2/fileForTask3.txt")) {
            String line1 = "Анна=4\n";
            writer.write(line1);
            String line2 = "Елена=5\n";
            writer.write(line2);
            String line3 = "Марина=+\n";
            writer.write(line3);
            String line4 = "Владимир=?\n";
            writer.write(line4);
            String line5 = "Константин=?\n";
            writer.write(line5);
            String line6 = "Иван=4\n";
            writer.write(line6);
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Map<String, String> readList = new HashMap<>();

        try (FileReader fr = new FileReader("C:/Alex/GB/Except/Les2/fileForTask3.txt")) {
            Scanner data = new Scanner(fr);
            while (data.hasNextLine()) {
                String str = data.nextLine();
                String[] value = str.split("=");
                checkAndAdd(value[0], value[1], readList);
            }
            data.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter("C:/Alex/GB/Except/Les2/fileForTask3.txt", true)) {
            for (var el : readList.entrySet()) {
                writer.write(el.getKey() + "=" + el.getValue() + "\n");
            }
            writer.flush();
            writer.close();
        }

        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Map checkAndAdd(String name, String quantityLiters, Map<String, String> list) {
        if (quantityLiters.equals("?")) {
            quantityLiters = Integer.toString(name.length());
        }
        try {
            Integer.parseInt(quantityLiters);
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод!");
        }
        finally {
            list.put(name, quantityLiters);
        }
        return list;
    }
}

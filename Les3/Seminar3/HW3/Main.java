package HW3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final int QUANTITY_PARAMETERS = 6;

    public static void main(String[] args) throws IOException {
        String[] user = getInfo();
        fileWrite(user);
    }

    public static String[] getInfo() {
        System.out.print(
                "Введите через пробел в произвольном порядке\n" +
                        "- Фамилия Имя Отчество\n" +
                        "- дата рождения(dd.mm.yyyy)\n" +
                        "- номер телефона(только цифры)\n" +
                        "- пол(символ латиницей f или m):\n");
        String encoding = System.getProperty("consle.encoding", "cp866");
        Scanner sc = new Scanner(System.in, encoding);
        String infoString = sc.nextLine();
        Splitter spliter = new Splitter(infoString);
        sc.close();
        try {
            String[] parametres = spliter.spliting();
            return parametres;
        } catch (InputDataException e) {
            System.out.print(e);
            String[] parametres = new String[QUANTITY_PARAMETERS];
            return parametres;
        }
    }

    public static String[] getFio(String[] info) {
        String temp = "";
        for (int i = 0; i < info.length; i++) {
            if (info[i].matches("[a-zA-Zа-яА-Я]+") && info[i].length() > 1) {
                temp = temp + info[i] + " ";
            }
        }
        String[] fio = temp.split(" ");
        if (temp == "" || fio.length != 3) {
            throw new IllegalArgumentException("Неверно введены Фамилия Имя Отчество!");
        }
        return fio;
    }

    public static Long getPhone(String[] info) {
        Long number = null;
        for (int i = 0; i < info.length; i++) {
            if (info[i].matches("[\\d]+") && info[i].length() > 1) {
                number = Long.parseLong(info[i]);
            }
        }
        if (number == null) {
            throw new IllegalArgumentException("Неверно введен номер телефона!");
        }
        return number;
    }

    public static Birthday getBirthday(String[] info) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < info.length; i++) {
            Birthday temp = new Birthday(info[i]);
            if (temp.isDate()) {
                index = i;
                count++;
            }
        }
        if (count == 1) {
            return new Birthday(info[index]);
        } else {
            throw new IllegalArgumentException("Неверно введена дата рождения!");
        }
    }

    private static char getGender(String[] info) {
        char gend = Character.MIN_VALUE;
        for (int i = 0; i < info.length; i++) {
            if (info[i].length() == 1 && (info[i].contains("f") || info[i].contains("m"))) {
                gend = info[i].charAt(0);
            }
        }
        if (gend == Character.MIN_VALUE) {
            throw new IllegalArgumentException("Неверно введен пол! Необходим ввод 'f' или 'm'");
        }
        return gend;
    }

    public static void fileWrite(String[] info) throws IOException {
        User new_user = new User(getFio(info), getBirthday(info), getPhone(info), getGender(info));
        FileWriter fw = new FileWriter(String.format("%s.txt", new_user.getSurname()), true);
        fw.write(String.format("%s", new_user));
        fw.append('\n');
        fw.close();
    }
}
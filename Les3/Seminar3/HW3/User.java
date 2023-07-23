package HW3;

public class User {

    private String surname;
    private String name;
    private String patronymic;
    private Birthday birthday;
    private long phone;
    private char gender;

    public User(String[] fio, Birthday birthday, long phone, char gender) {
        this.surname = createSurname(fio);
        this.name = createName(fio);
        this.patronymic = createPatronymic(fio);
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    private String createSurname(String[] fio) {
        if (fio[2].endsWith("вич") || fio[2].endsWith("вна")) {
            this.surname = fio[0];
        } else if (fio[1].endsWith("вич") || fio[1].endsWith("вна")) {
            this.surname = fio[2];
        } else {
            this.surname = fio[1];
        }
        return this.surname;
    }

    private String createName(String[] fio) {
        if (fio[2].endsWith("вич") || fio[2].endsWith("вна")) {
            this.name = fio[1];
        } else if (fio[1].endsWith("вич") || fio[1].endsWith("вна")) {
            this.name = fio[0];
        } else {
            this.name = fio[2];
        }
        return this.name;
    }

    private String createPatronymic(String[] fio) {
        if (fio[2].endsWith("вич") || fio[2].endsWith("вна")) {
            this.patronymic = fio[2];
        } else if (fio[1].endsWith("вич") || fio[1].endsWith("вна")) {
            this.patronymic = fio[1];
        } else {
            this.patronymic = fio[0];
        }
        return this.patronymic;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        String gend = "мужской";
        if (this.gender == 'f') {
            gend = "женский";
        }
        return "Пользователь: " + this.surname + " " + this.name + " " + this.patronymic +
                "\n\tДата рождения - " + this.birthday +
                " | Пол - " + gend;
    }
}

package HW3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Birthday {
    private String birthday;

    public Birthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        if (isDate()) {
            return birthday;
        } else {
            throw new IllegalArgumentException("Неверный формат даты рождения!");
        }
    }

    public boolean isDate() {
        Date nowDate = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        Date parsingDate;
        try {
            parsingDate = ft.parse(this.birthday);
            if (parsingDate.after(nowDate)) {
                throw new RuntimeException("Дата рождения не может быть позже текущей - " + nowDate);
            } else if ((this.birthday).split("[.]")[2].length() != 4 ||
                    (this.birthday).split("[.]")[1].length() != 2 ||
                    (this.birthday).split("[.]")[0].length() != 2) {
                throw new RuntimeException("Дата должна быть введена в формате dd.MM.YYYY!");
            }

        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.birthday;
    }
}
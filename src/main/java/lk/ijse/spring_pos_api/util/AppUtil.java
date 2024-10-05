package lk.ijse.spring_pos_api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppUtil {
    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }
}

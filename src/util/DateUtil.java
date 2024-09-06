package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    // Formata a data no padrão dd/MM/yyyy
    public static String formatDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }

    // Verifica se uma data é anterior a outra
    public static boolean isBefore(Date date1, Date date2) {
        return date1.before(date2);
    }
}

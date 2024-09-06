package util;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtil {

    // Formata o valor para o padrão monetário brasileiro
    public static String formatToBRL(double value) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatter.format(value);
    }
}


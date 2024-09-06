package util;

public class ValidatorUtil {

    // Valida CPF
    public static boolean isValidCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        return true;
    }

    // Valida e-mail
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}
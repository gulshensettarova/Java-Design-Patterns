package Behavioral.Strategy.PasswordValidateExample;

public class Main {
    public static void main(String[] args) {
        String password = "gulshan!";

        // Sadə şifrə doğrulaması
        PasswordValidator validator = new PasswordValidator(new SimplePasswordValidation());
        System.out.println("Sadə doğrulama: " + validator.validate(password));

        // Orta səviyyəli şifrə doğrulaması
        validator = new PasswordValidator(new MediumPasswordValidation());
        System.out.println("Orta doğrulama: " + validator.validate(password));

        // Güclü şifrə doğrulaması
        validator = new PasswordValidator(new StrongPasswordValidation());
        System.out.println("Güclü doğrulama: " + validator.validate(password));
    }
}

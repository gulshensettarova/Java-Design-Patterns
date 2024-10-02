package Behavioral.Strategy.PasswordValidateExample;

public class MediumPasswordValidation implements PasswordValidationStrategy{
    @Override
    public boolean validatePassword(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*");
    }
}

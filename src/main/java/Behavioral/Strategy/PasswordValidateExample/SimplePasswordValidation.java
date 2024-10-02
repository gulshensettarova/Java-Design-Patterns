package Behavioral.Strategy.PasswordValidateExample;

public class SimplePasswordValidation implements PasswordValidationStrategy{
    @Override
    public boolean validatePassword(String password) {
        return password.length()>=8;
    }
}

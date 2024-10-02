package Behavioral.Strategy.PasswordValidateExample;

public class PasswordValidator {
    private PasswordValidationStrategy strategy;

    // Strategiyanı konstruktorda təyin edirik
    public PasswordValidator(PasswordValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        return strategy.validatePassword(password);
    }
}

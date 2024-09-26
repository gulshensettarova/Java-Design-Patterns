package Structural.Bridge.PaymentExample;

public abstract class ApplicationType {
    protected PaymentType type;
    public ApplicationType(PaymentType type){
        this.type=type;
    }
    public abstract void pay(double amount);
}

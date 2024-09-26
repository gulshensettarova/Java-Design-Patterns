package Structural.Bridge.PaymentExample;

public class PaymentService {
    public static void main(String[] args) {
        ApplicationType webApplication=new WebApplication(new BankTransferPayment());
        webApplication.pay(100);

        ApplicationType mobileApplication=new MobileApplication(new PayPalPayment());
        mobileApplication.pay(200);
    }
}

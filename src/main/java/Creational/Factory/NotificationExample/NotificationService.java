package Creational.Factory.NotificationExample;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        // Creating Email Notification
        Notification emailNotification = factory.createNotification("email");
        emailNotification.sendNotification();

        // Creating SMS Notification
        Notification smsNotification = factory.createNotification("sms");
        smsNotification.sendNotification();
    }
}

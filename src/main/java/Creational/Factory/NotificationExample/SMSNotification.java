package Creational.Factory.NotificationExample;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.err.println("SMS Notification");
    }
}

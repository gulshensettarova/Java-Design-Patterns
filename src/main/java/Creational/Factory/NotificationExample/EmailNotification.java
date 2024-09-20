package Creational.Factory.NotificationExample;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.err.println("Email Notification");
    }
}

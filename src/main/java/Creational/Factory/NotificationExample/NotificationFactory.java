package Creational.Factory.NotificationExample;

public class NotificationFactory {

    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        if ("email".equalsIgnoreCase(type)) {
            return new EmailNotification();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Unknown notification type " + type);
    }
}

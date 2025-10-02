package librarySystem.notification;


public class NotificationService {
    Notifier notifier;


    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String message) {
        notifier.send(message);
    }
}

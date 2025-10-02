package librarySystem.notification;


//Get librarySystem.notification from email
public class Email implements Notifier {


    @Override
    public void send(String message) {
        System.out.println("\nSending Email Notification: " + message);

    }


}


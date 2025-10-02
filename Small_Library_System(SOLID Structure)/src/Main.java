import librarySystem.library.*;
import librarySystem.notification.*;



import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new  Scanner(System.in);

        Member member = new Member("John"); //Name of person

        NotificationService notificationService = new NotificationService(new Email()); //Notifier

        Book book = new Book("Java Basics", "Robert Linton"); //Book details

        Library library = new Library( book, member);

        UserInterface ui = new UserInterface(member, library, notificationService, scan); //Main-Menu

        ui.showMenu();
    }
}
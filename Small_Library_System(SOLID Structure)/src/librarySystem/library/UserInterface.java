package librarySystem.library;


import librarySystem.notification.NotificationService;


import java.util.Scanner;

public class UserInterface {
    private final Scanner scan;
    Library library;

    Member member;
    NotificationService  notificationService;


    public UserInterface( Member member, Library functions, NotificationService notificationService, Scanner scan) {
        this.notificationService = notificationService;
        this.member = member;
        this.library = functions;
        this.scan = scan;
    }


    public void showMenu(){
        boolean isMenuRunning = true;


        while(isMenuRunning){
            System.out.println("""
                    
                    1. Borrow Book
                    2. Return Book
                    3. Exit""");
            System.out.print("Select an option: ");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1 -> {
                    String message = this.library.borrowBook();
                    this.notificationService.sendNotification(message);
                }
                case 2 -> {
                    String message = this.library.returnBook();
                    this.notificationService.sendNotification(message);
                }
                case 3 -> {isMenuRunning = false;}
            }

        }
    }

}

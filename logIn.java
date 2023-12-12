import java.util.Scanner;
public class logIn {
    Scanner sc = new Scanner(System.in);
    String username, password;
    public void  use(){
        System.out.println("Welcome to Registration and Login System");
        System.out.println("Please enter a username for registration:");
         String username = sc.nextLine();
        System.out.println("Please enter a password for registration:");
        username = sc.nextLine();
        System.out.println("Registration successful!");
        System.out.println("Please enter your username for login:");
    String inputUsername = sc.nextLine();
        System.out.println("Please enter your password for login:");
    String inputPassword = sc.nextLine();
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
        System.out.println("Login successful!");
    } else {
        System.out.println("Incorrect username or password. Please try again.");
    }
    }
}

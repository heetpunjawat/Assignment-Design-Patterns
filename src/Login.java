package src;
import java.util.Scanner;

public class Login {
    int UserType;

    public int login() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Username:");
        String username = scanner.next();

        System.out.println("Enter Password:");
        String password = scanner.next();

        UserType = validation(username, password);

        return UserType;
    }

    public int validation(String username, String password) {

        if ((username.equalsIgnoreCase("tutu")) && (password.equalsIgnoreCase("1111"))) {
            System.out.println("Welcome Buyer tutu ");
            UserType = 0;
        }

        else if ((username.equalsIgnoreCase("mimi")) && (password.equalsIgnoreCase("2222"))) {
            System.out.println("Welcome Buyer mimi ");
            UserType = 0;
        }

        else if ((username.equalsIgnoreCase("nana")) && (password.equalsIgnoreCase("3333"))) {
            System.out.println("Welcome Buyer nana ");
            UserType = 0;
        }

        else if ((username.equalsIgnoreCase("pepe")) && (password.equalsIgnoreCase("3333"))) {
            System.out.println("Welcome Seller pepe ");
            UserType = 1;
        }

        else {
            System.out.println("Incorrect Username or Password ");
            System.exit(-1);
        }

        return UserType;
    }
}


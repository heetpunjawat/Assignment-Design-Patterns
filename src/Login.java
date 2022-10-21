package src;
import java.util.Scanner;

public class Login {
    int userType;

    Login() {
        userType = 0;
    }



    public String[] login() {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username ");
        String username = scanner.next();

        System.out.println("Enter Password ");
        String password = scanner.next();

        userType = validation(username, password);
        String[] temp = {String.valueOf(userType), username};

        return temp;
    }

    public int validation(String username, String password) {

        if ((username.equalsIgnoreCase("tutu")) && (password.equalsIgnoreCase("1111"))) {
            System.out.println("Welcome Buyer tutu ");
            userType = 0;
        }

        else if ((username.equalsIgnoreCase("mimi")) && (password.equalsIgnoreCase("2222"))) {
            System.out.println("Welcome Buyer mimi ");
            userType = 0;
        }

        else if ((username.equalsIgnoreCase("nana")) && (password.equalsIgnoreCase("3333"))) {
            System.out.println("Welcome Buyer nana ");
            userType = 0;
        }

        else if (username.equalsIgnoreCase("Buyer")) {
            System.out.println("Welcome Buyer");
            userType = 0;
        }

        else if ((username.equalsIgnoreCase("pepe")) && (password.equalsIgnoreCase("3333"))) {
            System.out.println("Welcome Seller pepe ");
            userType = 1;
        }

        else if (username.equalsIgnoreCase("Seller")) {
            System.out.println("Welcome Seller");
            userType = 1;
        }

        else {
            System.out.println("Incorrect Username or Password ");
            System.exit(-1);
        }

        return userType;
    }
}

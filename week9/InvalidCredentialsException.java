package week9;

//user-defined exception in java
import java.util.*;

//custom exception to validate login credentials
class InvalidCredentialsExceptions extends Exception {
    // member variable to store our custom message
    String msg;

    InvalidCredentialsExceptions(String msg) {
        // passing the parameter to the super class constructor
        super(msg);
        this.msg = msg;
    }

    // overriding with our custom message
    @Override
    public String toString() {
        return msg;
    }
}

public class InvalidCredentialsException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String id = sc.next();
        System.out.print("Password: ");
        String password = sc.next();

        try {
            if (id != "user1" || password != "1234") {
                throw new InvalidCredentialsExceptions("no such user with username - " + id);
            }
        } catch (InvalidCredentialsExceptions ex) {
            // calls override toString() method
            System.out.println(ex);
            // prints message passed to the super constructor
            System.out.println(ex.getMessage());
        }
    }
}

package week9;

//user-defined exception in java
import java.util.*;

//custom exception to validate withdrawal amount matches the minimum withdrawal limit
class AmountLessThanRequiredExceptions extends Exception {
    // member variable to store our custom message
    String msg;

    AmountLessThanRequiredExceptions(String msg) {
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

public class AmountLessThanRequiredException {
    public static void main(String[] args) {
        System.out.print("Please eneter withdraw amount: ");
        Scanner sc = new Scanner(System.in);
        int withdrawAmount = sc.nextInt();
        try {
            if (withdrawAmount <= 0) { // checking if the amount is greater than zero or not
                throw new AmountLessThanRequiredExceptions("Entered amount less than minimum withdrawal limit");
            }
        } catch (AmountLessThanRequiredExceptions ex) {
            // calls override toString() method
            System.out.println(ex);
            // prints message passed to the super constructor
            System.out.println(ex.getMessage());
        }
    }
}

package week9;

// class representing custom exception  
class InvalidAgeExceptions extends Exception {
    public InvalidAgeExceptions(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
public class InvalidAgeException {

    // method to check the age
    static void validate(int age) throws InvalidAgeExceptions {
        if (age < 18) {

            // throw an object of user defined exception
            throw new InvalidAgeExceptions("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }

    // main method
    public static void main(String args[]) {
        try {
            // calling the method
            validate(17);
        } catch (InvalidAgeExceptions ex) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

        System.out.println("rest of the code...");
    }
}

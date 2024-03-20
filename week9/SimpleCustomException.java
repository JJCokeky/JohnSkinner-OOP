package week9;

//simple custom exception in java
class SimpleCustomExceptions extends Exception {
    // member variable to store our custom message
    String msg;

    SimpleCustomExceptions(String msg) {
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

public class SimpleCustomException {
    public static void main(String[] args) {
        try {
            throw new SimpleCustomExceptions("This is a custom exeption");
        } catch (SimpleCustomExceptions ex) {
            // calls override toString() method
            System.out.println(ex);
            // prints message passed to the super constructor
            System.out.println(ex.getMessage());
        }
    }
}

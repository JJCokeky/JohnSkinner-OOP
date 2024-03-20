package week9;

// class representing custom exception  
class MyCustomExceptions extends Exception {

}

// class that uses custom exception MyCustomException
public class MyCustomException {
    // main method
    public static void main(String args[]) {
        try {
            // throw an object of user defined exception
            throw new MyCustomExceptions();
        } catch (MyCustomExceptions ex) {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }

        System.out.println("rest of the code...");
    }
}
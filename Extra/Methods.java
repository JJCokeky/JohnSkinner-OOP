public class Methods {

    // void - returns nothing
    // static - because we're not creating an object, it belongs to a class
    // rather than an instance of a class. So the method accessible to everything
    // instance of this Methods class
    // This method will add 2 number and display the result
    public static void addNumbers() {
        int sum = 5 + 18;
        System.out.println("5 + 18 = " + sum);
    }

    // Return a value - is passed 1 parameter
    public static int square(int num) {
        // return squared value
        return num * num;
    }

    // Returns 2 parameters
    public static int passing3Parmeters(int a, int b, int c) {
        // calculation
        int result = a * b * c;
        // return the result
        return result;
    }

    // METHOD OVERLOADING
    // number of parameters: 1
    public static void numberOfParameters(int a) {
        System.out.println("Parameters: " + a);
    }

    // number of parameters: 1
    public static void numberOfParameters(int a, int b) {
        System.out.println("Parameters: " + a + " and " + b);
    }

    // differnt data types
    // this accepts ints
    public static void dataTypes(int a) {
        System.out.println("Got integer data: " + a);
    }

    // this method accepts String
    public static void dataTypes(String a) {
        System.out.println("Got String data: " + a);
    }

    // METHOD RECURSION
    public static int factorial(int n) {
        if (n != 0) // terminating condition
            return n * factorial(n - 1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {

        // call the addNumbers method
        addNumbers();

        System.out.println("_____________________");

        System.out.println("Squared value of 10 is: " + square(2));

        System.out.println("_____________________");

        // passing 3 parameters
        System.out.println("2 * 4 * 4 = " + passing3Parmeters(2, 4, 4));

        System.out.println("_____________________");

        // calling a method inside a loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("The square of " + i + " is " + square(i));
        }

        System.out.println("_____________________");
        System.out.println("Overloading: Number of parameters");
        numberOfParameters(1);
        numberOfParameters(2);
        numberOfParameters(3);
        numberOfParameters(4);
        numberOfParameters(5, 6);

        System.out.println("Overloading: Data type of parameters");
        dataTypes(1);
        dataTypes("Hello world!");

        System.out.println("_____________________");
        System.out.println("Recursion:");
        int number = 4, results;
        results = factorial(number);
        System.out.println(number + " factorial = " + results);

    }
}

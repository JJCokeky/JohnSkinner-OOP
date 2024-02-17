/*
John Skinner
2024-02-16
*/

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        double fahrenheit = getInput();
        double celsius = TempConversion(fahrenheit);

        System.out.println("Tempreture entered was " + fahrenheit);
        System.out.println("converted tempreture was " + celsius);
    }

    public static double getInput() { // create the function to get and check the user input

        Scanner input = new Scanner(System.in); // create the scanner named input
        double fahrenheit = 0.0;
        System.out.print("Enter tempreture in fahrenheit: "); // user enters tempreture
        while (!input.hasNextDouble()) {
            System.out.println("invaild");
            input.next();
            System.out.print("Enter tempreture in fahrenheit: ");
        }
        Double userinput = input.nextDouble();
        if (userinput >= -130.0 && userinput <= 135.0) {
            fahrenheit = userinput; // check that its in range
        } else {
            System.out.println("Please eneter tempreture between -130.0 and 135.0");
            input.nextLine();
            System.out.print("Enter tempreture in fahrenheit: ");
        }
        input.close();
        System.out.println(fahrenheit);
        return fahrenheit;
    }

    public static double TempConversion(double fahrenheit) { // create the function tempConversion
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}
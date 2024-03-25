// John Skinner
// 2024-03-04
// Object- oriented programing
// This java program will calculate the sum of values and divide by a given value while catching any errors

package inclass3;

import java.util.Scanner;

// custom exception for not int
class NotInt extends Exception {
    public NotInt() {
        super("Hi " + "name" + " , you have not entered a numeric value, please enter a number");
    }
}

// custum exception for divivid by 0
class divZero extends Exception {
    public divZero(String name) {
        super("Hi " + name + " , this will cause divide by 0 exception, please enter a non-zero value");
    }
}

// create a class to store varibles and set name
class addAndDivCalc {
    String name;
    int[] values;
    int sum;

    public addAndDivCalc(String name) {
        this.name = name;
    }

    // get user values and run them through a for loop, if there is an error re ask
    // for the value
    public void getValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of values: ");
        int count = sc.nextInt();
        values = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println(i);
            System.out.print("Enter value " + (i + 1) + ":");
            try {
                values[i] = sc.nextInt();
            } catch (Exception NotInt) {
                NotInt.getMessage();
            }
        }
    }

    // calculate the sum of the values
    public void calcSum() {
        sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println("The sum is: " + sum);
    }

    // calculate the division of values using a while and a try catch for 2
    // exceptions divide by 0 and not int
    public void div() {
        Scanner sc = new Scanner(System.in);
        int divNum;
        while (true) {
            System.out.print("Enter a number to divide the sum: ");
            divNum = sc.nextInt();
            if (divNum == 0)
                System.out.println(
                        "Hi " + name + " , this will cause divide by 0 exception, please enter a non-zero value");
        }

        // running out of time to complete this code

    }
}

// main class to get name and call on functions
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        addAndDivCalc calc = new addAndDivCalc(name);
        calc.getValues();
        calc.calcSum();
        calc.div();
        sc.close();
    }
}

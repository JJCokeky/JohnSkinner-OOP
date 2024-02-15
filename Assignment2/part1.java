/*
 John Skinner
 2024-02-09
 */

import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[8];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please eneter score: ");
            numbers[i] = input.nextInt();
            // try { numbers[i] >= 0 || <=100};

        }
        input.close();
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
    }
}

// int[] Numbers = new int[8]; // create the array to 8 digets
// Scanner Input = new Scanner(System.in); // create the scanner
// int Numbers[] = new int[8];

// for (int i : Numbers) { // ask for the numbers and check them for errors
// System.out.println(i);
/*
 John Skinner
 2024-02-15
 */

import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {

        int[] scores = new int[8]; // create the scores array
        Scanner input = new Scanner(System.in); // create the scanner named input

        for (int i = 0; i < scores.length; i++) { // for each number in the score arrays
            System.out.print("Enter score: "); // user enters score
            while (!input.hasNextInt()) {
                System.out.println("invaild");
                input.next();
            }
            int userinput = input.nextInt();
            if (userinput >= 0 && userinput <= 100) {
                scores[i] = userinput;
            } else {
                System.out.println("Please eneter score between 0 and 100");
            }
        }
        input.close();
    }
}

/*
 John Skinner
 2024-02-16
 */

import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {

        Double avrageScore = 0.0;
        int lowestScore = 100;
        int highestScore = 0;

        int[] scores = new int[8]; // create the scores array
        Scanner input = new Scanner(System.in); // create the scanner named input

        for (int i = 0; i < scores.length; i++) { // for each number in the score arrays
            System.out.print("Enter score: "); // user enters score
            while (!input.hasNextInt()) { // check if its an int
                System.out.println("invaild");
                input.next();
            }
            int userinput = input.nextInt();
            if (userinput >= 0 && userinput <= 100) { // check if its in range
                scores[i] = userinput;
            } else {
                System.out.println("Please eneter score between 0 and 100");
            }
        }
        input.close();

        for (int j = 0; j < scores.length; j++) {
            System.out.println("Score " + (j + 1) + ": " + scores[j]);
            avrageScore += scores[j]; // add to avrage
            if (lowestScore > scores[j]) { // set lowest score
                lowestScore = scores[j];
            } else {
            }
            if (highestScore < scores[j]) { // set highest score
                highestScore = scores[j];
            } else {
            }
        }
        avrageScore /= scores.length; // calculate avrage
        // print lowest highest and avrage
        System.out.println("lowest score was " + lowestScore);
        System.out.println("highest score was " + highestScore);
        System.out.println("avarage score was " + avrageScore);

    }
}

import java.util.Scanner;

public class part3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter your letter grade: ");
        short grade = input.nextShort();

        char letter = 'W';

        if (grade >= 90 && grade <= 100) {
            letter = 'A';
        } else if (grade >= 80 && grade <= 89) {
            letter = 'B';
        } else if (grade >= 70 && grade <= 79) {
            letter = 'C';
        } else if (grade >= 60 && grade <= 69) {
            letter = 'D';
        } else if (grade >= 50 && grade <= 59) {
            letter = 'E';
        } else if (grade >= 0 && grade <= 49) {
            letter = 'F';
        } else {
            System.out.println("wrong input");
        }
        System.out.println(letter);

        if (letter == 'F') {
            System.out.println("Failed");
        } else
            System.out.println("Passed");
    }
}

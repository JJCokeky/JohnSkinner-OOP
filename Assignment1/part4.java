import java.util.Scanner;

public class part4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter your letter grade: ");
        String letter = input.nextLine();
        input.close();

        if (letter == "A") {
            System.out.println("Great work");
        } else if (letter == "B") {
            System.out.println("Good work");
        } else if (letter == "C") {
            System.out.println("Average work");
        } else if (letter == "E") {
            System.out.println("Below average work");
        } else if (letter == "F") {
            System.out.println("Unsatisfactory work");
        } else {
            System.out.println("invaild");
        }

    }
}
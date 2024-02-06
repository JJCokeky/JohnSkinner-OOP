import java.util.Scanner;

// public class part4 {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.print("enter your letter grade: ");
//         String grade = input.nextLine();
//         input.close();
//         char letter = grade.charAt(0);

//         if (letter == 'A') {
//             System.out.println("Great work");
//         } else if (letter == 'B') {
//             System.out.println("Good work");
//         } else if (letter == 'C') {
//             System.out.println("Average work");
//         } else if (letter == 'D') {
//             System.out.println("Below average work");
//         } else if (letter == 'F') {
//             System.out.println("Unsatisfactory work");
//         } else {
//             System.out.println("invaild");
//         }

//     }
// }

public class part4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter your letter grade: ");
        String grade = input.nextLine();
        input.close();
        char letter = grade.charAt(0);

        switch (letter) {
            case 'A':
                System.out.println("Great work");
                break;
            case 'B':
                System.out.println("Good work");
                break;
            case 'C':
                System.out.println("Average work");
                break;
            case 'D':
                System.out.println("Below average work");
                break;
            case 'F':
                System.out.println("Unsatisfactory work");
                break;
        }
    }
}
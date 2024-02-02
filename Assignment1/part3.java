public class part3 {
    public static void main(String[] args) {

        char letter = 'C';
        short grade = 30;

        if (grade >= 90 && grade <= 100) {
            letter = 'A';
        }
        if (grade >= 80 && grade <= 89) {
            letter = 'B';
        }
        if (grade >= 70 && grade <= 79) {
            letter = 'C';
        }
        if (grade >= 60 && grade <= 69) {
            letter = 'D';
        }
        if (grade >= 50 && grade <= 59) {
            letter = 'E';
        }
        if (grade >= 0 && grade <= 49) {
            letter = 'F';
        }
        System.out.println(letter);

        if (letter == 'F') {
            System.out.println("Failed");
        } else
            System.out.println("Passed");
    }
}

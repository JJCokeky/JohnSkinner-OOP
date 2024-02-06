public class part5 {
    public static void main(String[] args) {

        for (int outerloop = 1; outerloop <= 3; outerloop++) {
            for (int innerloop = 0; innerloop <= 2; innerloop++) {
                System.out.println("Outer Loop: " + outerloop + ", Inner Loop: " + innerloop);
            }
        }

        int docounter = 0;
        do {
            System.out.println("do counter: " + docounter);
            docounter += 2;
        } while (docounter <= 10);

        int whilecounter = 9;
        while (whilecounter >= 0) {
            System.out.println("while counter: " + whilecounter);
            whilecounter -= 3;
        }

    }
}
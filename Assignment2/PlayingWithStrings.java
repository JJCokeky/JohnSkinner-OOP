/*
 John Skinner
 2024-02-15
 */

public class PlayingWithStrings {
    public static void main(String[] args) {
        String lastName = "Skinner";
        int ThirdLastLetter;

        System.out.println(lastName.length());

        ThirdLastLetter = lastName.length() - 3;

        System.out.println(ThirdLastLetter);

        System.out.println(lastName.charAt(ThirdLastLetter));

        System.out.println(lastName.toUpperCase());

        System.out.println(lastName.toLowerCase());

        if (lastName.toUpperCase().equals("SHORT")) {
            System.out.println("your last name is Short");
        } else if (lastName.toUpperCase().equals("SAMBANDAN")) {
            System.out.println("your last name is Sambandan");
        } else if (lastName.toUpperCase().equals("PATEL")) {
            System.out.println("your last name is Patel");
        } else if (lastName.toUpperCase().equals("SKINNER")) {
            System.out.println("your last name is Skinner");
        } else if (lastName.toUpperCase().equals("DOUGH")) {
            System.out.println("your last name is Dough");
        } else {
            System.out.println("you do not share a name with Short, Sambandan, Patel, Skinner or Dough");
        }

        if (lastName.contains("ne")) {
            System.out.println("Your lastname contains 'ne'");
        } else {
            System.out.println("Your lastname does not contain 'ne'");
        }

    }
}

/*
 John Skinner
 2024-02-15
 */

public class PlayingWithStrings {
    public static void main(String[] args) {
        // declare lastname and thirdlastletter
        String lastName = "Skinner";
        int ThirdLastLetter;

        System.out.println(lastName.length()); // print length

        ThirdLastLetter = lastName.length() - 3; // set thridlastletter to the number of the third last letter in the
                                                 // name
        System.out.println(ThirdLastLetter);

        System.out.println(lastName.charAt(ThirdLastLetter)); // print the third last letter

        System.out.println(lastName.toUpperCase()); // print all upper case

        System.out.println(lastName.toLowerCase()); // print all lower case

        if (lastName.toUpperCase().equals("SHORT")) { // compare last name to other last names
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

        if (lastName.toUpperCase().contains("NE")) { // check if name contains NE
            System.out.println("Your lastname contains 'ne'");
        } else {
            System.out.println("Your lastname does not contain 'ne'");
        }

    }
}

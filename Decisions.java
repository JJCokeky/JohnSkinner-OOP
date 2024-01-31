public class Decisions {
    public static void main(String[] args) {
       /*System.out.println("Decision: IF...");
        int number = 10;
        if(number > 0)
        {
            System.out.println("10 is greater than 0");
        }
        System.out.println("program continues from here");
        */

        // rain program
       /* System.out.println("RAIN: IF... ELSE");
        // make a new scanner object name "input"
        Scanner input = new Scanner(System.in);
        // prompt user for input
        System.out.println("Enter the forecast:");
        // store value in a string variable "weather"
        String weather = input.next(); // takes user input
        String rain = "rain"; // string value to compare
        // decision structure to determin if we need an umbrella
        if(weather.contentEquals(rain)) {
            System.out.println("Bring an umbrella");
        }
        else { // else, no umbrella needed
            System.out.println("Don't need an umbrella");
        }

        // IF ELSE compare numbers
        int number = -5;
        // check if number if greater than 0
        if(number > 0){
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is NOT positive");
        }*/

       /* System.out.println("RAIN: IF... ELSE IF");
        // number to compare
        int num = 41;
        // check if the number is greater than 0
        if(num > 0)
        {
            System.out.println("The number is positive");
            // check if number equals 42
            if (num == 42){
                System.out.println("The answer to life, the universe, and everything!");
            }
        }
        // check if number is less than 0
        else if (num < 0)
        {
            System.out.println("The number is negative");
        }

        // if above checks are not true, execute the default
        else {
            System.out.println("The number is 0");

        }*/

        /*System.out.println("NESTED IF... ELSE IF");
        double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
        // check if n1 is greater than or equal to n2
        if (n1 >= n2)
        {
            // true, n1 is greater than or equal to n2
            // check if n1 is greater than or equal to n3
            if(n1 >= n3)
            {
                // true, then store largest value
                largest = n1;
            }
            else
            { // false, n3 is the larger number
                largest = n3;
            }
        }
        else // check n2 vs n3
        {
            // check if n2 is great than or equal to n3
            if (n2 >= n3)
            {
                largest = n2;
            }
            else // n3 is larger value
            {
                largest = n3;
            }
        }
        System.out.println("Largest number:" + largest);
        */


        // SWITCH decision structure
        System.out.println("SWITCH:");

        int num = 60; // integer variable set to 60
        String size; // a string variable that will hold the assigned text

        switch (num)
        {
            case 10: // check if the value in num = 10
                size = "Small";
                break; // if condition is met, break out of the decision structure
            case 20: // check if the value in num = 20
                size = "Medium";
                break; // if condition is met, break out of the decision structure
            case 30: // check if the value in num = 30
                size = "Large";
                break; // if condition is met, break out of the decision structure
            case 40: // check if the value in num = 40
                size = "Extra Large";
                break; // if condition is met, break out of the decision structure
            default: // if nothing matches, this is the default code to execute
                size = "Size unknown";
                break; // if condition is met, break out of the decision structure
        }
        System.out.println("Size is: " + size);


    }
}
// John Skinner
// 2024-03-04
// Object- oriented programing

package Assignment3;

public class CreditCard {
    // declare varables
    private long accountNumber;
    private int month;
    private int year;
    private String holder;

    // set the paramiters
    public CreditCard(long accountNumber1, int month1, int year1, String holder1) {
        accountNumber = accountNumber1;
        month = month1;
        year = year1;
        holder = holder1;
    }

    // create the defult values
    public CreditCard() {
        long DEFAULT_ACCOUNT_NUMBER = 1234567890123456L;
        int DEFULT_MONTH = 1;
        int DEFAULT_YEAR = 99;
        String DEFAULT_NAME = "Bob Loblaws";

        // set defult values
        accountNumber = DEFAULT_ACCOUNT_NUMBER;
        month = DEFULT_MONTH;
        year = DEFAULT_YEAR;
        holder = DEFAULT_NAME;
    }

    // display card info
    public void displayCardInfo() {
        System.out.println("Your Account Number is " + accountNumber);
        System.out.println("Month is " + month);
        System.out.println("Year is " + year);
        System.out.println("Name is  " + holder);
    }
}
package Assignment3;

public class CreditCard {
    private long accountNumber;
    private int month;
    private int year;
    private String holder;
}

    public CreditCard(long accountNumber, int month, int year, String holder) {
        long accountNumber1 = accountNumber;
        int month1 = month;
        int year1 = year;
        String holder1 = holder;
    }

    private String DEFAULT_NAME() {
        String name = "Bob Loblaws";
    }

    // display card info
public void displayCardInfo() {
    System.out.println("Your Account Number is " + accountNumber);
    System.out.println("Month is " + month);
    System.out.println("Year is " + year);
    System.out.println("Name is  " + holder);
}
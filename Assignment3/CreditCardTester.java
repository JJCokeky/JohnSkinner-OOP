package Assignment3;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard MyObject1 = new CreditCard(); // no passed arguments so display defult
        CreditCard MyObject2 = new CreditCard(5312264554231345L, 1, 10, "Jane Smith"); // The second one should be
                                                                                       // passed the values
        CreditCard MyObject3 = new CreditCard(10234, 5, 8, "Neva Read"); // setter method

        // getter to display each variable
        MyObject1.displayCardInfo();
        MyObject2.displayCardInfo();
        MyObject3.displayCardInfo();
    }
}
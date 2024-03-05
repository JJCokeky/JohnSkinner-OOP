// John Skinner
// 2024-02-23
// Object- oriented programing

package Assignment3;

public class CreditCardTester {
    public static void creditcardtester(String[] args) {
        CreditCard MyObject1 = new CreditCard(); // no passed arguments so display defult
        CreditCard MyObject2 = new CreditCard(5312264554231345L, 1, 10, "Jane Smith"); // valid account number
        CreditCard MyObject3 = new CreditCard(10234, 5, 8, "Neva Read"); // invaild account number

        // getter to display each variable
        MyObject1.displayCardInfo();
        MyObject2.displayCardInfo();
        MyObject3.displayCardInfo();
    }
}
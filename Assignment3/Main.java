// John Skinner
// 2024-03-04
// Object- oriented programing

package Assignment3;

public class Main {s
    public static void main(String[] args) {
        CreditCard MyObject1 = new CreditCard(); // display defult
        CreditCard MyObject2 = new CreditCard(5312264554231345L, 1, 10, "Jane Smith"); // valid account number
        CreditCard MyObject3 = new CreditCard(10234, 5, 8, "Neva Read"); // invaild account number

        // getter to display each variable
        MyObject1.displayCardInfo();
        MyObject2.displayCardInfo();
        MyObject3.displayCardInfo();
    }
}
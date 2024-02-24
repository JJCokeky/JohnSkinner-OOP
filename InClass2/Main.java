// John Skinner
// 2024-02-23
// Object- oriented programing

package InClass2;

public class Main {
    public static void main(String[] args) {
        Student MyObject1 = new Student(); // invokes no argument constructor
        Student MyObject2 = new Student("John", 10030326); // parameterized constructor
        Student MyObject3 = new Student("John Skinner", 100930324); // setter method

        // getter to display each variable
        MyObject1.Getinfo();
        MyObject2.Getinfo();
        MyObject3.Getinfo();
    }
}
package Assignment3;

public class Main {
    public static void main(String[] args) {
        Student MyObject1 = new Student(); // The first one, is not passed arguments
        Student MyObject2 = new Student(“Jane Smith”, 5312264554231345, 1, 10 (Jan 2024)); // The second one should be passed the values
        Student MyObject3 = new Student(); // setter method 

        // getter to display each variable
        MyObject1.Getinfo();
        MyObject2.Getinfo();
        MyObject3.Getinfo();
    }
}
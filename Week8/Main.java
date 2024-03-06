// in class example

package Week8;

// super keyword in java example
// superclass Person
class Person {
    void message() {
        System.out.println("This is person class\n");
    }
}

// Subclass Student
class Student extends Person {
    void message() {
        System.out.println("This is student class");
    }

    // Note that display( ) is only in Student class
    void display() {
        // will call current class message( ) method
        message();
        // will invoke parent class message( )
        super.message();
    }
}

// Driver Program
class Test {
    public static void main(String args[]) {
        Student s = new Student();
        // calling display( ) of Student
        s.display();
    }
}

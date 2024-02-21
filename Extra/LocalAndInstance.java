
public class LocalAndInstance {
    int x = 5; // instance variable

    public static void main(String[] args) {
        LocalAndInstance myObj = new LocalAndInstance();
        System.out.println(myObj.x);
    }
}

// public class LocalAndInstance {
// public static void main(String[] args) {
// int x = 5; // local variable
// System.out.println(x);
// }
// }
// x = 5;

// public class LocalAndInstance {
// int x; // instance variable
// }

// public LocalAndInstance() {
// }

// public static void main(String[] args) {
// LocalAndInstance myObj = new LocalAndInstance();
// System.out.println(myObj);
// }

// public static void main(String[] args) {
// Car myCar = new Car();
// }

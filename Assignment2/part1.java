public class A1P2 {
    public static void main(String[] args) {
        short a = 100;
        long b = 100000000;
        byte c = 10;
        float d = 7.2f;

        System.out.println("This is a short: " + a);
        System.out.println("This is a long: " + b);
        System.out.println("This is a byte: " + c);
        System.out.println("This is a float: " + d);

        long e = (long) d;
        System.out.println("This is a float casted to a long: " + e);
    }
}
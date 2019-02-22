package Class11_OOP_Encapsulation;


import p1.C1;

public class Main {
    public static void main(String args[]) {
        Test test1 = new Test();
        // These are OK, a and b may be accessed directly
        test1.a = 10;
        test1.b = 20;

        // This is not OK and will cause an error
        // test1.c = 100; // Error!

        // You must access c through its methods
        test1.sets(100); // OK
        System.out.println("a, b, and c: " + test1.a + " " + test1.b + " " + test1.getc());

    }
}

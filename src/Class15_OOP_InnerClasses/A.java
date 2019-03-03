package Class15_OOP_InnerClasses;

/**
 * Created by UITS-Admin on 03.03.2019.
 */
public class A {
    private int a = 10;
    void show(){
        System.out.println("A " + a);
    }

    static class B{
        private int b = 100;
        void show(){
            System.out.println("B " + b);
        }
    }
    class C{
        private int c = 100;
        void show(){
            System.out.println("C " + c);
        }
    }


}

package Class12_OOP_Inheritance;

/**
 * Created by akuzmenko on 2/22/2019.
 */
public class Main {
    public static void main(String args[]) throws CloneNotSupportedException{
        //Student ob1 = new Aspirant("Ivan", 23, "MySql");
        //System.out.println(ob1);

        //Student ivan = new Student("Ivan", 23);
        //Student ivanClone;
       // ivanClone = (Student) ivan.clone();
       // System.out.println(ivanClone);

        A a = new A();
        IMy.sm();
        a.m();
        a.dm();

        B b = new B();
        b.dm();
        System.out.println(A.a);

    }
}

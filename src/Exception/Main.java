package Exception;

import Class8_OOP.Girl;
import com.sun.org.glassfish.external.statistics.Stats;

import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.Arrays;

/**
 * Created by UITS-Admin on 24.03.2019.
 */
public class Main {
    public static void main(String[] args) {
       /* int a = 10;
        int b = 0;
        int c =0;

        try {
            c = a/b;
            int [] ints = new int[c];
            ints[c] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("***********************");
        }
        catch (ArithmeticException e) {
            System.out.println("hihihi");
        } finally {
            System.out.println("hi");
        }

        System.out.println(c);
        */

        /*try {
            throw new MyException();
        } catch (MyException e) {
            e.m();
        }
        */

        /*try {
            try {
             throw new Exception("a");
            } finally {
                if(true){
                throw new IOException("b");
            }
            System.out.println("c");
        }
        }catch (IOException ex){
            //System.err.println("d1");
            //System.err.println(ex.getMessage());
            System.out.println("d1");
        }catch(Exception ex){
            System.err.println("d");
            System.err.println(ex.getMessage());
        }
        */

/*
        A a = new A("A");
        System.out.println(a.getType());

        A a1 = new A(1);
        System.out.println(a1.getType());

        A a2 = new A(new Girl("Dasha",15, 45));
        System.out.println(a2.getType());
*/
        Integer inum[] = {1, 2, 3, 4, 5};
        A a = new A(inum);
        double r = a.overage();
        System.out.println(r);

        Integer inums[] = {1, 2, 3, 4, 5};
        A<Integer> iob = new A<Integer>(inums);
        double v = iob.overage();
        System.out.println("iob overage is " + v);


        Double dnums[] = {1.6, 2.4, 3.8, 4.3, 5.1};
        A<Double> dob = new A<Double>(dnums);
        double w = dob.overage();
        System.out.println("iob overage is " + w);


        if(isIn(2,inums)) {
            System.out.println("2 is in nums");
        }

        if(!isIn(7,inums)) {
            System.out.println("7 is not in nums");
        }


        Integer [] a2 = {1, 2, 3, 4, 5, 6, 7};
        MyClass <Integer> myclass = new MyClass<Integer>(a2);
        for(int i = 0; i< a2.length; i++) {
            System.out.print(a2[i] +" ");
        }
        System.out.println();

        System.out.println("min > " + myclass.min());
        System.out.println("max > " + myclass.max());
        Girl[] girls = {
                new Girl("ket", 29, 158),
                new Girl("mira", 19, 168),
                new Girl("ira", 46, 90)};

        MyClass <Girl> girl = new MyClass<Girl>(girls);

        System.out.print(Arrays.toString(girls) + "\n");
        System.out.println("max > " + girl.max());
        System.out.println("min > " + girl.min());

    }

    static <T, V extends T> boolean isIn(T x, V[] y){
        for(int i = 0; i < y.length; i++)
            return  true;

        return  false;

    }
}

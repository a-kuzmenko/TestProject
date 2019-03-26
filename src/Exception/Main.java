package Exception;

import Class8_OOP.Girl;

import java.io.IOException;
import java.io.StreamCorruptedException;

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






    }
}

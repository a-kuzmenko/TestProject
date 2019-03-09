package Class15_OOP_InnerClasses;

import javax.jws.soap.SOAPBinding;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by UITS-Admin on 03.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        //A a = new A();
        //a.show();

        //A.B b = new A.B();
        //b.show();

        //A.C c = a.new C();
        //c.show();

        //Bank bank1 = new Bank("Private");
        //Bank.Account account = bank1.new Account(1, 100);

        //account.setMoney(1000);
        //account.getMoney(460);
        //account.show();
        //System.out.println();

        //Bank bank2 = new Bank("DeltaBank");
        //Bank.Account account2 = bank2.new Account(2, 200);

        //account2.setMoney(2500);
        //account2.getMoney(5000);
        //account2.show();

        //B b = B.A;
        //System.out.println(b);

        //Apple apple = Apple.Jonathan;
        //if (apple == Apple.Jonathan) {
        //    System.out.println(apple);
        //}

        /*System.out.println("Here are all Apple constants");
        Apple apples[] = Apple.values();
        for(Apple a:apples){
            System.out.println(a);
        }
*/
        /*Apple apple;
        apple = Apple.valueOf("Winesap");
        System.out.println("apple contains " + apple);

        System.out.println("All apple prices:");
        for(Apple a: Apple.values())
            System.out.println(a + "costs " + a.getPrice() + " cents");
        */

        /*Apple ap1, ap2, ap3;

        System.out.println("Here are all apple constants " + "and their ordinal values: ");
        for(Apple a : Apple.values())
            System.out.println( a + " " + a.ordinal());


        ap1 = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
*/

        /*Girl girl = new Girl("Irina", 28);
        Girl gir11 = new Girl("Irina", 28);

        System.out.println(girl);
        System.out.println(gir11);

        System.out.println(girl.equals(gir11));
        System.out.println(girl.hashCode());
        System.out.println(gir11.hashCode());

        if(girl.compareTo(girl) > 0 ){
            System.out.println(">");
        }else {
            System.out.println("<");

            Comparator<Girl> girlComparator = (a1, a2)-> a2.getName().compareTo(a1.getName());
            TreeSet<Girl> girls = new TreeSet<>(girlComparator) ;
            girls.add(new Girl("Irina", 28));
            girls.add(new Girl("Lola", 18));
            girls.add(new Girl("Ket", 32));
            girls.add(new Girl("Mira", 22));
            System.out.println(girls);
        }
*/
       /* if(ap1.compareTo(ap2)<0){
            System.out.println(ap1 + " comes before " + ap2);
        }
        if(ap1.compareTo(ap2)>0){
            System.out.println(ap2 + " comes before " + ap1);
        }
        if(ap1.compareTo(ap3) == 0){
            System.out.println(ap1 + " equals " + ap3);
        }
        System.out.println();

        if(ap1.equals(ap2)){
            System.out.println("Error! ");
        }
        if(ap1.equals(ap3)){
            System.out.println(ap1 + " equals " + ap3);
        }
        if(ap1 == ap3){
            System.out.println(ap1 + " == " + ap3);
        }*/

       Integer iOb = 100;
       Integer kOb = 100;

        System.out.println(iOb.equals(kOb));

        System.out.println(iOb == kOb);
    }
}

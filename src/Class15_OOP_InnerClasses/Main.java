package Class15_OOP_InnerClasses;

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

        System.out.println("Here are all Apple constants");
        Apple apples[] = Apple.values();
        for(Apple a:apples){
            System.out.println(a);
        }

        Apple apple;
        apple = Apple.valueOf("Winesap");
        System.out.println("apple contains " + apple);

        System.out.println("All apple prices:");
        for(Apple a: Apple.values())
            System.out.println(a + "costs " + a.getPrice() + " cents");
    }
}

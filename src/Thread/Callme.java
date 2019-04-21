package Thread;

/**
 * Created by UITS-Admin on 21.04.2019.
 */
public class Callme {

     synchronized void call(String msg){
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

package Thread;

/**
 * Created by UITS-Admin on 21.04.2019.
 */
public class My extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Main.TheadInfo();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package Thread;

/**
 * Created by UITS-Admin on 21.04.2019.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //new My().start();
        //new Thread(new MyRun()).start();

        /*new Thread(){
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
        }.start();
*/
        Runnable run = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Main.TheadInfo();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }};

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);

        thread1.setPriority(1);
        thread2.setPriority(10);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Main is dead!!!");

        /*new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Main.TheadInfo();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}).start();
*/
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
            TheadInfo();
            Thread.sleep(5000);
        }
*/

    }

    public static void TheadInfo() {
        Thread thread = Thread.currentThread();
        System.out.println("Name " + thread.getName());
        System.out.println("ID " + thread.getId());
        System.out.println("Priority " + thread.getPriority());
        System.out.println("State " + thread.getState());
        System.out.println("ThreadGroup " + thread.getThreadGroup());
        System.out.println("isAlive " + thread.isAlive());
        System.out.println("isDaemon " + thread.isDaemon());
        System.out.println("isInterrupted " + thread.isInterrupted());
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}

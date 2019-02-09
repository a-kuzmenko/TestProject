package Class9_OOP2;

public class Main {
    public static void main(String args[]){
        BoxDemo mybox = new BoxDemo();
        BoxDemo mybox2 = new BoxDemo(3, 6,9);
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //mybox2.width = 3;
        //mybox2.height = 6;
        //mybox2.depth = 9;

        vol = mybox.volume();
        System.out.println("vol = " + vol);

        vol = mybox2.volume();
        System.out.println("vol = " + vol);

        //vol = mybox2.width * mybox2.height * mybox2.depth;
        //System.out.println("vol = " + vol);

        mybox = null;
        System.out.println(mybox);
        System.gc();

    }
}

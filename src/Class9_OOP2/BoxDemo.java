package Class9_OOP2;

public class BoxDemo {
    double width;
    double height;
    double depth;

    public BoxDemo() {
        System.out.println("hi");
    }

    public BoxDemo(double width, double height, double depth) {
        //this();
        this.width = width;
        this.height = height;
        this.depth = depth;

    }

    double volume(){
    //vol = mybox.width * mybox.height * mybox.depth;
    //System.out.println("vol is  " + width * height * depth);
    return width * height * depth;
}

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Goodbye!!!");
    }
}

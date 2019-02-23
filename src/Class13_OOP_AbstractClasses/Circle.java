package Class13_OOP_AbstractClasses;

/**
 * Created by UITS-Admin on 23.02.2019.
 */
public class Circle extends Shape {
    int x, y, z;

    public Circle() {

    }

    public Circle(String color, int x, int y, int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    void draw() {
        System.out.println("circle");
    }
}

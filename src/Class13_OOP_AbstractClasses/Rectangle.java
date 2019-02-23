package Class13_OOP_AbstractClasses;

/**
 * Created by UITS-Admin on 23.02.2019.
 */
public class Rectangle extends Shape{
int x, y, z, w;

    public Rectangle(String color, int x, int y, int z, int w) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    @Override
    void draw() {
        System.out.println("rectangle");
    }
}

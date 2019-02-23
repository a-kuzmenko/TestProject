package Class13_OOP_AbstractClasses;



/**
 * Created by UITS-Admin on 23.02.2019.
 */
public class Main {
    public static void main(String args[]){
        Shape [] shape1 = new Shape[3];
        shape1[0] = new Circle();
        shape1[1] = new Rectangle("black", 10, 12, 12, 12);
        shape1[2] = new Circle();

        for (Shape shape : shape1) {
            shape.draw();
        }

    }
}

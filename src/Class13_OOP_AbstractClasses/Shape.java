package Class13_OOP_AbstractClasses;

/**
 * Created by UITS-Admin on 23.02.2019.
 */
public abstract class Shape {
    private String color = "red";

    abstract void draw();

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}















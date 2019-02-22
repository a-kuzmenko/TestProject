package Class12_OOP_Inheritance;

/**
 * Created by akuzmenko on 2/22/2019.
 */
public class Student implements Cloneable{
    protected String name;
    protected int age;

    public Student(String name, int age) {
        System.out.println("constructor");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

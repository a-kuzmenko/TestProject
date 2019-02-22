package Class12_OOP_Inheritance;

/**
 * Created by akuzmenko on 2/22/2019.
 */
public class Main {
    public static void main(String args[]) throws CloneNotSupportedException{
        //Student ob1 = new Aspirant("Ivan", 23, "MySql");
        //System.out.println(ob1);

        Student ivan = new Student("Ivan", 23);
        Student ivanClone;
        ivanClone = (Student) ivan.clone();
        System.out.println(ivanClone);
    }
}

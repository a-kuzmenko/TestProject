package Class12_OOP_Inheritance;

/**
 * Created by akuzmenko on 2/22/2019.
 */
public class Aspirant extends Student{
    private String workName;

    public Aspirant(String name, int age, String workName) {
        super(name, age);
        this.workName = workName;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "workname='" + workName + '\'' +
                "} " + super.toString();
    }
}

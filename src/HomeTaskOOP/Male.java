package HomeTaskOOP;

/**
 * Created by akuzmenko on 3/15/2019.
 */
public class Male extends People {

    boolean gender = true;
    String first_name;
    String last_name;
    float high;
    float weight;

    public Male(boolean gender, String first_name, String last_name, float high, float weight) {
        this.gender = gender;
        this.first_name = first_name;
        this.last_name = last_name;
        this.high = high;
        this.weight = weight;
    }

    public Male() {
    }

    @Override
    public String toString() {
        return "Male{" +
                "gender=" + gender +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", high=" + high +
                ", weight=" + weight +
                '}';
    }

    @Override
    boolean speak(boolean m, boolean f) {
        return false;
    }

    @Override
    boolean tolerate(boolean m, boolean f) {
        return false;
    }

    @Override
    boolean spendTimeTogether(float m, float f) {
        return false;
    }

    @Override
    People haveRelationship(People p) {
        return null;
    }
}

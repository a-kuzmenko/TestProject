package HomeTaskOOP;

import java.util.Random;

/**
 * Created by akuzmenko on 3/15/2019.
 */
public class Female extends People {
    boolean gender = false;
    String first_name;
    String last_name;
    float high;
    float weight;

    public Female(boolean gender, String first_name, String last_name, float high, float weight) {
        this.gender = gender;
        this.first_name = first_name;
        this.last_name = last_name;
        this.high = high;
        this.weight = weight;
    }

    public Female() {

    }

    @Override
    public String toString() {
        return "Female{" +
                "gender=" + gender +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", high=" + high +
                ", weight=" + weight +
                '}';
    }

    @Override
    boolean speak(boolean m, boolean f) {

        if (m == false && f == false)
        {
            return true;
        }
        else if (m == false && f == true){
            return true;
        }
        else if (m == true && f == false){
            return true;
        }
        else if (m == true && f == true){
            Random r1 = new Random();
            if (r1.nextInt(100) < 50)
            {
                return true;
            }
            else
                return false;
        }
        return false;
    }

    @Override
    boolean tolerate(boolean m, boolean f) {
        if (m == false && f == false){
            Random r2 = new Random();
            if (r2.nextInt(100) < 5){
                return true;
            }
        }
        else if (m == false && f == true){
            Random r3 = new Random();
            if (r3.nextInt(100) < 70){
                return true;
            }
        }
        else if (m == true && f == false){
            Random r4 = new Random();
            if (r4.nextInt(100) < 70){
                return true;
            }
        }
        else if (m == true && f == true){
            Random r5 = new Random();
            if (r5.nextInt(100) < 5.6){
                return true;
            }
        }
        {
            return false;
        }
    }

    @Override
    boolean spendTimeTogether(float m, float f) {

        if ((m <= f) && ((m * 1.1) > f)){//больше на 10%
            Random rTog1 = new Random ();
            if (rTog1.nextInt(100) < 85){
                return true;
            }
            else if ((m >= f) && ((m * 1.1)<f)){//меньше на 10%
                Random rTog2 = new Random ();
                if (rTog2.nextInt(100) < 95){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override
    People haveRelationship(People p) {
        return p;


    }

    People newPerson (boolean gender){
        People p;
        if (gender == false){
            p = new Female();
        } else {
            p = new Male();
        }
        return p;
    }
}

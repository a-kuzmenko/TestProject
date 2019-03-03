package HomeTaskOOP;

/**
 * Created by UITS-Admin on 03.03.2019.
 */
public abstract class People {
    boolean gender;
    String first_name;
    String last_name;
    float hight;
    float weight;

    abstract boolean speak (People p);

    abstract boolean tolerate (People p);

    abstract boolean spendTimeTogether (People p);

    abstract People haveRelationship (People p);

}

package HomeTaskOOP;

/**
 * Created by UITS-Admin on 03.03.2019.
 */
public abstract class People {



    public People() {
    }

    abstract boolean speak (boolean m, boolean f);

    abstract boolean tolerate (boolean m, boolean f);

    abstract boolean spendTimeTogether (float m, float f);

    abstract People haveRelationship (People p);

}

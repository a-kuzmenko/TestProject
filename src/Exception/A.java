package Exception;

/**
 * Created by UITS-Admin on 24.03.2019.
 */
public class A <T extends Number>{
    T[] a;


    public A(T[] a){
        this.a = a;
    }

    double overage(){
        double sum = 0.0;

        for(int i=0; i<a.length; i++){
            sum += a[i].doubleValue();
        }
        return sum / a.length;
    }
}

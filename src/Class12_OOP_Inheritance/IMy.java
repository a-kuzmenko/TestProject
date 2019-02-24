package Class12_OOP_Inheritance;

/**
 * Created by UITS-Admin on 24.02.2019.
 */
public interface IMy extends IA, IB{
    int a = 10;
    int []b = {1,2,3,4,5,6,7};

    void m();
    static void sm(){
        System.out.println("hi from static method");
    }
    default void dm(){
        System.out.println("hi from default method");
    }
}

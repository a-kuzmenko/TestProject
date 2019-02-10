package Class10_OOP_Polymorphism;

public class Test {
    int a;
    int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // передача объекта
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    // передача примитивных типов
    void meth(int a, int b) {
        a *= 2;
        b /= 2;
    }
}

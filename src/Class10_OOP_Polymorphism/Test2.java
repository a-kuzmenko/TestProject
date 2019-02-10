package Class10_OOP_Polymorphism;

public class Test2 {
    int a;

    public Test2(int i) {
        a = i;
    }

    public Test2 incrByTen() {
        return new Test2(a + 10);
    }
}

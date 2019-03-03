package Class15_OOP_InnerClasses;

public enum Apple {
    Jonathan(10), GoldenDel(15), RedDel(9), Winesap(56), Cortland(8);

    private int price;

    Apple(int price) {
        this.price = price;
    }

    int getPrice(){return price;}
}

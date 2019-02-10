package Class10_OOP_Polymorphism;


public class Main {
    static void m(){
        System.out.println("m()");
    }
    static void m(int a){
        System.out.println("m(int a)");
    }
    static void m(int a, int b){
        System.out.println("m(int a, int b)");
    }
    static void m(double a){
        System.out.println("m(double a)");
    }
    static int m(int...a){
        int sum = 0;
        for (int i : a) {
            sum+= i;
        }
        return sum;
    }


    public static void main(String args[]){
        //ShowMatrix();
        m();
        m(10);
        m(12, 12);
        m(12.0);
        System.out.println(m(1, 2, 4));

        Test ob = new Test(15, 20);

        int x = 10;
        int y = 10;

        System.out.println("x and y before call: " + x + " " + y);//10 10
        ob.meth(x, y);
        System.out.println("x and y after call: " + x + " " + y);//10 10


        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);//15 20
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);//30 10


        Test2 ob1 = new Test2(2);
        Test2 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
        
        
        Box box = new Box(5);

        Box[] ba = go(box, new Box(6));
        ba[0] = box;
        for (Box b : ba) System.out.print(b.size + " ");

    }
    static Box[] go(Box b1, Box b2) {
        b1.size = 4;
        Box[] ma = {b2, b1};
        return ma;
    }
    private static void ShowMatrix() {
        int sum = 0;
        int[][] nums = new int[3][5];
        // give nums some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package Class10_OOP_Polymorphism;


public class Main {
    static void m(){

    }
    static void m(int a){

    }
    static void m(int a, int b){

    }
    static void m(double a){

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
        System.out.println(m(1,2,3,4,5,6,7,8,9));

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

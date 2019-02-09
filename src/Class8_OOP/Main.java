package Class8_OOP;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Girl masha = new Girl("Masha", 18, 178);
        System.out.println(masha);

        Girl dasha = new Girl("Dasha", 20, 165);
       System.out.println(dasha);
        System.out.println(masha.age);
        System.out.println(masha.height);
        masha.goToTheMovies("yes");

        Girl shasha = new Girl("Shasha", 23, 175);

        System.out.println(" Her answer " + masha.goToTheRest("Mack"));

        masha = null;
        System.out.println(masha);

    }
}



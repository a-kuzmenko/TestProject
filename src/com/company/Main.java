package com.company;


import java.util.Scanner;

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
        masha.goToTheRest("Mack");
        System.out.println();

    }
}



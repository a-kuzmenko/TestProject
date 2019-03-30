package Class8_OOP;

import java.util.Scanner;

public class Girl implements Comparable <Girl>{
    String name;
    int age;
    int height;

    public Girl(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }


    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public void goToTheMovies(  String answear2) {

        //boolean answear = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Go to the movies " + name);

        System.out.println("Enter your answer ");
        String answer = scanner.next();
        boolean answear = Boolean.parseBoolean(answer);



        switch (answear2){
            case "yes":
                System.out.println("Let's go at 5 pm");
                break;
            case "no":
                System.out.println("Rain check then");
                break;
                default:
                    System.out.println("???");
        }


    }

    public String goToTheRest(String rest) {
        if ("Mac".equals(rest)) {
           // System.out.println("no");
            return "no";
        } else {
            //System.out.println("yes");
            return "yes";
        }
        //return rest;
    }

    @Override
    public int compareTo(Girl o) {
        return age - o.age;
    }
}

package HomeTaskOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by UITS-Admin on 03.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        /*
        Необходимо написать консольное приложение, в котором сначала нужно ввести значения
        свойств, для двух экземпляров людей (женщины и мужчины в произвольном порядке,
                возможны варианты ЖЖ, МЖ, ЖМ и ММ).
                Затем программа должна провести тест на совместимость и дать прогноз на результат
        отношений двух данных экземпляров. Алгоритм следующий:
        1. Метод “тест на совместимость” принимает два экземпляра людей и должен возвратить
        экземпляр человека или null.
        2. Вызвать метод “иметь отношения” первого экземпляра человека с аргументом - второй
        экземпляр.
        2 / 3
        3. Полученный результат вернуть как результат работы метода “тест на совместимость”.
        В результате работы программы надо выдать на экран все свойства нового экземпляра
        человека или написать “ничего не вышло... разбежались”. Желательно вызовы методов
        экземпляров классов женщин и мужчин сопровождать выводом на экран комментариев к
        процессу.

*/
        People people = getPeople();
        People people2 = getPeople();

        People child = compatibility_test(people, people2);

        if(child != null){
            System.out.println(child.toString());
        }else {
            System.out.println("ничего не вышло... разбежались");
        }

        //m.haveRelationship(f);
/*
        if (gender2 != gender1) {
            ((Female)f).newPerson(newp);
        }
*/


    }

    private static People getPeople() {
        Random r = new Random();
        boolean gender = r.nextBoolean();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter name > ");
        String name = s.nextLine();
        System.out.print("Enter last_name > "  );
        String last_name = s.nextLine();
        System.out.print("Enter height > "  );
        float height = s.nextFloat();
        System.out.print("Enter weight > "  );
        float weight = s.nextFloat();

        return  gender ? new Male(name, last_name,height, weight) : new Female(name, last_name,height, weight);
    }

    static People compatibility_test(People first, People second){

        return first.haveRelationship(second);

    }

}

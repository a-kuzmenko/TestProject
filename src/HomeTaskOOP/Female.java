package HomeTaskOOP;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by akuzmenko on 3/15/2019.
 */
public class Female extends People {


    public Female(String first_name, String last_name, float high, float weight) {
        super(false, first_name, last_name, high, weight);
    }




//- "иметь отношения" (возвращает Человек)
//    если “говорить” && “терпеть/выдерживать общество” && “проводить время вместе” равно
//    true, то если свойство “пол” собственного экземпляра и пол аргумента одинаковые, то
//    вернуть null, иначе
//    3 / 3
//    создать экземпляр нового человека путем вызова метода “родить человека” у экземпляра
//    с полом Ж.

  /*  @Override
    People haveRelationship(People other) {
        if((this.speak(other) && this.tolerate(other)&& this.spendTimeTogether(other))) {
            if (this.gender != other.gender) {
                return newPerson(this);
            }
            return null;
        }
        return null;
    }
*/

//дополнительный метод - "родить человека" (возвращает экземпляр
//    человека)
//Создать новый экземпляр женщины или мужчины с вероятностью 0.5 со следующими
//    свойствами:
//    - имя (String) - ввести с консоли
//    - фамилия (String) - берется у экземпляра с мужским полом
//    - рост (float) - копируется у соответствующего экземпляра с таким же полом + 0.1*(рост
//    экземпляра противоположного рода минус рост однородного экземпляра)
//    - вес (float) - аналогично росту

    People newPerson (People p){
        Random r = new Random();
        boolean gender = r.nextBoolean();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the " + (gender ? "Male" : "Female") +" name > ");
        People child;
        String name = scanner.nextLine();
        String last_name = p.last_name;

        float baseHeight = gender ? p.high : this.high;
        float otherHeight = gender ? this.high : p.high;
        float height = baseHeight + (0.1f * (otherHeight - baseHeight));
        
        float baseWeight = gender ? p.weight : this.weight;
        float otherWeight = gender ? this.weight : p.weight;
        float weight = baseWeight + (0.1f * (otherWeight - baseWeight));
        
        child = gender ? new Male(name, last_name,height, weight) : new Female(name, last_name,height, weight);
        return child;
        
    }
}

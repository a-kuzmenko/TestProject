package HomeTaskOOP;

import java.util.Random;

/**
 * Created by UITS-Admin on 03.03.2019.
 */
public abstract class People {

    public boolean gender;
    public String first_name;
    public String last_name;
    public float high;
    public float weight;

    public People() {
    }

    public People(boolean gender, String first_name, String last_name, float high, float weight) {
        this.gender = gender;
        this.first_name = first_name;
        this.last_name = last_name;
        this.high = high;
        this.weight = weight;
    }
    //- "говорить" (возвращает boolean)
    //Результат определяется по таблице , где первая колонка это пол собственного
    //   экземпляра, а вторая - пол аргумента:
    //  Ж Ж всегда true
    //  Ж М true
    //  М Ж true
    //  М М с вероятностью 0.5
    boolean speak(People other) {
        if (this.gender && other.gender) {
            Random r1 = new Random();
            return r1.nextInt(100) < 50;
        }
        return true;
    }
//- "терпеть/выдерживать общество" (возвращает boolean)
//    аналогично
//    Ж Ж с вероятностью 0.05
//    Ж М с вероятностью 0.7
//    М Ж с вероятностью 0.7
//    М М с вероятностью 0.056

     boolean tolerate(People other){
         Random r = new Random();
         if (!this.gender && !other.gender){
             return r.nextInt(100) < 5 ;
         } else if (this.gender == false && other.gender == true){
             return r.nextInt(100) < 70;
         } else if (this.gender == true && other.gender == false){
                 return r.nextInt(100) < 70;
         } else if (this.gender == true && other.gender == true){
                 return r.nextInt(100) < 5.6;
         }
         return false;
     }
//- проводить время вместе (возвращает boolean)
//если рост экземпляров отличается более чем на 10%, метод возвращает true с
//    вероятностью 0.85
//    если рост экземпляров отличается менее чем на 10%, метод возвращает true с
//    вероятностью 0.95

    boolean spendTimeTogether(People other){
        Random r = new Random ();
        float percent = (this.high - other.high) / this.high * 100;
        if(Math.abs(percent) < 10 ){
            return r.nextInt(100) < 95;
        }else {
            return r.nextInt(100) < 85;
        }
    }

    //  100   90           (180 - 170) = 10  / 180 * 100


    People haveRelationship(People other){
        if((this.speak(other) && this.tolerate(other)&& this.spendTimeTogether(other))) {
            if (this.gender != other.gender) {
                Male male = (Male) (this.gender ? this : other);
                Female female = (Female) (this.gender ? other : this);
                return female.newPerson(male);
            }
            return null;
        }
        return null;
    }

    @Override
    public String toString() {
        return "People{" +
                "gender=" + (gender ? "Male" : "Female") +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", high=" + high +
                ", weight=" + weight +
                '}';
    }
}

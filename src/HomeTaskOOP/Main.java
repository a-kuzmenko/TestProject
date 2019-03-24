package HomeTaskOOP;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by UITS-Admin on 03.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        People [] p = new People[2];
        p [0] = new Male(true,"Vasia","Vasiliev",185,100);
        p [1] = new Female(false,"Maria","Solovieva",165,110);

        for (People h : p){
            System.out.println(h);
            System.out.println(h.speak(true, true));
            System.out.println(h.tolerate(false, true));
            System.out.println(h.spendTimeTogether(100, 120));

        }

    }
    static boolean valueOf (BufferedReader readerGender)throws IOException {
        while (true) {
            System.out.println("Insert gender M/F: ");

            String genderStr = readerGender.readLine();
            if (genderStr.isEmpty()) {
                System.out.println("You did not insert gender!");
                continue;
            }
            if ("m".equalsIgnoreCase(genderStr)) {
                return true;
            }
            if ("f".equalsIgnoreCase(genderStr)) {
                return false;
            }
        }
    }
}

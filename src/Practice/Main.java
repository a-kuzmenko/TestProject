package Practice;

/**
 * Created by UITS-Admin on 09.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Office office1 = new Office("ceo", 54, City.Kharkov);
        Office office2 = new Office("ceo2", 67, City.Kiev);

        System.out.println(office1);
        System.out.println(office2);
    }
}

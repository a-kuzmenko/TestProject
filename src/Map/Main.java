package Map;

import java.util.*;

/**
 * Created by UITS-Admin on 06.04.2019.
 */

enum Faculty{
    FFSM, MMF, FPMI, FMO, GEO
}
public class Main {
    public static void main(String[] args) {

        TreeMap<String, Double> map = new TreeMap<>();
        map.put("D", 123.4);
        map.put("C", 12.4);
        map.put("E", 123.5);
        map.put("A", 23.64);
        System.out.println(map);

        //Iterator<Map.Entry<String, Double>> entries = map.entrySet().iterator();
        //System.out.println(entries);

        /*for (Map.Entry<String, Double> stringDoubleEntry : map.entrySet()) {
            System.out.println(stringDoubleEntry.getValue());
        }*/

       //System.out.println(map.get("C"));


        List<String> arrayList = Arrays.asList("red", "cyan");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        List<String> arrayList2 = Arrays.asList("red", "blue");
        Collections.sort(arrayList2, Collections.reverseOrder());
        System.out.println(arrayList2);

        List<String> arrayList3 = Arrays.asList("pink", "tan");
        Collections.shuffle(arrayList3);
        System.out.println(arrayList3);

        List<String> arrayList4 = Arrays.asList("red", "green", "blue", "red", "yellow");
        Collections.fill(arrayList4, "black");
        System.out.println("arrayList4 > "+arrayList4);//black,black,black

        System.out.println("Collections.disjoint(arrayList, arrayList2) > " + Collections.disjoint(arrayList, arrayList2));//false
        System.out.println("Collections.disjoint(arrayList, arrayList3) > " + Collections.disjoint(arrayList, arrayList3));//true

        System.out.println("Collections.frequency > "+Collections.frequency(arrayList4,"black"));//5

        String init[] = {"One", "Two", "Three", "One", "Two"};
        List list1 = new ArrayList(Arrays.asList(init));
        List list2 = new ArrayList(Arrays.asList(init));

        list1.remove("One");
        System.out.println("list1.remove > " + list1);

        list2.removeAll(Collections.singleton("Two"));
        System.out.println("list12.removeAll > " + list2);

        EnumSet<Faculty> set1 = EnumSet.range(Faculty.MMF, Faculty.FMO);

        EnumSet<Faculty> set2 = EnumSet.complementOf(set1);
        System.out.println(set1);
        System.out.println(set2);


List<String> mylist = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1" );
        mylist.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }

}

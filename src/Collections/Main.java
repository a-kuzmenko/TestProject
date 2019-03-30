package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * Created by UITS-Admin on 30.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        HashSet<String> linkedHashSet = new LinkedHashSet<>();


        System.out.println("Initial size of arrayList: "
                + linkedHashSet.size());


        linkedHashSet.add("A");
        linkedHashSet.add("E");
        linkedHashSet.add("B");
        linkedHashSet.add("D");
        linkedHashSet.add("F");
        System.out.println(linkedHashSet);


    }
}

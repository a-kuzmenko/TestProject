package Collections;

import java.util.*;


/**
 * Created by UITS-Admin on 30.03.2019.
 */
public class Main {



    public static void main(String[] args) {
       /* HashSet<String> linkedHashSet = new LinkedHashSet<>();


        System.out.println("Initial size of arrayList: "
                + linkedHashSet.size());


        linkedHashSet.add("a");
        linkedHashSet.add("a");
        linkedHashSet.add("a");
        linkedHashSet.add("D");
        linkedHashSet.add("F");
        System.out.println(linkedHashSet);
*/

        List<String> arrayList = new ArrayList<>();

       // System.out.println("Initial size of arrayList: "
       //         + arrayList.size());

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        //arrayList.addFirst("A2");
        //arrayList.addLast("C2");

        System.out.println("Size of arrayList after additions: "
                + arrayList.size());

        System.out.println("Contents of arrayList: " + arrayList);

        Iterator<String> itr = arrayList.iterator();

        while(itr.hasNext()){
            String element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();

        ListIterator<String> stringListIterator = arrayList.listIterator();
        while (stringListIterator.hasNext()){
            String element = stringListIterator.next();
            stringListIterator.set(element + "+");
        }


        itr = arrayList.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();

        while (stringListIterator.hasPrevious()){
            String element = stringListIterator.previous();
            System.out.println(element + " ");
        }
        /*arrayList.remove("F");
        arrayList.remove(2);
        arrayList.removeFirst();
        arrayList.removeLast();

        System.out.println("Size of arrayList after deletions: "
                + arrayList.size());
        System.out.println("Contents of arrayList: " + arrayList);
*/

    }
}

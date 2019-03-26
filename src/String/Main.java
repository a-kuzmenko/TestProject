package String;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by UITS-Admin on 10.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = new String(chars,2,3);
        System.out.println(s);

        System.out.println("------------------------------");

        String s2 = "abc";
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println("abc".length());

        System.out.println("------------------------------");

        System.out.println("abc".charAt(1));

        System.out.println("------------------------------");

        String[] split = "  100   m l ".trim().split("\\s+", 2);
        System.out.println(Arrays.toString(split));

        System.out.println(split[1].replace(" ", ""));

        System.out.println("------------------------------");

        String string = "123456789";
        String[] split1 = string.split("");

        int value = 0;
        System.out.println(Arrays.toString(split1));

       /* for (String s1 : split) {
            if (Integer.parseInt(s1) % 2 == 0) {
                System.out.println(Arrays.toString(s1.length());
            }
        }
*/
        String collect = Arrays.stream("123456789".split("")).filter(sl-> Integer.parseInt(sl) %2 == 0).collect(Collectors.joining());
        System.out.println(collect);

        System.out.println("Мама мыла раму".replace("мыла ", ""));

        System.out.println("------------------------------");

        String sl2 = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        sl2.getChars(start,end,buf,0);
        System.out.println(buf);
        System.out.println("------------------------------");

        String s14 = "Hello";
        String s15 = "Hello";
        String s16 = "Good-bye";
        String s17 = "HELLO";
        System.out.println(s14 + " equals " + s15 + " -> "
                + s14.equals(s15));
        System.out.println(s14 + " equals " + s16 + " -> "
                + s14.equals(s16));
        System.out.println(s14 + " equals " + s17 + " -> "
                + s14.equals(s17));
        System.out.println(s14 + " equalsIgnoreCase " + s17 + " -> "
                + s14.equalsIgnoreCase(s17));

        System.out.println("---Сравнение подстрок--------");

        System.out.println("Foobar".endsWith("bar"));//проверяет совпадает ли с параметром конец строки
        System.out.println("Foobar".startsWith("Foo"));//проверяет, начинается ли данная подстрока фрагментом, переданным методу в качестве параметра.
        System.out.println("Foobar".contains("oo"));//проверяет входит ли подстрока в строку
        System.out.println("Hello world!!!".regionMatches(6, "world", 0, 3));//используется для сравнения подстроки в исходной строке с подстрокой в строке-параметре.
        System.out.println("Hello, How are you".regionMatches(true, 7, "HOW", 0, 3));
        System.out.println("---substring()--------");

        System.out.println("quick brown fox jumps over the lazy dog".substring(15));
        System.out.println("quick brown fox jumps over the lazy dog".substring(15, 20));

        System.out.println("---Сортировка пузырьком--------");

        String[] array = {
                "Для ", "работы", "со", "строками", "в", "языке", "Java", "используются",
                "классы", "String", "StringBuilder", "StringBuffer"
        };

            for (int j = 0; j < array.length; j++) {
                for (int i = j + 1; i < array.length; i++) {
                    if (array[i].compareTo(array[j]) < 0) {
                        String t = array[j];
                        array[j] = array[i];
                        array[i] = t;
                    }
                }
                System.out.println(array[j]);
            }
        System.out.println("---indexOf() и lastlndexOf()--------");

        String str = "quick brown fox jumps over the lazy dog";

        System.out.println(str);
        System.out.println("indexOf(dog) = "
                + str.indexOf("dog"));
        System.out.println("lastIndexOf(dog) = "
               + str.lastIndexOf("dog"));
        //System.out.println("indexOf(String) = "
        //       + str.indexOf("String"));
        //System.out.println("lastIndexOf(String) = "
         //       + str.lastIndexOf("String"));
        System.out.println("indexOf('f', 12) = "
                + str.indexOf('f', 12));
        //System.out.println("lastIndexOf(S, 70) = "
        //        + str.lastIndexOf('S', 70));

        System.out.println("---toLowerCase() и toUpperCase()--------");
        System.out.println("Hello".toLowerCase());
        System.out.println("Hello".toUpperCase());

        System.out.println(String.format("%s age = %d weight = %g %n", "John", 20, 80.4));

        System.out.println(Integer.parseInt("kitty123".replaceAll("[\\D]", "")));
        System.out.println(Integer.parseInt("123kitty".replaceAll("[\\D]", "")));
        System.out.println(Integer.parseInt("1k2itt3y".replaceAll("[\\D]", "")));


        System.out.println("001234-cat".replaceFirst("^0*", ""));
    }
}

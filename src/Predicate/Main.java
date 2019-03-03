package Predicate;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by UITS-Admin on 02.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Random().ints('A', 'z')
                .mapToObj(s -> "" + (char) s)
                .limit(20).collect(Collectors.joining()));

        IntStream.range(1, 100).filter(s->s%2==0).map(s->s*2).forEach(s-> System.out.println(s));

        Predicate<String> predicate = arg -> arg != null;
        Predicate<String> predicate2 = arg -> arg.length() > 0;
        Predicate<String> predicate3 = predicate.and(predicate2);

        String helloStr = "hello";
        System.out.println(predicate3.test(helloStr));
        String nullStr = null;
        System.out.println(predicate3.test(nullStr));

        Arrays.stream("4,-9,16".split(","))
                .map(Integer::parseInt)
                .map(i -> (i < 0) ? -i : i)
                .forEach(System.out::println);

        Random random = new Random();
        Stream.generate(random::nextBoolean)
                .limit(2)
                .forEach(System.out::println);
        Stream.generate(Date::new)
                .limit(10)
                .forEach(System.out::println);


    }
}

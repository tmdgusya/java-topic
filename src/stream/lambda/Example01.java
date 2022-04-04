package stream.lambda;

import java.util.stream.IntStream;

public class Example01 {


    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,3,4,2,1,6,7);
        IntStream intStream2 = IntStream.of(1,3,4,2,1,6,7);
        intStream.filter(ele -> ele != 1).forEach(System.out::println);
        intStream2.filter(Example01::predicate).forEach(System.out::println);
    }

    public static boolean predicate(int ele) {
        return ele != 1;
    }

}

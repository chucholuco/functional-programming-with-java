package programming;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP03FunctionalInterfaces2 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        //Suplier  - no have any input and return something back
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(randomIntegerSupplier.get());

       //UnaryOperator
        UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
        System.out.println(unaryOperator.apply(10));

        //BiPredicate
        BiPredicate<Integer, String> biPredicate = (number, str) -> {
            return number < 10 && str.length() > 5;
        };
        System.out.println(biPredicate.test(5, "hello world"));

        //BiFunction
        BiFunction<Integer, String, String> biFunction = (number, str) -> {
            return number + " " + str;
        };
        System.out.println(biFunction.apply(10, "hello world"));

        //BiConsumer
        BiConsumer<Integer, String> biConsumer = (i1, s2) -> {
            System.out.println(i1);
            System.out.println(s2);
        };
       biConsumer.accept(10, "world");

       //IntBinaryOperator
        IntBinaryOperator intBinaryOperator = (x, y) -> x + y; //There are primitives values not wrapped classes

       //IntConsumer
       //IntFunction
       //IntPredicate
       //IntSupplier
       //IntToDoubleFunction
       //IntToLongFunction
       //IntUnaryOperator

    }
}

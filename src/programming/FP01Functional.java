package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//        printAllNumbersInListFunctional(numbers);
//        printEvenNumbersInListFunctional(numbers);
        printSquareOfEvenNumbersInListFunctional(numbers);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //What to do
        numbers.stream()
                .forEach(System.out::println); //Method Reference
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        //What to do
        numbers.stream()
                .filter(number -> number % 2 == 0) //Filter - Only allow even numbers
                .forEach(System.out::println); //Method Reference
    }

    private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
        //What to do
        numbers.stream()
                .filter(number -> number % 2 == 0) //Filter - Only allow even numbers
                .map(number -> number * number)
                .forEach(System.out::println); //Method Reference
    }
}

package programming;

import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printOddNumbersInListFunctional(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//        courses.stream()
//                .forEach(System.out::println);

//        courses.stream()
//                .filter(course -> course.contains("Spring"))
//                .forEach(System.out::println);

//        courses.stream()
//                .filter(course -> course.length() >= 4)
//                .forEach(System.out::println);

//        printCubesOfOddNumbersInListFunctional(numbers);

        courses.stream()
                .map(x -> x + " " + x.length())
                .forEach(System.out::println);

    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        //What to do
        numbers.stream()
                .filter(number -> number % 2 != 0) //Filter - Only allow even numbers
                .forEach(System.out::println); //Method Reference
    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
        //What to do
        numbers.stream()
                .filter(number -> number % 2 != 0) //Filter - Only allow even numbers
                .map(x -> Math.pow(x, 3))
                .forEach(System.out::println); //Method Reference
    }
}

package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<Integer> doubledNumbers = squareList(numbers);
        System.out.println(doubledNumbers);

        List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<Integer> lengthCourses = courses.stream().map(x -> x.length()).collect(Collectors.toList());
        System.out.println(lengthCourses);

//       int sum = addListFunctional(numbers);
//        System.out.println(sum);
    }


    private static List<Integer> squareList(List<Integer> numbers) {
        return numbers.stream()
                .map(x -> x * x).collect(Collectors.toList());
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
               //.reduce(0, FP02Functional::sum);
               //.reduce(0, (x, y) -> x + y);
                .reduce(0, Integer::sum);
    }

    private static int sum(int aggregate, int nextNumber) {
        return aggregate + nextNumber;
    }
}

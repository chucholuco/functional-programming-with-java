package programming;

import java.util.List;
import java.util.function.Supplier;

public class FPMethodReferences {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                //.map(str -> str.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Supplier<String> supplier = () -> new String();
        Supplier<String> supplier = String::new;
    }

}

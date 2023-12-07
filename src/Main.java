import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream randomIntStream = new Random().ints(1000, 10, 10000);

        Function<Integer, int[]> getInts = (Integer count) -> randomIntStream.limit(count).toArray();

        Supplier<Long> getOddIntegersCount = () -> randomIntStream.filter(num -> num % 2 == 0).count();

        Supplier<String> reduceSumAllIntegers = () -> randomIntStream.reduce(Integer::sum).toString();

        Consumer<String> printLog = System.out::println;

        Supplier<Map<String, Long>> getNumberCountsMap = () -> randomIntStream.boxed().collect(
                Collectors.groupingBy(Integer::toHexString, Collectors.counting()));


//        ArrayList<String> fruits = new ArrayList<>() { "Яблоко", "Банан", "Груша", "Апельсин", "Киви" };
//        Function<Void, Void> printAllInUpperCase = () -> fruits.stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//
//        fruits.stream()
//                .map(String::length)
//                .forEach(System.out::println);
//
//        fruits.stream()
//                .filter(fruit -> fruit.length() > 5)
//                .forEach(System.out::println);
//
//        boolean hasLowerCaseA = fruits.stream()
//                .anyMatch(fruit -> fruit.contains("а"));
//        System.out.println("Есть ли фрукт с буквой 'а' в нижнем регистре: " + hasLowerCaseA);
//
//
//        String concatenatedFruits = fruits.stream()
//                .reduce((fruit1, fruit2) -> fruit1 + ", " + fruit2)
//                .orElse("");

    }
}
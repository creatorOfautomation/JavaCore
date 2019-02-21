package com.alfa13.work2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Runner {

    public void run() {

        List<Integer> integerList = Stream.iterate(10, x -> x + 10)
                .limit(10)
                .map(x -> x / 2)
                .collect(Collectors.toList());
        System.out.println(integerList);
        String[] arr = new String[]{"conc", "Bonc", "ranc", "bank", "branc"};
        Stream.of(arr).filter(s -> s.startsWith("b")).sorted().forEach(System.out::println);

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("John", "M", 12));
        personList.add(new Person("Linn", "F", 12));
        personList.add(new Person("Linn", "F", 14));
        personList.add(new Person("Ben", "M", 23));
        personList.stream().filter(x -> x.getGender().equalsIgnoreCase("M") && x.getAge() >= 18 && x.getAge() < 27).forEach(System.out::println);
        int f = (int) personList.stream().filter(x -> x.getGender().equalsIgnoreCase("F")).mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(f);
    }
}

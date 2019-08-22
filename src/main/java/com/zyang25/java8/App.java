package com.zyang25.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    public static void main(String[] args) {
        Stream.of(arrayOfEmps);

        Stream.Builder<Employee> emBuilder = Stream.builder();

        emBuilder.accept(arrayOfEmps[0]);

        emBuilder.build();

        Arrays.stream(arrayOfEmps).forEach(e -> e.setSalary(e.getSalary() + 10));

        Arrays.stream(arrayOfEmps).forEach(e-> System.out.println(e.toString()));
    }
}
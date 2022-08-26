package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task2 {
    public void MultiplicationTableInOneColumn() {
        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    IntStream.rangeClosed(1, 10)
                            .forEach(j -> System.out.println(i + " * " + j + " = " + i * j));
                    System.out.println();
                });
    }

    public void MultiplicationTableInFiveColumns() {
        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    IntStream.rangeClosed(1, 5)
                            .forEach(j -> System.out.print(i + " * " + j + " = " + i * j + "\t\t"));
                    System.out.println();
                });
        System.out.println();

        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    IntStream.rangeClosed(6, 10)
                            .forEach(j -> System.out.print(i + " * " + j + " = " + i * j + "\t\t"));
                    System.out.println();
                });
    }
}

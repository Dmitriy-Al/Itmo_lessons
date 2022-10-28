package ru.itmo.lesson.lesson16;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {

    public static void calculate(Operation operation, double x, double y){
        System.out.println("Result: " + operation.execute(x, y));
    }

    public static void main(String[] args) {


        // если метод принимает 1 параметр, скобки можно не ставить;
        // если тело метода состоит более чем из 1 инструкции, {} обязательны;
        // при наличии {} return необходимо прописывать явно;
        Operation plus = (first, second) -> /*return по умолчанию т.к. нет {} */ first + second;
        System.out.println(plus.execute(1, 5));

        Operation div = (a, b) -> {
            if(b == 0 ) return 0;
            return a / b;
        };
        System.out.println(div.execute(8,3));

        // лямбда можно передавать методу как аргумент:
        calculate(plus, 7, 3);
        calculate((n, m) -> n - m, 90, 25);

        // Функциональные интерфейсы в java
        // Predicate   import java.util.function.Predicate;
        Predicate<Integer> isPositive = num -> num > 0;
        Predicate<Integer> isNegative = num -> num < 0;
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isPositive.test(-1));
        System.out.println(isPositive.and(isEven).test(8));
        System.out.println(isPositive.or(isEven).test(9));


        // Function R apply (T t);
        Function<Double, Double> min20 = x -> x * 0.8;
        Function<Double, Double> xXx = x -> x * 2;
        Function<Integer, String> plusWord = x -> {
            if (x <= 0) throw new IllegalArgumentException("Err");
                return x + " p.";
        };
        System.out.println(min20.apply(40.0));
        System.out.println(plusWord.apply(4));



    }
}

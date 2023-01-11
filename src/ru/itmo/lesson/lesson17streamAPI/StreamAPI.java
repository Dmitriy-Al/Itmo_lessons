package ru.itmo.lesson.lesson17streamAPI;

import ru.itmo.lesson.lesson16.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
public static void main(String[] args){

        // Stream API
// 1)
        Stream<Integer> integerStream = Stream.of(-7, -54, 23, 34, -2, 78, -8, 5, 38, 56, 3, -29);
        integerStream.filter(elem -> elem < 0) // filter(Predicate<? super T> predicate) boolean test (T t)
        /* добавляем промежуточный метод */ .limit(3)
        .map(elem -> elem * elem) //Function<? super T, ? extends R> mapper
        .forEach(elem -> System.out.println(elem)); // Терминальный (последний) метод Consumer<? super T> action

        System.out.println("\n");

// 2)
        Stream<Integer> integerStream02 = Stream.of(78, -8, 5, 38, 56, 78, -8, 5, 38, 56, 78, -8, 5, 38, 56);
        integerStream02.distinct() // добавляет элементы по порядку, избегая повторение элементов. Метод без аргумента;
        .sorted() // правила сортировки определены методом compareTo
        .forEach(System.out::println);

        System.out.println("\n");

// 3)
        // anyMatch - true если хотя бы один элемент соответствует условию
        Stream<Integer> integerStream03 = Stream.of(-7, -54, 23, 34, -2, 78, -8, 10, 5, 38, 56, 3, -29);
        System.out.println(integerStream03.anyMatch(num -> num == 0)); //Predicate<? super T> predicate) boolean test (T t)

        // allMatch - true если все элементы соответствуют условию
        Stream<Integer> integerStream04 = Stream.of(-7, -54, 23, 34, -2, 78, -8, 10, 5, 38, 56, 3, -29);
        System.out.println(integerStream04.allMatch(num -> num > 0));

        // noneMatch - true если не один элемент не соответствует условию
        Stream<Integer> integerStream05 = Stream.of(-7, -54, 23, 34, -2, 78, -8, 10, 5, 38, 56, 3, -29);
        System.out.println(integerStream05.noneMatch(num -> num > 10000));

        System.out.println("\n");

// 4)

        String[] colors = {"white", "black", "yellow", "green", "blue", "red"};
        // findFirst вернёт первый элемент, findAny - любой
        // Optional<T> - java 8, null save container
        String color = Arrays.stream(colors)
        .findAny()
        .get(); // если внутри null, программа падает с ошибкой

        color = Arrays.stream(colors).findAny().orElse("yellow"); // вернёт значение по умолчание
        boolean isPresent = Arrays.stream(colors).findAny().isPresent(); // проверяет наличие элемента, после можно использовать get

        Arrays.stream(colors)
                .skip(2) // пропустить указанное количество первых по счёту элементов
                .filter(colorElem -> colorElem.startsWith("g")) // оставить в потоке цвета начинающиеся на "х" буквы
                .forEach(System.out::println);

        System.out.println("\n");

// выбрать минимальный по стоимости курс
        ArrayList<Course> courses = new ArrayList<>(Course.getInstances(7));
        System.out.println(courses);
/*
        Course minByPrice = courses.stream()
                .min((c1, c2) -> (int) (c1.getPrice() - c2.getPrice()))
                .orElse((Course) Course.getInstances(1));
        System.out.println(minByPrice);

        System.out.println("\n");

// выбрать максимальный по стоимости курс
          Course maxByPrice = courses.stream()
                .max((c1, c2) -> (int) (c1.getPrice() - c2.getPrice()))
                .orElse((Course) Course.getInstances(1));
        System.out.println(minByPrice); */

        //sort()
        //sort(Comparator c) - перегруженный метод

    //Course[] дороже 20000
        Course[] coursesAll = courses.stream()
                .filter(course -> course.getPrice() > 20000)
                .toArray(Course[]::new); // ссылка на конструктор массива
        for(Course c : coursesAll) System.out.println(c);

        System.out.println("\n");

        // List<Course> длительность >=3 месяца и стоимость каждого увеличиваться на 5000
        // map - Function mapper -> R apply(T t);
        // peek - Consumer action -> void accept(T t);
        List<Course> courseList = courses.stream()
                .filter(course -> course.getDuration() >=3)
                .peek(course -> course.setPrice(course.getPrice() + 5000))
                .collect(Collectors.toList()); // .toList() метод создаёт мапу/коллекцию
                //.collect(Collectors.toSet());  // .toSet() метод создаёт множество
                //.collect(Collectors.toCollection(ArrayList::new);  // создание конкретной указанной коллекции


        // map - элементы массива, значения - размер строки
        colors = new String[] {"white", "black", "yellow", "green", "blue", "red"};
        Map<String, Integer> map01 = Arrays.stream(colors)
                .collect(Collectors.toMap(
                        elem -> elem,// ключи Function keyMapper
                        elem -> elem.length(),// значения Function valueMapper
                        (elemValue1, elemValue2) -> elemValue1// как сформировать значение, если ключи одинаковы BinaryOperator<U> R apply(T t, U u)
                ));
        System.out.println(map01);

        //ключи - названия
        //значения - списки курсов
        //groupingBy - Function classifier - R apply(T t)
 /*       Map<String, List<Course>> map02 = courses.stream()
                .collect(Collectors.groupingBy(course -> course.getName())
                .collect(Collectors.groupingBy(
                        course -> course.getDuration(),
                        Collectors.toCollection(ArrayList::new)
                ));
*/


    }
}

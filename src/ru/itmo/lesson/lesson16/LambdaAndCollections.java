package ru.itmo.lesson.lesson16;

import java.util.function.Consumer;
import java.util.function.Predicate;

import static ru.itmo.lesson.lesson16.Course.duration;

public class LambdaAndCollections {
    public static void main(String[] args) {

        University university = new University();
        university.addCourses(Course.getInstances(15));

        // перебор коллекции - метод foreach
        // Consumer<T> - void accept(T t);
        Consumer<Course> soutCourse = course -> System.out.println(course);
        university.getCourses().forEach(soutCourse);
        university.getCourses().forEach (course -> System.out.println(course));

        // увеличить стоимость курса на 10%
        university.getCourses().forEach(course -> course.setPrice(course.getPrice() * 1.1));

        // вывести в консоль курсы длительностью менее 3х месяцев
        Consumer<Course> courses = course -> {
            if(course.getDuration()  < duration){
                System.out.println(course.getName());
            }
        };
        university.getCourses().forEach(courses);
/////////////////////////////////////////////////////////////////////////////////////////////////////

        // Predicate<T> boolean test(T t);
        Predicate<Course> ifLess20000 = course -> course.getPrice() < 20000;
        Predicate<Course> ifLess3Month = course -> course.getDuration() < 3;
        Predicate<Course> someName = course -> course.getName().equals("ejj");


    }
}
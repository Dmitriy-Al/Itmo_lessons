package ru.itmo.lesson.lesson13;

public class MethodsApp {
    public static void main(String[] args){

        String[] strings = {"aaa", "bbb", "ccc"};
        String string = "abc";

        System.out.println(CustomUtils.inArray(strings, 12));
        //System.out.println(CustomUtils.<String>inArray(strings, 12)); // Если Т явно обозначен как String, передаём только String

        Integer[] integers = {1, 2, 3};
        Integer integer = 123;

        System.out.println(CustomUtils.<Integer>inArray(integers, integer));

        System.out.println(CustomUtils.compareHashCode(12, "12"));
        System.out.println(CustomUtils.<Integer, String>compareHashCode(12, "12"));






    }
}

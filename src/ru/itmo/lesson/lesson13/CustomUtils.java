package ru.itmo.lesson.lesson13;
// generic типы
public class CustomUtils {

    // типизировааные (generic) методы

    public static <T> boolean inArray(T[] array, T element){
        // у Т параметров можно вызывать только методы класса Object
        // при компиляции тип Т преобразуется в Object
        for (T t : array) {
            if(element.equals(t)) return true;
        }
        return false;
    }

    public static <T extends Number, K extends String> int compareHashCode(T first, K second){
        // T скомпилируется в Number, К в String
        // у T можно вызвать методы Number, у К - String
        // при вызове compareHashCode: Т - Number или любой его наследник, К - String или любой его наследник
        return Integer.compare(first.hashCode(), second.hashCode());
    }



}

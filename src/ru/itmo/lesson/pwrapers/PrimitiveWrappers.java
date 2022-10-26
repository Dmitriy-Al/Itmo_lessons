package ru.itmo.lesson.pwrapers;

public class PrimitiveWrappers {
    public static void main(String[] args) {
        // byte -
        // short -
        // int -
        // long -
        // float -
        // double -
        // boolean -
        // char -

        // использование примитивов или соответствующих классов-оберток

        int num = 567;
        Integer count02 = 54;
        Integer count01 = new Integer(54); // неправильный способ объявления

        // автоупаковка - переменнаой класса-обёртки присваивается значение примитива
        Integer age = 38;
        age = num;

        // автораспаковка - примитивному типу присваивается значение переменной класса-обёртки
        double price;
        Double someDouble = 56.89;
        price = someDouble;

        // Правила автоупаковки и автораспаковки
        // 1. автоупаковка не работает, если примитив не соответствует типу класса обертки
        // Byte byteObj = 500;
        // Byte byteObj = 400;
        byte one = 1;
        // Integer i = (Integer) one;
        Integer i = (int) one;

        // 2. на автораспаковку данное правило не распространяется
        Byte two = 2;
        int num2 = two; // автораспаковка + неявное приведение типов

        Integer three = 3;
        // byte num3 = three; ??? Приводить типы следует методом value(!)

        // 3. параметры (аргументы) методов подлежат правилам автораспаковки и автоупаковки
        printSqrt(78);
        Integer integer = 45;
        printNum(integer);

        // 4. автораспаковка и автоупаковка не работают с массивами
        double[] doubles = {45.88, 123.701, 3.8};
        // printDoubles(doubles); автоупаковка не работает

        Integer first = 34;
        Integer second = 34;
        System.out.println(first == second);

        first = 200;
        second = 200;
        System.out.println(first == second);// знначения от -128 до 127 можно сравнивать через ==, но делать так не следует
        // эти значения хранятся в пулле чмсел
    }

    public static void printDoubles(Double[] doubles){
        for (Double aDouble : doubles) {
            System.out.println(aDouble);
        }
    }

    public static void printSqrt(Integer i){
        Integer res = i * i;
        System.out.println(res);
    }
    public static void printNum(int i){
        System.out.println(i);
    }
}
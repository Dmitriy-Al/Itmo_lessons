package homework1;

public class TaskOne {
    public static void main(String[] args) {


        // Задача № 1: даны длина, ширина и высота прямоугольного параллелепипеда. Найти и вывести в консоль его площадь.

        int length = 100, width = 30, height = 50;

        int area = ((length * width) + (length * height) + (width * height)) * 2; //скобки добавлены для удобства чтения

        System.out.println("The area of figure is: " + area);


        // Задача № 2: дано целое число. Найти и вывести в консоль число в кубе.
        // Реализация сложнее чем требует задание, но очень хотелось выполнить таким образом т.к. самостоятельно его придумал когда-то=)

        long number = 5; // Целое число
        int level = 3;   // Степень
        int count = 0;   // Счётчик итераций

        for (long i = number; count < level; number *= i) {
            count++;
            if (count == level) {
                System.out.println("Number " + i + " in " + level + " lvl = " + number);
            }
        }


        // Даны две переменные типа double - время (часы) и расстояние (км). Найти и вывести в консоль скорость м/с.

        double hour = 4.0, wayLength = 150.0;

        double speed = (wayLength * 1000) / (hour * 3600);

        System.out.println("Speed = " + speed + " m/s" );


        // Арифметические операторы: найти сумму цифр двузначного числа (начало алгоритма подсмотрено в иннете).

        int num = 13;

        int res = (num / 10) + (num % 10);

        System.out.println("Result is " + res);

    }
}

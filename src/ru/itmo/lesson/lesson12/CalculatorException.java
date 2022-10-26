package ru.itmo.lesson.lesson12;
// Можно создать свои собственные типы исключений
// Исключения времени выполнения наследуем от RunTime
// Исключения времени компиляции наследуем от Exception

public class CalculatorException {

    // можно добавлять свои свойства, методы и конструкторы
    // можно вызывать конструкторы родителя

    public CalculatorException(String message){
        super();
    }

    public CalculatorException(String message, Throwable cause){
        super();
    }




}

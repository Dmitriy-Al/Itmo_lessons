package ru.itmo.lesson.lesson29annotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Config {
    // параметры аннотации: строки, примитивы и перечисления

    String configFile(); // обязательный параметр, д.б. указан при объявлении аннотации

    long version() default 1; // необязательный параметр со значением, можно не указывать

}

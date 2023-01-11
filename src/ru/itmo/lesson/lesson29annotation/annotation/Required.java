package ru.itmo.lesson.lesson29annotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Объявление аннотации
@Target(ElementType.FIELD)
// @Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)// аннотация времени выполнения
public @interface Required {







}

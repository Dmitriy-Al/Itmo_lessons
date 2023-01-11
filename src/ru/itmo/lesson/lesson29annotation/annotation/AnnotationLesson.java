package ru.itmo.lesson.lesson29annotation.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class AnnotationLesson {
    public static  void main(String[] args){

       Class<Cat> catClass = Cat.class;
        // получение ссылок на аннотации

        Annotation[] annotations = catClass.getAnnotations();
        System.out.println("Annotation " + Arrays.toString(annotations));

        if(catClass.isAnnotationPresent(Config.class)){ // проверка, есть ли аннотация Config у catClass
            System.out.println("Conf ");

        // получение значений параметров аннотации Сonfig
        Config config = catClass.getDeclaredAnnotation(Config.class);
        System.out.println(config.configFile());
        System.out.println(config.version());
        }

        Field[]  catFields = catClass.getDeclaredFields();
        for(Field field : catFields){
            if(field.isAnnotationPresent(Required.class)){
                System.out.println(field.getName() + " поле с аннотацией Required");
            }
        }

        // реализовать метод, public static Object getInstance(Class<?> cls) {}
        // принимающий на вход ссылку на класс и возвращающий
        // экземпляр данного класса или null


    }
}

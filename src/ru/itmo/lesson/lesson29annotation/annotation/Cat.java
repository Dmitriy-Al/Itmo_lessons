package ru.itmo.lesson.lesson29annotation.annotation;

@Config(configFile = "animals.properties")
//@Config(configFile = "animals.properties", version = 2) если используем + необязательную аннотацию
public class Cat {

    @Required
    private String name;
    @Required
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
/*
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

 */
}
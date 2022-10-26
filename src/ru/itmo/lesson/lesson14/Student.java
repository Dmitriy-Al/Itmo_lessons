package ru.itmo.lesson.lesson14;

// компараторы: возраст/имена

import java.util.Comparator;

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() < o2.getAge()) return -1;
        if (o1.getAge() > o2.getAge()) return 1;
        return 0;
    }
}
/*
class NameComparator implements Comparator<Student>{

    @Override
    public String compare (Student o1, Student o2) {
        if (o1.getName() <  o2.getName()) return "-1";
        if (o1.getName() >  o2.getName()) return "1";
        return "0";
    }
}
*/

public class Student implements Comparable<Student> {


    private final int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

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

    @Override
    public int hashCode() {
        return id;
    }

/*
    public boolean equals(Object o){
        if(this == 0) return true;
        if(!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id = student.id;
    }

*/

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
/////////////////////////////////////////////////////////////

    // правила сравнения текущего объекта с объектом который передается в метод
    // 0 объекты равны
    // (меньше 0) текущий объект меньше объекта который передаётся в метод
    // (больше 0) текущий объект больше объекта, который передается в метод

    @Override
    public int compareTo(Student o) {
//        return Integer.compare(this.getId, o.getId());
//        if(this.getId < o.getId()) return -1;
//        if(this.getId > o.getId()) return 1;
        return 0;
    }

    // TODO:: переопределить метод equals -
    //  объекты считать равными, если их id равны

}
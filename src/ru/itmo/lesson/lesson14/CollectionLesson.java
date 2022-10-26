package ru.itmo.lesson.lesson14;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionLesson extends CollectionsLesson {
    public static void main(String[] args) {


        // LinkedList: интерфейсы List, Deque (Queue)
        // двунаправленный связанный список
        // можно хранить null
        // можно хранить дублирующиеся элементы
        // порядок хранения элементов соответствует порядку добавления
        // нельзя задать первоначальную емкость и уменьшать емкость по размеру
        // ArrayList продуктивнее, поэтому предпочтителен, если нет постоянного добавления в середину коллекции

        // LinkedList
        // private Node first;
        // private Node last;

        // class Node
        // private Node node;
        // private value;

        // add(student1);
        // new Node[value-student1, next-null] - #1
        // LinkedList[first-#1, last-#1]

        // add(student2);
        // Node#1 [next-#2]
        // new Node[value-student2, next-null] - #2
        // LinkedList[first-#1, last-#1]

        // Node(student1)  <-> Node(student2) <-> Node(student3) -> null;
        // LinkedList:
        // first -> Node(student1)
        // last Node(student3)
        // get[] - получение по индексу не напрямую как в ArrayList, а путём итерации, что затратно

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Set
        // 1. не хранят дублирующие элементы, хранят только уникальные
        // 2. обязательно переопределяем метод equals у элементов, которые добавляются в set
        // 3. нет доступа к индексам

        System.out.println("HashSet");
        // 1. основан на хеш таблице (обязательно переопределять метод hashCode у элементов, которые добавляются в hashset
        // 2. порядок хранения может отличаться от порядка добавления
        // 3. можно хранить null

        HashSet<Student> studentHashSet = new HashSet<>();
//        studentHashSet = new HashSet<>(studentArrayList); так можно
        // доступны все методы коллекций кроме индексов

        int age = 0;
        for (Student s : studentHashSet){
//            age += student.getAge();
        }

        // LinkedHashSet
        // 1. медленнее чем HashSet
        // 2. порядок хранения элементов соответствует порядку добавления

        // TreeSet
        // 1. добавление null приведёт к ошибке
        // 2. хранит элементы в отсортированном виде
        // 3. использует алгоритм красно-чёрного бинарного дерева

        // Для добавления элементов в TreeSet
        // 1. чтобы тип (класс), элементы которого будут храниться в TreeSet
        // реализовывал интерфейс Comparable и его метод compare

        // 2. создать класс - компоратор
        Comparator<Student> comparator01 = new AgeComparator();
//      Comparator<Student> comparator01 = new NameComparator();

        TreeSet<Student> studentTreeSet02 = new TreeSet<>(comparator01);

    }
}
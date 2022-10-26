package ru.itmo.lesson.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionsLesson {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Maxim", 17);
        Student student2 = new Student(2, "Anna", 21);
        Student student3 = new Student(3, "Paul", 23);
        Student student4 = new Student(4, "Helen", 19);
        Student student5 = new Student(4, "Helen", 19);

        // 1. Однопоточное или многопоточное приложение
        // 2. возможность хранить дублирующие элементы
        // 3. возможность хранить элементы в порядке добавления
        // 4. возможность хранить элементы в отсортированном виде

        //ПОСМОТРЕТЬ ДОКУМЕНТАЦИЮ ИНТЕРФЕЙСА Collection


        System.out.println("ArrayList");
        // реализован на основе массива
        // можно хранить null
        // можно хранить дублирующиеся элементы
        // порядок хранения элементов соответствует порядку добавления

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList = new ArrayList<>(30);

        // количество элементов коллекции
        System.out.println(studentArrayList.size());

        studentArrayList.add(student1); //0
        studentArrayList.add(student2); //1
        studentArrayList.add(1, student3); // замены не происходит, элементы смещаются [student1, student3, student2]
        // обращение к несуществующему индексу влечёт за собой ощибку IOBE

        studentArrayList.add(3, student1);
        studentArrayList.trimToSize(); // урезает ёмкость до фактического кол-ва элементов

        // получение элементов
        System.out.println(studentArrayList.get(3));

        // удаление
        //1.
        Student remove = studentArrayList.remove(3); // +возвращает ссылку на удалё1нный элемент
        System.out.println(remove);

        //2.
        boolean result  = studentArrayList.remove(student1); // сравнение методом equals и возврат boolean, удаляет единственный первый найденный элемент
        System.out.println(result);

        //3. удаление оптом
        Student[] students = {student1, student2};

        List<Student> studentsList = Arrays.asList(students); // список из массива, возвращает список - list
        studentArrayList.removeAll(studentsList);

        studentArrayList.clear();

        studentArrayList.addAll(Arrays.asList(student1, student2, student3));

        for(Student student : studentsList){
            System.out.println(student.getId());
            student.setName("student " + student.getName());
            // в циклах for нельзя удалять элементы коллекций
        }

        // удалить всех студентов старше 20 лет
        Iterator<Student> iterator = studentArrayList.iterator();
        while (iterator.hasNext()) {
           if(iterator.next().getAge() > 20) iterator.remove(); // удаление
        }

    }
}
package ru.itmo.lesson.lesson6;

// полное имя класса : имя пакета + имя класса
// полное имя класса ru.itmo.lesson.lesson6 + Application

import ru.itmo.lesson.lesson6.books.Author;
import ru.itmo.lesson.lesson6.books.Book;

public class Application {

    public static void main(String[] args) {

        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author("Fedor", "Dostoevsky");
        Book book1 = new Book();

        author1.name = "Haruki";
        author1.surname = "Murokami";

        author2.setFullName("Viktor", "Pelevin");


        System.out.println(author1.getFullName());
        author2.printFullName();
        System.out.println(author3.getFullName());

        String s = author3.getFullName();

        System.out.println(book1.toString());

        book1.setAuthor(author3);
        book1.setPageCount(11);
        System.out.println(book1.toString());
        System.out.println(book1.getAboutBokInfo());

    }
}

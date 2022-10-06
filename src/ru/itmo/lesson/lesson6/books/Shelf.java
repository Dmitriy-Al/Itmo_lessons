package ru.itmo.lesson.lesson6.books;

public class Shelf {

    private String color = "white";

    private Book[] books = {};

    public Shelf(int bookCount){ // добалять без цикла?
        if(bookCount < 0){
            throw new IllegalArgumentException("Err");
        } else {
            books = new Book[bookCount];
        }
    }

    public void addBook(Book book){
        for(int i = 0; i < books.length; i++){
            if(books[i] == null){
                books[i] = book;
                return;
            }
        }
        System.out.println("Place is finished");
    }

    public String getColor() {
        return color;
    }



}

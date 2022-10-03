package ru.itmo.lesson.lesson6.books;

public class Book {

    private String title;
    private int pageCount;
    private Author author;

    public Book(){}

    public Book(String title){
        this.title = title;
    }

    public Book(String title, Author author){
        this.title = title;
        setAuthor(author);
    }

    public void setPageCount(int count) {
        if (count < 10){
            throw new IllegalArgumentException("Bigger 10 page only!");
        } else {
            this.pageCount = count;
        }
    }

    public void setAuthor(Author author){
        if(author == null){
            throw new IllegalArgumentException("author is null");
        }else{
            this.author = author;
        }
    }

    public String getAboutBokInfo(){
        return "author " + author + ", title is " + title + ", " + pageCount + " pages";
    }


    @Override
    public String toString() {
        return "Book " + title + " " + pageCount + " " + author;
    }

}

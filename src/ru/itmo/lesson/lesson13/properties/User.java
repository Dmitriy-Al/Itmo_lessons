package ru.itmo.lesson.lesson13.properties;

public class User<T> {

    private T id; // при компиляции Т = Object, внутри класса можно вызвать только методы Object
    private String login;



    public void setId(T id){
        this.id = id;
    }

    public T getId(){
        return id;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getLogin(){
        return login;
    }

}

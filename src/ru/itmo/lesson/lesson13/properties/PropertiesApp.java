package ru.itmo.lesson.lesson13.properties;

public class PropertiesApp {
    public static void main(String[] args) {

        User<String> user0 = new User<>();

        user0.setLogin("pass");
        //user.setId(123); если не прописывать тип Т в объекте, плохой паттерн
        user0.setId("123");

        String strId = user0.getId();
        System.out.println(strId);

        User<Integer> user1 = new User<>();

        user1.setLogin("admin");
        user1.setId(123);

        System.out.println(user1.getId() + ", " + user1.getLogin());


        PairContainer<String, Integer> container01 = new PairContainer<>("password", 321);

        System.out.println(container01.getKey() + ", " + container01.getValue());

        PairContainer<String, User<String>> container02 = new PairContainer<>("pass", user0);// User следует указывать с уже определённым типом данных, иначе вернётся Object

        System.out.println(container02.getKey() + ", " + container01.getValue());

        PairContainer<String, PairContainer<Integer, User<String>>> container03 = new PairContainer<>("password", new PairContainer<>(1, user0));
        System.out.println(container03.getKey() + ", " + container03.getValue());

    }
}
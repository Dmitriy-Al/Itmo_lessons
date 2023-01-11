package ru.itmo.lesson.lesson23strategypattern;

public class Strategy {
    public static  void main(String[] args){


        YaMoney ya = new YaMoney();
            Account account = new Account(ya);

      Order order01 = new Order();
      account.setOrder(order01);
      order01.getSum(100.000);

        Order order02 = new Order();
        account.setOrder(order01);
        order01.getSum(100000);




    }
}

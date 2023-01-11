package ru.itmo.lesson.lesson23strategypattern;
// ПАТТЕРН STRATEGY
public class Account {

    private Order currentOrder;
    private Payment payMethod;

    public Account(Payment payMethod){
        this.payMethod = payMethod;
    }

    public void setPaymentMethod(Payment payMethod){
                this.payMethod = payMethod;
    }

    public void payCurrentOrder(){
       payMethod.pay(currentOrder.getSum(1));
    }


    public void setOrder(Order order){
        this.currentOrder = order;
    }

}

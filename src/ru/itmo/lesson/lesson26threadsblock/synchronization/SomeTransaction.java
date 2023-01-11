package ru.itmo.lesson.lesson26threadsblock.synchronization;

public class SomeTransaction extends Thread{
    private SomeAccount accounts;

    public SomeTransaction(SomeAccount account) {
        accounts = account;
    }

    @Override
    public void run() {
        // synchronized блок - блокирует монитор объекта из ()
        // монитор будет разблокирован, когда все инструкции
        // из synchronized блока будут выполнены

        // synchronized блоков может быть несколько,
        // их можно вкладывать друг в друга

        // операции, которые не связаны с изменением свойств блокируемого объекта
        // (в данном случае account) не должны вкладываться в synchronized блок
        synchronized (accounts) {
            accounts.upBalance(10);
        }

    }
}
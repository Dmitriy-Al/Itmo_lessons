package lesson14homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageTask {

    public static void main(String[] args) {

        List<Message> messages = Message.generate(34);
        for (Message m : messages) {
            System.out.println(m);
        }

        countEachPriority(messages); // TODO:  Подсчитать количество сообщений для каждого приоритета. Ответ в консоль

        countEachCode(messages); // TODO: Подсчитать количество сообщений для каждого кода сообщения. Ответ в консоль

        uniqueMessageCount(messages);  // TODO: Подсчитать количество уникальных сообщений. Ответ в консоль

        uniqueMessagesInOriginalOrder(messages);  // TODO: вернуть только неповторяющиеся сообщения и в том порядке, в котором они встретились в первоначальном списке

        removeEach (messages, MessagePriority.HIGH);  // TODO: удалить из коллекции каждое сообщение с заданным приоритетом

        removeOther (messages, MessagePriority.LOW);  // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет

    }


    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        int countLowPriority = 0;
        int countMediumPriority = 0;
        int countHighPriority = 0;
        int countUrgentPriority = 0;

        for (Message m : messageList) {
            if (m.getPriority() == MessagePriority.LOW) {
                countLowPriority++;
            } else if (m.getPriority() == MessagePriority.MEDIUM) {
                countMediumPriority++;
            } else if (m.getPriority() == MessagePriority.HIGH) {
                countHighPriority++;
            } else countUrgentPriority++;
        }
        System.out.println("\nCount of low priority message = " + countLowPriority + ", medium priority = " + countMediumPriority +
                ", high priority = " + countHighPriority + ", urgent priority = " + countUrgentPriority + "\n");
    }


    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        Map<Integer, Integer> countMessageWithCode = new HashMap<>();

        for (Message m : messageList) {
            if (countMessageWithCode.containsKey(m.getCode())) {
                countMessageWithCode.put(m.getCode(), countMessageWithCode.get(m.getCode()) + 1);
            } else {
                countMessageWithCode.put(m.getCode(), 1);
            }
        }
        for (Map.Entry<Integer, Integer> m : countMessageWithCode.entrySet()) {
            System.out.println("Message code: " + m.getKey() + ", count of message: " + m.getValue());
        }
    }// Уже поздно ночью понял, что не надо было делать через Map, задачи на коллекции, погодя перепишу;


    public static void uniqueMessageCount(List<Message> messageList) {
        System.out.println("\nПодсчитать количество уникальных сообщений: ");
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        List<Message> uniqueMessage = new ArrayList<>();

        for (Message m : messageList) {
            for(int i = 0; i < uniqueMessage.size(); i++){
                if( uniqueMessage.get(i).equals(m)){
                    uniqueMessage.remove(i);
                }
            }
            uniqueMessage.add(m);
        }

        for(Message m : uniqueMessage){
            System.out.println(m);
        }
        System.out.println("Уникальных сообщений: " + uniqueMessage.size() + "\n");
    }


    public static List<Message> uniqueMessagesInOriginalOrder (List < Message > messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        List<Message> uniqueMessagesInOriginal = new ArrayList<>();

        for(Message m : messageList){
            uniqueMessagesInOriginal.add(m);
            for(int i = 0; i < uniqueMessagesInOriginal.size(); i++){
                if(i != 0 && uniqueMessagesInOriginal.get(i - 1).equals(m)){
                    uniqueMessagesInOriginal.remove(uniqueMessagesInOriginal.size() - 1);
                }
            }
        }
        System.out.println("First List  " + messageList);
        System.out.println("Second List " + uniqueMessagesInOriginal);
        return uniqueMessagesInOriginal;
    }



    public static void removeEach (List < Message > messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления

        List<Message> removeEachList = new ArrayList<>(messageList); // Дубль-коллекция, чтобы не менять исходную коллекцию
        System.out.println("\nList before the method: " + removeEachList);
        for (int i = 0; i < removeEachList.size(); i++) {
            for (int x = 0; x < removeEachList.size(); x++) {
                if(removeEachList.get(x).getPriority() == priority)
                    removeEachList.remove(x);
            }
        }
        System.out.println("List after the method:  " + removeEachList);
    }



    public static void removeOther (List < Message > messageList, MessagePriority priority){
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления

        List<Message> removeExceptOnePriority = new ArrayList<>(messageList); // Дубль-коллекция, чтобы не менять исходную коллекцию
        System.out.println("\nList before the method: " + removeExceptOnePriority);
        for (int i = 0; i < removeExceptOnePriority.size(); i++) {
            for (int x = 0; x < removeExceptOnePriority.size(); x++) {
                if(removeExceptOnePriority.get(x).getPriority() != priority)
                    removeExceptOnePriority.remove(x);
            }
        }
        System.out.println("List after the method:  " + removeExceptOnePriority);
    }

}

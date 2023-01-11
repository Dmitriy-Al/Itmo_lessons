package ru.itmo.lesson.lesson21tcp;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientIO {

    private String ip; //адрес сервера
    private int port; // порт на котором серверная машина ожидает клиента

    public TCPClientIO(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name");
        String name = scanner.nextLine();

        while (true) {
            System.out.println("Input message");
            String text = scanner.nextLine();

            Message message = new Message(name, text);

            try (Connection<Message> connection = new Connection<>(new Socket(ip, port))) {
                connection.sendMessage(message);
                Message fromServer = connection.readMessage();
                System.out.println("Message from server: " + fromServer);
            } catch (IOException e) {
                System.out.println("Exc. IOE n CNFe");
            } catch (Exception e) {
                System.out.println(" Exc.");
            }
        }
    }

    public static void main(String[] args) {
        new TCPClientIO("127.0.0.1", 8090).run();
    }

}

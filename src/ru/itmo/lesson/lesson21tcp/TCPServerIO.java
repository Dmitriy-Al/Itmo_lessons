package ru.itmo.lesson.lesson21tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerIO {

    private int port;

    public TCPServerIO(int port) {
        this.port = port;
    }

    public void run() { //ServerSocket работает с IO пакетом
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("server started...");

            while (true) {
                Socket socket = serverSocket.accept(); // программа останавливает работу в ожидании подключения
                // взаимодействие с клиентом
                Connection<Message> connection = new Connection<>(socket);

                Message fromClient = connection.readMessage();
                System.out.println("From client: " + fromClient);

                Message message = new Message("Server", "Text from server");
                connection.sendMessage(message);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Exceptions ");
        }
    }

    public static void main(String[] args) {

        new TCPServerIO(8090).run();

    }
}

package ru.itmo.lesson.lesson19;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIO {

    private static void writeToFile(String data) {
        Path fileName = Path.of("C:/Users/admit/OneDrive/Рабочий стол/nio-data.txt");

        try (FileChannel channel = FileChannel.open(fileName, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) { // Канал принимает
            // в качестве параметра текст, CREATE - создаёт новый файл, если тот не существует, APPEND - Если файл открыт для доступа на запись,
            // то байты будут записаны в конец файла, а не в начало. Если файл открыт для доступа на запись другими программами, то это зависит от файловой системы

            byte[] strBytes = data.getBytes(); // кодирует строку в последовательность байтов, сохраняет результат в новый массив байтов.

            ByteBuffer buffer = ByteBuffer.allocate(strBytes.length); // Буфер это блок памяти, в который можно записывать/читать информацию
            buffer.put(strBytes); // Этот метод переносит все содержимое данного исходного массива байтов в этот буфер.
            buffer.flip(); // Переключает режим буфера с режима записи на режим чтения
            channel.write(buffer); // пишем из buffer в channel

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAllBytes() {
        Path pathFileName = Path.of("C:/Users/admit/OneDrive/Рабочий стол/nio-data.txt"); // Путь к создаваемому файлу

        try (FileChannel inChannel = FileChannel.open(pathFileName)) { // Канал это шлюз, он позволяет получить доступ к устройствам ввода/вывода, таким как файл или сокет

            long fileSize = inChannel.size(); // Текущий размер файла в канале

            ByteBuffer buffer = ByteBuffer.allocate((int) fileSize); // Буфер это блок памяти, в который можно записывать/читать информацию
            // Метод .allocate() используется для выделения нового буфера с емкостью в качестве параметра. Метод allocate() выдает исключение
            // IllegalArgumentException в случае, если переданная емкость является отрицательным целым числом.


            inChannel.read(buffer);// Из inChannel читаем в buffer

            buffer.flip(); // Переключает режим буфера с режима записи на режим чтения. Он также устанавливает позицию обратно в ноль и
            // устанавливает лимит, в котором позиция была во время записи

            System.out.println(new String(buffer.array())); // Возвращает массив байтов, который поддерживает этот буфер (необязательная операция). Изменения содержимого
            // этого буфера приведут к изменению содержимого возвращаемого массива, и наоборот. Метод hasArray перед вызовом этого метода, позволяет убедиться, что
            // этот буфер имеет доступный резервный массив.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeToFile("Некий записываемый текст\n");
        readAllBytes();
    }
}
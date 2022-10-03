package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("// Задача № 1:");
        // Задача № 1: Заполните массив на N элементов случайным целыми числами и выведете максимальное, минимальное и
        // среднее арифметическое значение элементов массива

        int[] arrayOne = new int[10];

        int min = 100;
        int max = 0;
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            arrayOne[i] = (int) (Math.random() * 100);

            if (min > arrayOne[i]) {
                min = arrayOne[i];
            } else if (arrayOne[i] > max) {
                max = arrayOne[i];
            }
            sum += arrayOne[i];
        }

        System.out.println(Arrays.toString(arrayOne) + ";  min = " + min + ", max = " + max + ", middle of numbers amount = " + sum / arrayOne.length);


        System.out.println("// Задача № 2:");
        // Задача № 2: Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)

        int[] arrayTwo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[(arrayTwo.length - 1) - i] + ", ");
        }


        System.out.println("\n // Задача № 3:");
        // Задача № 3: Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив (добавлять новое слово в
        // массив можно только, если в нем его еще нет). В итоге в массиве будут только уникальные слова. Выход из программы по слову exit (слово 'exit' в
        // массив не добавлять) или если массив заполнен. Перед завершением программы, вывести получившийся массив в консоль


        String[] arrayThree = new String[5];

        int iterationCounter = 0;

        while (iterationCounter < arrayThree.length) {
            int count = 0;
            System.out.println("Input word");
            String word = scan.nextLine();

            if (word.equals("exit")) break;

            while (count < arrayThree.length) {
                if (!word.equals(arrayThree[count]) && count == arrayThree.length - 1) {  // Можно ещё так: if (!word.equals(Arrays.toString(arrayThree)) && count == arrayThree.length - 1) но
                    arrayThree[iterationCounter] = word;                                  // думаю, сравнивать методом затратнее для ресурсов системы
                    iterationCounter++;
                } else if (word.equals(arrayThree[count])) {
                    System.out.println("The same word is already exist!");
                    break;
                }
                count++;
            }
        }

        StringBuilder strBuild = new StringBuilder();

        for (String string : arrayThree) {
            strBuild.append(string).append(" ");
        }

        System.out.println(strBuild);


        System.out.println("// Задача № 4:");
        // Задача № 4: Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
        //Предложение для поска длинного слова: "в предложении все слова разной длины"* (самостоятельно найти метод преобразования строки в массив строк).

        String text = "In the text all words have different length"; // У меня sout в кирилице выдаёт разные символы, поэтому пишу на английском

        String[] arrayFour = text.split(" ");

        String maxSize = arrayFour[0];

        for (String s : arrayFour) {
            if (s.length() > maxSize.length()) {
                maxSize = s;
            }
        }

        System.out.println(maxSize);


        System.out.println("// Задача № 5:");
        // Задача № 5: Задать массив. Отрицательные элементы массива перенести в новый массив.
        //Размер массива должен быть равен количеству отрицательных элементов.

        int counter = 0;

        int[] arrayFive = {-5, 4, -3, 2, -1, 1, -2, 3, -4, 5};

        for (int i : arrayFive) {
            if (i < 0) {
                counter++;
            }
        }

        int[] collector = new int[counter];

        for (int i : arrayFive) {
            if (i < 0) {
                collector[counter - 1] = i;
                counter--;
            }
        }

        System.out.println(Arrays.toString(collector));

    }
}

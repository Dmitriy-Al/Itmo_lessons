package homework3;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Задача № 1:

        for (int i = 90; i >= 0; i -= 5) {
            System.out.print(i + ", ");
        }

        System.out.println();

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + ", ");
        }

        System.out.println();

        // Задача № 2:

        System.out.println("Input amount of plates");

        int plates = scan.nextInt();

        System.out.println("Input amount of liquidsoap");

        double liquidSoap = scan.nextInt();

        while (plates >= 0 && liquidSoap >= 0) {
            if (plates == 0 || liquidSoap == 0) {
                System.out.println("Rest of the liquidsoap is: " + liquidSoap + ", rest of plates = " + plates);
                break;
            }
            System.out.println("Rest of the liquidsoap is: " + liquidSoap);
            plates--;
            liquidSoap -= 0.5;
        }

        System.out.println();


        // Задача № 3:

        double random = Math.random() * 10;
        int quest = (int) random;

        while (true) {
            System.out.println("Input number");
            int number = scan.nextInt();

            if (number > 9 || number < 1) {
                System.out.println("Number is wrong, try again");
            } else if (number > quest) {
                System.out.println("Number is to big, try again");
            } else if (number < quest) {
                System.out.println("Number is to small, try again");
            } else {
                System.out.println("You win!");
                break;
            }
        }

        System.out.println();


        // Задача № 4:

        System.out.println("Input number");
        int num = scan.nextInt();
        if (num < 2 || num > 100) {
            double temp = Math.random() * 100;
            num = (int) temp;
        }

        int ask = 0;
        int temp = 50;
        int min = 1;
        int max = 101;

        while (true) {
            System.out.println("Number = " + temp + "?");
            ask = scan.nextInt();

            if (ask == 1 && num == temp) {
                System.out.println("Computer guessed, number is " + temp);
                break;
            } else if (ask == 0) {
                System.out.println("Number is bigger?");
            }

            if (ask == 0 && num == temp) {
                System.out.println("Wrong!");
                break;
            }

            ask = scan.nextInt();

            if (ask == 1) {
                min = temp;
                temp += (max - min) / 2;
            } else if (ask == 0) {
                max = temp;
                temp -= (max - min) / 2;
            }
        }
    }
}

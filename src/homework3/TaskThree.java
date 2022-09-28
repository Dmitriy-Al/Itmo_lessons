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
            System.out.println("Rest of the liquidsoap is: " + liquidSoap);
            if (plates == 0 || liquidSoap == 0) {
                System.out.println("Rest of the liquidsoap is: " + liquidSoap + ", rest of plates = " + plates);
            }
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

        int num = 0;
        int temp = 50;
        int min = 1;
        int max = 101;
        int computerAsk = 0;
        String err = "Wrong! Try again";

        while (num < 2 || num > 100){
            System.out.println("Input random number from 2 to 100");
            num = scan.nextInt();
        }

        while (true) {
            System.out.println("Number = " + temp + "?");
            computerAsk = scan.nextInt();

            if (computerAsk == 1 && num == temp) {
                System.out.println("Computer guessed, number is " + temp);
                break;
            } else if (computerAsk == 0) {
                System.out.println("is number bigger?");
            } else {
                System.out.println(err);
                continue;
            }

            if (num == temp) {
                System.out.println(err);
                continue;
            }

            computerAsk = scan.nextInt();

            if (computerAsk == 1 && temp < num) {
                min = temp;
                temp += (max - min) / 2;
            } else if (computerAsk == 0 && temp > num) {
                max = temp;
                temp -= (max - min) / 2;
            } else {
                System.out.println(err);
            }
        }

    }
}

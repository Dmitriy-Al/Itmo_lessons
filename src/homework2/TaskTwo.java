package homework2;

public class TaskTwo {
    public static void main(String[] args) {


        // Задача № 1: дан номер месяца, в зависимости от того какой это месяц, вывести в консоль время года.

        int month = 6;

        if ((month == 12) || (month == 1) || (month == 2)) {
            System.out.println("It is winter");
        } else if ((month == 3) || (month == 4) || (month == 5)) {
            System.out.println("It is spring");
        } else if ((month == 6) || (month == 7) || (month == 8)) {
            System.out.println("It is summer");
        } else if ((month == 9) || (month == 10) || (month == 11)) {
            System.out.println("It is autumn");
        } else {
            System.out.println("It is impossible!");
        }


        // Задача № 2:

        double sum = 238.0;
        int saleCode = 9011;

        System.out.print("Summa before using coupon = " + (int) sum + "$, ");

        switch (saleCode) {
            case 4525:
                sum *= 0.7;
                break;
            case 6424:
            case 7012:
                sum *= 0.8;
                break;
            case 7647, 9011, 6612: //Случайно открыл для себя, что синтаксис позволяет писать условие через запятую;
                sum *= 0.9;
                break;
            default:
                System.out.print("the discount is 0% ; ");
        }

        System.out.println("after using coupon = " + (int) sum + "$");


        // Задача № 3:

        int count = 99;

        if (count <= 100 && count >= 90) {
            System.out.println("Congratulation, you got max score!");
        } else if (count <= 89 && count >= 60) {
            System.out.println("Grace, you've got middle score");
        } else if (count <= 59 && count >= 40) {
            System.out.println("You have got low score");
        } else if (count <= 39 && count >= 0) {
            System.out.println("Sorry, try it next time");
        } else {
            System.out.println("It's impossible");
        }


        // Задача № 3:

        double randomCount = Math.random() * 501;

        if (randomCount < 10) {
            randomCount += 10;
        }

        if (randomCount >= 25 && randomCount <= 200) {
            System.out.println("The number is inside row from 25 to 200; number is: " + (int) randomCount);
        } else {
            System.out.println("The number went out from 25 to 200; number is: " + (int) randomCount);
        }


        // Задача № 4:

        int age = 37;
        int exp = 1;

        if (age > 100) {
            System.out.println("We wil call you much later");
        } else if (exp < 5) {
            System.out.println("You can to work as an intern");
        } else if (exp >= 5) {
            System.out.println("You can to work as an developer");
        }

    }
}

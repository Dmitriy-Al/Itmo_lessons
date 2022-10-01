import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
/*
        int y = 8;
        int i = 6;

        double count = switch (i) {
            case 1, 3 -> {
                y = 9;
                yield 9.8;
            }
            case 2 -> {
                yield 9;
            }
            default -> 0;
        };

        int a = 1;
       System.out.println(a++);
        System.out.println(a);

        a = 1;

        System.out.println(++a);
        System.out.println(a);
        

        int u = scan.nextInt();

        char code = (char) System.in.read();

        int pc = 3;
        int q = scan.nextInt();
        while(true){
            System.out.println("in");

            if(q == 5){
                continue;}
            System.out.println(q * q);

            if(q == 8){
                break;
            }
        }


        String string1 = "java";
        String string2 = "python";
        String string3 = new String("String");
        String s = string3.intern();

        String str = string1 + " :: " + string2;
        System.out.println(str);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10; i++){
            sb.append(i).append(" * ");
        }




        string1 = sb.toString();
        System.out.println(string1);


     String str = "num ";
     StringBuilder sb = new StringBuilder();

     for(int i = 0, y = 4; i < 100; i++, y--){
         sb.append(str).append(i).append("; ");
         System.out.println(str);
     }

        str = sb.toString();
        System.out.println(str);


 */

        int counterOne = 0;

        int[] arrayFive = {-5, 4, -3, 2, -1, 1, -2, 3, -4, 5};

        for(int i : arrayFive){
            if(i < 0){
                counterOne++;
            }
        }

        int[] collector = new int[counterOne];

        for(int i : arrayFive){
            if(i < 0){
                collector[counterOne - 1] = i;
                counterOne--;
            }
        }

        System.out.println(Arrays.toString(collector));


    }
}
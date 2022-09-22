package home_work1;

public class LessonOne {
    public static void main(String[] args){

// Немного индийского кода с использованием пройденных на уроке типов данных приведённых к char =)

        String lesson = " lesson!";
        double[] Darya = {68.0,97.0,114.0,121.0,97.0};
        int[][] thankYou = {{116,104}, {97,110},{107,32},{121,111},{117,32}};

        for(double b : Darya){
            System.out.print((char)b);
        }

        System.out.print(", ");

        for(byte i = 0; i < thankYou.length; i++){
            System.out.print((char)thankYou[i][0]);
            System.out.print((char)thankYou[i][1]);
        }

            for(short x = 100; x <= 114; x++){
                if(x == 102 || x == 111 || x == 114){
                    System.out.print((char) x);
                    if(x == 114) System.out.println(lesson);
                }
            }

    }
}

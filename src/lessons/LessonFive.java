package lessons;

import java.util.Arrays;

public class LessonFive {
    public static void main(String[] args) {

        int[] ints1 = new int[3];
        int[] ints2 = {1, 2, 3};

        ints1 = ints2;

        ints1 = new int[3];
        ints1[2] = 77;
        ints1 = new int[]{1, 10, 100};

        for (int i : ints1) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(ints2));

        int len = 10;
        int[] ints3 = new int[len * 2];


        int[] ints4 = {4, 7, 0, -12, 67, 44};
        System.out.println(ints4[(int) (Math.random() * ints4.length)]);


        for (int x = 1; x < ints4.length; x++) {
            for (int y = ints4.length - 1; y >= x; y--) {
                if (ints4[y - 1] > ints4[y]) {
                    int temp = ints4[y - 1];
                    ints4[y - 1] = ints4[y];
                    ints4[y] = temp;
                }
            }
        }

        qS(ints4, 0, ints4.length - 1);


        for (int i : ints4) {
            System.out.print(i + ", ");
        }

        Arrays.sort(ints4);

        System.out.println();

        int elementIndex = Arrays.binarySearch(ints4, 7);
        System.out.println(elementIndex);

        //Копируются массивы только...
        int[] x = {1, 2, 3};
        int[] y = x.clone();
        int[] z = Arrays.copyOf(x, 3); //где 3 - длинна нового массива, м.б. любой, копируется частично
        int[] a = new int[5];
        System.arraycopy(x, 1, a, 2, 3);//

    }

    public static void qS(int[] arr, int left, int right) {

        int mid = arr[(left + right) / 2];
        int r = right;
        int l = left;

        do {
            while ((arr[l] < mid) && (l < right)) l++;
            while ((arr[r] > mid) && (r > left)) r--;

            if (l <= r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
                l++;
            }
        } while (l <= r);

        if (l < right) qS(arr, l, right);
        if (r > left) qS(arr, left, r);

    }


}

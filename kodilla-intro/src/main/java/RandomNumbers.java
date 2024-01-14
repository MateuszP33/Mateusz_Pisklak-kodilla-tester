import java.util.Random;

public class RandomNumbers {
    public static int[] sum5000(int max) {
        Random number = new Random();
        int sum = 0;
        int i = 0;
        int[] a = new int[5000];
        while (sum < max) {
            int b = number.nextInt(30);
            a[i] = b;
            sum = sum + b;
            i++;
        }
        return a;
    }

    public static int max(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int[] a) {
        int min = 30;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}



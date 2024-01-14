public class Loop {

    public static void main(String[] args) {
        int[] ab = new int[]{5, 4, 8};
        System.out.println(sumOfNumbers(ab));
    }

    private static int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;


    }
}

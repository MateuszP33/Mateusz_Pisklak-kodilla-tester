public class LeapYear {
    public static void main(String[] args) {

        int a = 758;

        isLapYear(a);
    }

    private static void isLapYear(int a) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("Rok " + a + " jest przestępny");
                } else {
                    System.out.println("Rok " + a + " nie jest przestępny");
                }
            } else {
                System.out.println("Rok " + a + " jest przestępny");
            }
        } else {
            System.out.println("Rok " + a + " nie jest przestępny");
        }
    }
}

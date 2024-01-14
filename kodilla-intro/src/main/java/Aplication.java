public class Aplication {
    String name;
    double age;
    double height;

    public Aplication(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void userInfo(Aplication user) {
        if (user.name != null) {
            if (user.age > 30 && user.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main(String[] args) {
        Aplication user = new Aplication("Adam", 40.5, 178);
        userInfo(user);
    }
}

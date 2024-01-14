import java.sql.SQLOutput;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int averageAge(User[] user) {
        int sum = 0;
        for (int i = 0; i < user.length; i++) {
            int a = user[i].age;
            sum = sum + a;
        }
        int avAge = sum / user.length;
        return avAge;
    }

    public static void showNames(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (averageAge(users) > users[i].age) {
                System.out.println(users[i].name);
            }
        }
    }

    public static void main(String[] args) {
        User Karol = new User("Karol", 33);
        User Michal = new User("Michał", 35);
        User Ola = new User("Ola", 28);
        User Robert = new User("Robert", 23);
        User[] users = {Karol, Michal, Ola, Robert};
        averageAge(users);
        showNames(users);


    }
}
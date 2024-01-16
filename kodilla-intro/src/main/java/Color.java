public class Color {
    public static String chooseColor() {
        System.out.println("Choose first letter of your color: B, R or W.");
        while (true) {
            String userColor = UserDialogs.getColor();
            switch (userColor) {
                case "B":
                    return "black";
                case "R":
                    return "red";
                case "W":
                    return "white";
                default:
                    System.out.println("Wrong letter. Try again");
            }
        }
    }
}


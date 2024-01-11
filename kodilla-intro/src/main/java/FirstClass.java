public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(1250, 3500, 2023);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkGoodPrice();

        Notebook heavyNotebook = new Notebook(2000, 400, 2017);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkGoodPrice();

        Notebook oldNotebook = new Notebook(2501, 2000, 2020);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkGoodPrice();
    }
}

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1500) {
            System.out.println("This notebook is lightweight.");
        } else if (this.weight >= 1500 && this.weight <= 2200) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkGoodPrice() {
        if (this.year < 2023) {
            if (this.price <= 3500) {
                System.out.println("Its good price for almost new notebook.");
            } else {
                System.out.println("Its too expensive for even that year.");
            }
        } else if (this.year < 2023 && this.year >= 2020) {
            if (this.price <= 2000) {
                System.out.println("Its good price for that not too old notebook.");
            } else {
                System.out.println("Its too expensive for that year.");
            }
        } else if (this.year < 2020 && this.year > 2017) {
            if (this.price <= 1500) {
                System.out.println("Its good price for that old notebook.");
            } else {
                System.out.println("Its too expensive for that old notebook.");
            }
        } else {
            System.out.println("Don't buy it!");
        }
    }
}

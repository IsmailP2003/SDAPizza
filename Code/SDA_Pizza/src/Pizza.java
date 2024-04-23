public abstract class Pizza {

    private Topping topping;
    private Sauce sauce;
    private Crust crust;

    private static int orderCount = 0;

    public Pizza() {
        orderCount++;
        System.out.println("\nOrder No " + orderCount + " received:");
    }

    public void makePizza() {
        if (topping != null) {
            topping.addTopping();
        }
        if (sauce != null) {
            sauce.addSauce();
        }
        if (crust != null) {
            crust.addCrust();
        }
    }

    public void addTopping(Topping topping) {
        this.topping = topping;
    }

    public void addSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void addCrust(Crust crust) {
        this.crust = crust;
    }
}
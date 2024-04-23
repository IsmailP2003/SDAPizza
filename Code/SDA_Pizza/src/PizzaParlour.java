public class PizzaParlour {
        public static void main(String[] args) {
                createAndMakePizza(new NeopolitanPizza(), new MeatTopping(), new Tomato(), new ThinCrust());
                createAndMakePizza(new SicilianPizza(), new VegTopping(), new BBQ(), new ThickCrust());
                createAndMakePizza(new NewYorkStylePizza(), new PepperoniTopping(), new Alfredo(), new ThinCrust());
                createAndMakePizza(new NewYorkStylePizza(), new PepperoniTopping(), new Alfredo(), null);
        }

        private static void createAndMakePizza(Pizza pizza, Topping topping, Sauce sauce, Crust crust) {
                pizza.addTopping(topping);
                pizza.addSauce(sauce);
                pizza.addCrust(crust);
                pizza.makePizza();
                System.out.println("--------------------------------------------------");
        }
}
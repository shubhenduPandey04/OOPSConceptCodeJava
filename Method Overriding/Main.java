
public class Main {
    public static void main(String[] args) {
//        PizzaOrder order = new PizzaOrder();
//        // Different ways to order pizza (method overloading in action)
//        order.orderPizza("Medium");
//        order.orderPizza("Large", "Extra Cheese");
//        order.orderPizza("Small", "Pepperoni", "Thin Crust");

        Food food = new Food();
        food.prepare(); // Output: Preparing generic food.

        // Burger
        Food burger = new Burger();
        burger.prepare(); // Output: Preparing a juicy burger with fries.

        // Pasta
        Food pasta = new Pasta();
        pasta.prepare(); // Output: Preparing creamy pasta with garlic bread.
    }
    }

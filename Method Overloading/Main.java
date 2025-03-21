
public class Main {
    public static void main(String[] args) {
       PizzaOrder order = new PizzaOrder();
       // Different ways to order pizza (method overloading in action)
       order.orderPizza("Medium");
       order.orderPizza("Large", "Extra Cheese");
       order.orderPizza("Small", "Pepperoni", "Thin Crust");
    }
    }

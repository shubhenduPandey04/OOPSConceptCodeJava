public class PizzaOrder {
    //Order a basic pizza
    public void orderPizza(String size){
        System.out.println("Ordered a " + size + " pizza ");
    }

    //Order a pizza with extra topping
    public void orderPizza(String size, String topping){
        System.out.println("Ordered a " + size + " pizza with " + topping);
    }

    //Order a custom pizza(size + topping + crust type)
    public void orderPizza(String size, String topping, String crust){
        System.out.println("Ordered a " + size + " pizza with " + topping + " on a " + crust + " crust ");
    }
}

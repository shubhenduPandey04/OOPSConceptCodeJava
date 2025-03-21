public class Food {

    /*Scenario: Online Food Delivery System
    Imagine a food delivery app where:

    Every food item can be prepared (common behavior).
    Pizza is prepared differently.
    Burger is prepared differently.
    Pasta is prepared differently.

    Same action (prepare food) but different implementations based on the food type—this is method overriding.*/

    public void prepare(){
        // General method to prepare food
        System.out.println("Preparing Generic Food");
    }
}

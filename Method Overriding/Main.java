
public class Main {
    public static void main(String[] args) {

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

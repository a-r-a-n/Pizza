// Define a class
public class Pizza {
    // Instance variables
    String size;
    String topping;

    // Constructor
    public Pizza(String pizzaSize, String pizzaTopping) {
        size = pizzaSize;
        topping = pizzaTopping;
    }

    // Method
    public void displayPizza() {
        System.out.println("You ordered a " + size + " pizza with " + topping + ".");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create first Pizza object
        Pizza myPizza1 = new Pizza("Large", "Pepperoni");

        // Create second Pizza object
        Pizza myPizza2 = new Pizza("Medium", "Cheese");

        // Call methods using objects
        myPizza1.displayPizza();
        myPizza2.displayPizza();
    }
}

public class Pizza {
    String size;
    String topping;

    // constructor
    public Pizza(String pizzaSize, String pizzaTopping) {
        size = pizzaSize;
        topping = pizzaTopping;
    }

    // method
    public void displayPizza() {
        System.out.println("You ordered a " + size + " pizza with " + topping + ".");
    }

    // main method
    public static void main(String[] args) {
        // creating object
        Pizza myPizza1 = new Pizza("Large", "Pepperoni");

        // another object
        Pizza myPizza2 = new Pizza("Medium", "Cheese");

        // calling method, with object
        myPizza1.displayPizza();
        myPizza2.displayPizza();
    }
}

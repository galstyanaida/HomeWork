package chapter3;
import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<String> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public void removeProduct(String product) {
        products.remove(product);
    }

    public void displayCart() {
        System.out.println("Products in Cart ");
        for (String product : products) {
            System.out.println(product);
        }
    }
}

public class Products {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Banana");
        cart.addProduct("Nutella");
        cart.addProduct("Wiskas");

        cart.displayCart();

        cart.removeProduct("Nutella");

        System.out.println("\n"+"Rmoved:");

        cart.displayCart();
    }
}
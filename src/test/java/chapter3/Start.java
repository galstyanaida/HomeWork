package chapter3;


public class Start {
    public static void main (String[] args){
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product ("Banana", 10.34);
        Product product2 = new Product("Wiskas", 5.6);
        Product product3 = new Product("Milk", 3);

        cart.addItem(product1, 1);
        cart.addItem(product2, 10);
        cart.addItem (product3, 20);
        cart.displayCart();

        cart.removeItem(product2, 2);
        System.out.print("Products removed! ");
        cart.displayCart();

    }
}

package chapter3;
import java.util.ArrayList;
import java.util.List;



public class ShoppingCart{
    public List <Product> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity){
        for(Product item : items){
            if (item.getName().equals(product.getName())){
                item.setQuantity(item.getQuantity()+ quantity);
                return;
            }
        }
        items.add(product);
        product.setQuantity(quantity);
    }



    public void removeItem (Product product, int quantity) {
        for (Product item: items){
            if (item.getName().equals(product.getName())){
                if (quantity>= item.getQuantity()){
                    items.remove(item);
                }
                else {
                    item.setQuantity (item.getQuantity() - quantity);
                }
                return;
            }
        }
    }

    public void displayCart(){
            System.out.println("Shopping Cart: ");
            for (Product product : items){
                System.out.println(product.getName() + ": Product Quantity=" + product.getQuantity() + ": Product Price="+ product.getPrice());
            }
        }
    }

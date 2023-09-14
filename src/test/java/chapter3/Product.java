package chapter3;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.quantity = 0;

    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}

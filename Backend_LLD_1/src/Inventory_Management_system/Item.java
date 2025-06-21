package Inventory_Management_system;

public class Item implements Comparable<Item>{
    private String id;
    private String name;
    private int quantity;
    private double price;

    public Item(String id, String name,  double price,int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public Item() {}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int compareTo(Item o){
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}


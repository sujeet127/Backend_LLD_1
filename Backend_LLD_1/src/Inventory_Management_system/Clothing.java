package Inventory_Management_system;

public class Clothing extends Item{
     private String size;
     public Clothing(String size,String id, String name,  double price,int quantity) {
         super(id,name,price,quantity);
         this.size = size;
     }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

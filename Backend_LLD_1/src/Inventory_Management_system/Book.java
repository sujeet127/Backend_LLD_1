package Inventory_Management_system;

public class Book extends Item{
    private String author;

    public Book(String author,String id, String name,  double price,int quantity){
        super(id,name,price,quantity);
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

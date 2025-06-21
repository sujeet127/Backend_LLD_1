package Inventory_Management_system;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Electronics(2,"E1","Laptop",45000.99,5));

        items.add(new Clothing("M","C1","T-shirt",1100.99,10));

        items.add(new Book("Sujeet","B1","Mathematics",450.99,23));

//        Collections.sort(items);
//        for(Item item : items) {
//            System.out.println(item);
//        }
        System.out.println("List of Items:");

        items.forEach(System.out::println);
        Inventory<Electronics>electronic=new Inventory<>();
        Inventory<Clothing>clothing=new Inventory<>();
        Inventory<Book>book=new Inventory<>();

        //electronic.add(new Electronics(2,"E1","Laptop",45000.99,5));
        Electronics laptop=new Electronics(24,"E1","Laptop",55000.99,5);
        Electronics mobile=new Electronics(12,"E2","Mobile",23000.99,15);
        Electronics earphone=new Electronics(6,"E3","Earphone",2500.99,10);

        Clothing tShirt=new Clothing("M","C1","T-shirt",1100.99,10);
        Clothing pant=new Clothing("32","C2","Pant",800.99,15);
        Clothing sherwani=new Clothing("L","C3","Sherwani",5000.00,10);

       Book science=new Book("Sujeet","B1","Science",300.99,5);
       Book Chemistry=new Book("Agarwal","B2","Chemistry",350.99,10);
       Book Mathematics=new Book("RD Sharma","B3","Mathematics",500.99,10);

        electronic.addItem(laptop);
        electronic.addItem(mobile);
        electronic.addItem(earphone);

        clothing.addItem(tShirt);
        clothing.addItem(pant);
        clothing.addItem(sherwani);

        book.addItem(science);
        book.addItem(Chemistry);
        book.addItem(Mathematics);

        electronic.removeItem("E2");
        System.out.println("Printing list of items in inventory:");

        List<Electronics>listOFItems=electronic.getAllItems();
        for(Item i:listOFItems){
            System.out.println(i.getName());
        }

        //test order and orderProcessor
        ProcessOrder processOrder=new ProcessOrder();
        processOrder.addOrder(new Order("01",true));
        processOrder.addOrder(new Order("02",true));
        processOrder.addOrder(new Order("03",false));
        processOrder.addOrder(new Order("04",true));
        processOrder.addOrder(new Order("05",false));
        processOrder.addOrder(new Order("06",true));
        processOrder.addOrder(new Order("07",false));
        processOrder.addOrder(new Order("08",false));

        while(processOrder.getSize()>0){
            System.out.println(processOrder.processOrder());
        }

        //testing sorting and filtering
        Inventory<Item>inventory=new Inventory<>();
        inventory.addItem(laptop);
        inventory.addItem(mobile);
        inventory.addItem(earphone);
        inventory.addItem(science);
        inventory.addItem(Chemistry);
        inventory.addItem(Mathematics);
        inventory.addItem(science);
        inventory.addItem(Chemistry);
        inventory.addItem(science);

        List<Item>affordableItems=inventory.filterByPrice(0.0,3000.0);
        System.out.println("Printing affordable list of items:");

        for(Item i:affordableItems){

            System.out.println(i);
        }

       // List<Item>nameFilter=inventory.filterByName("Laptop");

        List<Item>sortedItemByName=inventory.SortItem(new ItemNameComparator());
        System.out.println("Printing sorted Item By Name:");
        for(Item i:sortedItemByName){
            System.out.println(i);
        }

        List<Item>sortedByQuantity=inventory.SortItem(new ItemQuantityComparator());
        System.out.println("Printing sorted Item By Quantity in descending order:");
        for(Item i:sortedByQuantity){
            System.out.println(i);
        }

        //testing wishlist
        Wishlist wishlist=new Wishlist();
        wishlist.addToWishlist(laptop);
        wishlist.addToWishlist(mobile);
        wishlist.addToWishlist(earphone);
        wishlist.addToWishlist(laptop);
        System.out.println("Printing Wishlist:");

        wishlist.getWishlist().forEach(System.out::println);








    }
}

package Inventory_Management_system;

import java.util.HashSet;

public class Wishlist extends Item {
     HashSet<Item>itemSet;
    public Wishlist(){
        this.itemSet=new HashSet<>();
    }
    public void addToWishlist(Item item){
        itemSet.add(item);
    }
    public void removeFromWishlist(Item item){
        itemSet.remove(item);
    }
    public int getSize(){
        return itemSet.size();
    }
    public HashSet<Item> getWishlist(){
        return itemSet;
    }
}

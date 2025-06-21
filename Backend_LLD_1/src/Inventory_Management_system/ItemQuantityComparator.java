package Inventory_Management_system;

import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        //o1 to win ,return -1
        //o2 to win return 1
//        if(o1.getQuantity()<o2.getQuantity()){
//            return 1;
//        }else if(o1.getQuantity()>o2.getQuantity()){
//            return -1;
//        }
//        return 0;
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}

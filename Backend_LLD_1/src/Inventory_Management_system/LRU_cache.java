package Inventory_Management_system;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class LRU_cache extends Item{
    LinkedHashMap<String,Item> items;
    private final int size;
    public LRU_cache(int capacity){
        items = new LinkedHashMap<>();
        this.size = capacity;
    }
    void addRecentlyViewedItem(String key,Item item){

            if(items.containsKey(key)){
                items.remove(key); // Remove old entry to move it to most recent

            }else if(items.size()>=size){
                // Remove the least recently used (first inserted) key
                String eldestKey=items.keySet().iterator().next();
                items.remove(eldestKey);
            }
            items.put(key,item);

    }
    public List<Item> getAllViewedItems(){
        return new ArrayList<Item>(items.values());
    }

    public int getSize() {
        return size;
    }
    public Item getItem(String key) {  //accessOrder
        if (!items.containsKey(key)) return null;
        Item item = items.remove(key); // Remove and re-add to update order
        items.put(key, item);
        return item;
    }


}

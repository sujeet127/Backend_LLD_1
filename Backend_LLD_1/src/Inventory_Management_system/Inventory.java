package Inventory_Management_system;

import java.util.*;

public class Inventory <T extends Item>{
    HashMap<String,T> items;

    public Inventory(){
        items=new HashMap<>();
    }
    public Inventory(HashMap<String,T> items){
        this.items = items;
    }
    public void addItem(T item){
        if(items.containsKey(item.getId())){
            System.out.println("Item: "+item.getId()+" already exists");
            return;
        }
        items.put(item.getId(),item);

    }
    public void removeItem(String id){
        if(items.containsKey(id)){
            items.remove(id);
            System.out.println("Item: "+id+" has been removed");

        }else{
            System.out.println("Item: "+id+" does not exist");
        }
    }
    public HashMap<String,T> getItems(String id){
        if(items.containsKey(id)){
            return items;
        }
        else {
            System.out.println("Item: "+id+" does not exist");
        }
        return new HashMap<>();
    }
    public void setItems(HashMap<String,T> items){
        this.items = items;
    }
    public List<T> getAllItems(){
        return new ArrayList<>(items.values());

    }
    //filtering based on name ,price , quantity, availability
    public List<T> filterByPrice(double minPrice, double maxPrice){
        List<T> filteredList=new ArrayList<>();
        for(T t:items.values()){
            if(t.getPrice()>=minPrice&&t.getPrice()<=maxPrice){
                filteredList.add(t);
            }
        }
        return filteredList;
    }
    public List<T> filterByAvailability(){
        List<T> filteredList=new ArrayList<>();
         for(T t:items.values()){
             if(t.getQuantity()>0){
                 filteredList.add(t);
             }
         }
         return filteredList;
    }
    public List<T> filterByName(String name){
        List<T> filteredList=new ArrayList<>();
        for(T t:items.values()){
            if(t.getName().equals(name)){
                filteredList.add(t);
            }
        }
        return filteredList;
    }

    public List<T> SortItem( Comparator<T> comparator){
        List<T> list=new ArrayList<>(items.values());
        Collections.sort(list,comparator);
        return list;
    }
}

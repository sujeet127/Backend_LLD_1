package Inventory_Management_system;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProcessOrder {
    private Queue<Order> order;
    public ProcessOrder() {
        order=new PriorityQueue<>();
    }
    public Order processOrder() {
        return order.poll();
    }
    public void addOrder(Order order) {
        this.order.add(order);
    }
    public int getSize() {
        return order.size();
    }
}

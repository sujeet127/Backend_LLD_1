package Inventory_Management_system;

import java.util.PriorityQueue;

public class Order implements Comparable<Order>{
    private String orderId;
    private boolean isExpress;

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", isExpress=" + isExpress +
                '}';
    }

    //implemnets natural order sorting
    public int compareTo(Order o){
        if(this.isExpress==o.isExpress){
            return this.orderId.compareTo(o.orderId);
        } else if (this.isExpress) {
            return -1;

        }else{
            return 1;
        }
    }
}

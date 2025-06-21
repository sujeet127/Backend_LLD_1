package Inventory_Management_system;

public class Electronics extends Item {
    private int warrenty;
    public Electronics(int warrenty, String id, String name, double price, int quantity) {
        super(id,name,price,quantity);
        this.warrenty=warrenty;
    }

    public int getWarrenty() {
        return warrenty;
    }

    public void setWarrenty(int warrenty) {
        this.warrenty = warrenty;
    }
}

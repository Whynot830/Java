package pr16;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> order;

    public Order() {
        order = new ArrayList<>();
    }

    public Order(ArrayList<Item> order) {
        this.order = order;
    }

    public void add(Item item) {
        order.add(item);
    }

    public void remove(Item item) {
        order.remove(item);
    }

    @Override
    public String toString() {
        return "Order{" +
                "order=" + order +
                '}';
    }
}

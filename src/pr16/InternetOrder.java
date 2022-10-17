package pr16;

import java.util.ArrayList;
import java.util.HashSet;

public class InternetOrder {
    private DoublyLinkedList order;

    InternetOrder() {
        order = new DoublyLinkedList();
    }

    InternetOrder(Item[] items) {
        order = new DoublyLinkedList(items);
    }

    public void add(Item item) {
        order.push_back(item);
    }

    public void removeByName(String name) {
        order.removeByName(name);
    }

    public int removeByNameAll(String name) {
        int deleted = 0;
        while (order.find(name) != -1) {
            order.removeByName(name);
            deleted++;
        }
        return deleted;
    }

    public int getSize() {
        return order.getSize();
    }

    public ArrayList<Item> getOrder() {
        return order.toArrayList();
    }

    public double getCost() {
        return order.getCost();
    }

    public int getOrderedItemsAmount(String name) {
        return order.getOrderedItemsAmount(name);
    }

    public HashSet<String> getOrderedItemsNames() {
        return order.getOrderedItemsNames();
    }

    public ArrayList<Item> getSortedOrder() {
        ArrayList<Item> res = new ArrayList<>(getOrder());
        res.sort((o1, o2) -> Double.compare(o2.getCost(), o1.getCost()));
        return res;
    }

    public void print() {
        order.print();
    }
}


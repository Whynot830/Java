package pr16;

import java.util.ArrayList;
import java.util.HashSet;

public class DoublyLinkedList {

    class Node {
        Node(Item obj) {
            this.obj = obj;
            prev = next = null;
        }

        public Node prev;
        public Node next;
        public Item obj;

        public String toString() {
            return obj.toString();
        }
    }

    Node head;
    Node tail;

    DoublyLinkedList(Item el) {
        head = tail = new Node(el);
    }

    DoublyLinkedList() {
        head = tail = null;
    }

    DoublyLinkedList(Item[] els) {
        for (Item el : els) push_back(el);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push_front(Item el) {
        if (isEmpty()) {
            head = tail = new Node(el);
            return;
        }
        Node new_node = new Node(el);
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }

    public void push_back(Item el) {
        if (isEmpty()) {
            head = tail = new Node(el);
            return;
        }
        Node new_node = new Node(el);
        tail.next = new_node;
        new_node.prev = tail;
        tail = new_node;
    }

    public Item pop_front() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        Node node = head;
        node.next.prev = null;
        head = node.next;
        return node.obj;
    }

    public Item pop_back() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        Node node = tail;
        node.prev.next = null;
        tail = node.prev;
        return node.obj;
    }

    public int find(String name) {
        int pos = 0;
        Node node = head;
        while (node != null && !node.obj.getName().equals(name)) {
            node = node.next;
            pos++;
        }
        if (node == null) return -1;
        return pos;
    }

    public void remove(Item el) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head.obj == el) {
            pop_front();
            return;
        }
        if (tail.obj == el) {
            pop_back();
            return;
        }
        Node slow = head, fast = head.next;
        while (fast != null && !fast.obj.equals(el)) {
            fast = fast.next;
            slow = slow.next;
        }
        if (fast == null) {
            System.out.println("Element " + el + " not found");
            return;
        }
        slow.next = fast.next;
        fast.next.prev = slow;
    }

    public void removeByName(String name) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head.obj.getName().equals(name)) {
            pop_front();
            return;
        }
        if (tail.obj.getName().equals(name)) {
            pop_back();
            return;
        }
        Node slow = tail, fast = tail.prev;
        while (fast != null && !fast.obj.getName().equals(name)) {
            fast = fast.prev;
            slow = slow.prev;
        }
        if (fast == null) {
            System.out.println("Element with name" + name + " not found");
            return;
        }
        slow.prev = fast.prev;
        fast.prev.next = slow;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("DoublyLinkedList: ");
        Node node = head;
        while (node != null) {
            System.out.print(node + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void print_reverse() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("DoublyLinkedList (reversed): ");
        Node node = tail;
        while (node != null) {
            System.out.print(node + " ");
            node = node.prev;
        }
        System.out.println();
    }

    public int getSize() {
        if (isEmpty()) return 0;
        Node node = head;
        int size = 1;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public ArrayList<Item> toArrayList() {
        ArrayList<Item> res = new ArrayList<>();
        Node node = head;
        while (node != null) {
            res.add(node.obj);
            node = node.next;
        }
        return res;
    }

    public double getCost() {
        if (isEmpty()) return 0;
        double cost = 0;
        Node node = head;
        while (node != null) {
            cost += node.obj.getCost();
            node = node.next;
        }
        return cost;
    }

    public int getOrderedItemsAmount(String name) {
        if (isEmpty()) return 0;
        int count = 0;
        Node node = head;
        while (node != null) {
            if (node.obj.getName().equals(name))
                count++;
            node = node.next;
        }
        return count;
    }

    public HashSet<String> getOrderedItemsNames() {
        if (isEmpty()) return null;
        HashSet<String> names = new HashSet<>();
        Node node = head;
        while (node != null) {
            names.add(node.obj.getName());
            node = node.next;
        }
        return names;
    }
}

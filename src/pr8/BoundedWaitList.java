package pr8;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < capacity)
            super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}

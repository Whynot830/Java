package pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList <E> {
    protected ConcurrentLinkedQueue<E> content;
    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> c) {
        content = (ConcurrentLinkedQueue<E>) c;
    }
    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
    public void add(E element) {
        content.add(element);
    }

    public E remove() {
        return content.remove();
    }

    public boolean contains(E element) {
        return content.contains(element);
    }

    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }
}

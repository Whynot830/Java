package pr8;

public class Test {
    public static void main(String[] args) {
        BoundedWaitList<Integer> bwl = new BoundedWaitList<>(10);
        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        for (int i = 0; i < 13; i++) {
            bwl.add(i);
            uwl.add(i);
        }
        System.out.println(bwl);
        System.out.println(uwl);
        uwl.moveToBack(4);
        uwl.moveToBack(7);
        System.out.println(uwl);
    }
}

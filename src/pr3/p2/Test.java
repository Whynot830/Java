package pr3.p2;

public class Test {
    public static void main(String[] args) {
        MovableRectangle rec1 = new MovableRectangle(0,0,1,1,1,1);
        System.out.println(rec1);
        rec1.moveDown();
        rec1.moveLeft();
        System.out.println(rec1);
        System.out.println(rec1.isSpeedEqual());
    }

}

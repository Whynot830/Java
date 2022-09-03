package pr2;

public class Test {
    public static void main(String[] args) {
        Ball b1 = new Ball(4,4);
        System.out.println(b1);
        b1.move(13,-45);
        System.out.println(b1+"\n");

        Author a1 = new Author("Sara","sarabucks@yahoo.ru", 'F');
        Author a2 = new Author("Bob","",'M');
        a2.setEmail("bobby123@rambler.com");
        System.out.println(a2);
        System.out.println(a1);
    }
}

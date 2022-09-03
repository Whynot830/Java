package pr1;


public class Test {
    public static void main(String[] args)
    {
        Ball b1 = new Ball("Green", 4);
        Ball b2 = new Ball("Red");
        Ball b3 = new Ball();
        System.out.println(b1.getColor());
        b2.setSize(10);
        System.out.println(b2.getSize());
        System.out.println(b3.toString()+"\n");

        Book bk1 = new Book("Detectiv","Black",500);
        Book bk2 = new Book();
        System.out.println(bk1.getPages());
        System.out.println(bk2.getName());
        System.out.println(bk1.getColor());
        bk2.setName("Roman");
        System.out.println(bk2.toString()+"\n");

        Dog doggo1 = new Dog("sobeka",5);
        Dog doggo2 = new Dog();
        doggo1.setName("zlaya sobaka");
        System.out.println(doggo1.getAge());
        doggo2.setAge(9);
        System.out.println(doggo2.toString());
    }
}


package pr16;


public class Main {
    public static void main(String[] args) {
        InternetOrder order = new InternetOrder();
        order.add(new Dish("salad","salty",100));
        order.add(new Dish("soup","some info",250));
        order.add(new Dish("meat","raw",99));
        order.add(new Drink("water","info",1000));
        order.add(new Drink("juice","bitter",500));
        order.add(new Drink("vodka","tasty",5));
        order.add(new Drink("cola","info",123));
        order.add(new Drink("cola","info",123));
        order.print();
        System.out.println("Order size = " + order.getSize());
        System.out.println("Order cost = " + order.getCost());
        System.out.println("Sorted order (decreasing price): " + order.getSortedOrder());
        System.out.println("Amount of 'cola' in order = " + order.getOrderedItemsAmount("cola"));
        System.out.println("Ordered items names: " + order.getOrderedItemsNames());
        order.removeByName("vodka");
        order.print();
        order.removeByNameAll("cola");
        order.print();
    }
}

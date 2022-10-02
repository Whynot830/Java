package pr12_15.ex2;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address();
        Address address2 = new Address();
        String str_address1 = "Россия, Московская область, Видное, Каменная, 40, 2, 13";
        String str_address2 = "Россия, Московская область, Видное, Каменная, 40, 2, 13";
        address1.separate_comma(str_address1);
        System.out.println(address1);

        address2.separate_all(str_address2);
        System.out.println(address2);
    }

}

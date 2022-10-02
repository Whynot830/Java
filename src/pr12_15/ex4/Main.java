package pr12_15.ex4;

public class Main {
    public static void main(String[] args) {
        PhoneNum phonenum1 = new PhoneNum("+79175655655");
        PhoneNum phonenum2 = new PhoneNum("+104289652211");
        PhoneNum phonenum3 = new PhoneNum("89175655655");

        phonenum1.format_num();
        System.out.println(phonenum1);

        phonenum2.format_num();
        System.out.println(phonenum2);

        phonenum3.format_num();
        System.out.println(phonenum3);

    }

}

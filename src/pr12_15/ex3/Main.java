package pr12_15.ex3;

public class Main {
    public static void main(String[] args) {
        String[] shirts_str = new String[11];
        Shirt[] shirts_obj = new Shirt[11];
        shirts_str[0] = "S001,Black Polo Shirt,Black,XL";
        shirts_str[1] = "S002,Black Polo Shirt,Black,L";
        shirts_str[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts_str[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts_str[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts_str[5] = "S006,Black T-Shirt,Black,XL";
        shirts_str[6] = "S007,White T-Shirt,White,XL";
        shirts_str[7] = "S008,White T-Shirt,White,L";
        shirts_str[8] = "S009,Green T-Shirt,Green,S";
        shirts_str[9] = "S010,Orange T-Shirt,Orange,S";
        shirts_str[10] = "S011,Maroon Polo Shirt,Maroon,S";

        for (int i = 0; i < 11; i++) {
            shirts_obj[i] = new Shirt();
            shirts_obj[i].separate(shirts_str[i]);
            System.out.println(shirts_obj[i]);
        }
    }
}

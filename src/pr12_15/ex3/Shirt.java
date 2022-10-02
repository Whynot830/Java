package pr12_15.ex3;

import java.util.StringTokenizer;

public class Shirt {
    private String serial_num;
    private String name;
    private String color;
    private String size;

    @Override
    public String toString() {
        return "Shirt{" +
                "serial_num='" + serial_num + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public void separate(String info) {
        StringTokenizer sep = new StringTokenizer(info,",");
        serial_num = sep.nextToken();
        name = sep.nextToken();
        color = sep.nextToken();
        size = sep.nextToken();
    }
}

package pr12_15.ex2;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    public void separate_comma(String address) {
        String[] arr = address.split(", ");
        country = arr[0];
        region = arr[1];
        city = arr[2];
        street = arr[3];
        house = arr[4];
        building = arr[5];
        flat = arr[6];
    }

    public void separate_all(String address) {
        StringTokenizer strtk = new StringTokenizer(address, ",.;-:");
        country = strtk.nextToken();
        region = strtk.nextToken();
        city = strtk.nextToken();
        street = strtk.nextToken();
        house = strtk.nextToken();
        building = strtk.nextToken();
        flat = strtk.nextToken();
    }
    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}

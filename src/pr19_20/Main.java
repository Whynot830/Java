package pr19_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> license_arr = new ArrayList<>();
        HashSet<String> license_hashSet = new HashSet<>();
        TreeSet<String> license_treeSet = new TreeSet<>();
        LicensePlate plate;
        for (int i = 0; i < 100000; i++) {
            plate = new LicensePlate();
            license_arr.add(plate.getPlateNumber());
            license_hashSet.add(plate.getPlateNumber());
            license_treeSet.add(plate.getPlateNumber());
        }

        String test = license_arr.get(license_arr.size() - 1);
        long start, end; boolean f;
        System.out.println("Искомый номер: " + test);

        System.out.println("\nПоиск перебором: ");
        start = System.nanoTime();
        f = license_arr.contains(test);
        end = System.nanoTime();
        System.out.println(test + (f ? "" : "не") + " найден, поиск занял " + (end-start) + "нс");

        System.out.println("Бинарный поиск: ");
        Collections.sort(license_arr);
        start = System.nanoTime();
        f = Collections.binarySearch(license_arr,test)>=0;
        end = System.nanoTime();
        System.out.println(test + (f ? "" : "не") + " найден, поиск занял " + (end-start) + "нс");

        System.out.println("Поиск в HashSet: ");
        start = System.nanoTime();
        f = license_hashSet.contains(test);
        end = System.nanoTime();
        System.out.println(test + (f ? "" : "не") + " найден, поиск занял " + (end-start) + "нс");

        System.out.println("Поиск в TreeSet");
        start = System.nanoTime();
        f = license_treeSet.contains(test);
        end = System.nanoTime();
        System.out.println(test + (f ? "" : "не") + " найден, поиск занял " + (end-start) + "нс");
    }
}
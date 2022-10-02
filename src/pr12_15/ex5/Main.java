package pr12_15.ex5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String getLine(String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>(List.of(str.split(" ")));
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<String> tmp = new ArrayList<>(arr);
            sb.append(tmp.get(i));
            tmp.remove(i);
            int count = 0;
            while (count < arr.size() && !tmp.isEmpty()) {
                for (int j = 0; j < tmp.size(); j++) {
                    if (sb.charAt(sb.length() - 1) == tmp.get(j).charAt(0)) {
                        sb.append(" ").append(tmp.get(j));
                        tmp.remove(j);
                    }
                }
                count++;
            }
            if (tmp.isEmpty()) return sb.toString();
            sb = new StringBuilder();
        }
        if (sb.isEmpty()) return "no way to reorder";
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader reader = new BufferedReader(new FileReader("src/pr12_15/ex5/" + sc.nextLine()))) {
            String line;
            line = reader.readLine();
            line = getLine(line);
            System.out.println(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}

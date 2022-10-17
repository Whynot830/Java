package pr17_18;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void print(String right_str, String wrong_str, String regex) {
        System.out.println("right_str: " + right_str + "\nwrong_str: " + wrong_str + "\nregex: " + regex);
        System.out.println("check(right_str): " + check(right_str, regex));
        System.out.println("check(wrong_str): " + check(wrong_str, regex));
        System.out.println();
    }

    public static boolean check(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static void main(String[] args) {
        String right_str = "abcdefghijklmnopqrstuv18340";
        String wrong_str = "abcdefghijklmnoasdfasdpqrstuv18340";
        String regex = "^abcdefghijklmnopqrstuv18340$";
        print(right_str, wrong_str, regex);


        right_str = "aE:dC:cA:56:76:54";
        wrong_str = "01:23:45:67:89:Az";
        regex = "^[a-z][A-Z]:[a-z][A-Z]:[a-z][A-Z]:\\d{2}:\\d{2}:\\d{2}";
        print(right_str, wrong_str, regex);

        right_str = "some text 23.78 USD, 29.45 RUR";
        wrong_str = "22 UDD, 0.002 USD";
        regex = "\\d+\\.\\d{1,2}\\ (USD)|(RUR)|(EU)";
        print(right_str, wrong_str, regex);
    }
}

package pr12_15.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> cheliki = new ArrayList<>();
        cheliki.add(new Person("Jmishenko", "Valery", "Albertovich"));
        cheliki.add(new Person("Jmishenko","Varely",""));
        cheliki.add(new Person("Jmishenko", "", "Albertovich"));
        cheliki.add(new Person("", "Valery", "Albertovich"));
        cheliki.add(new Person("Jmishenko", "", ""));
        cheliki.add(new Person("","Valery",""));
        cheliki.add(new Person("", "", "Albertovich"));
        cheliki.add(new Person("", "", ""));
        for (Person chel : cheliki)
            System.out.println(chel.getFIO());
    }
}

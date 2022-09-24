package pr7.Stack;

import java.util.Stack;
import java.util.Scanner;

public class Game {
    public Game(Stack<Integer> f, Stack<Integer> s) {
        int steps = 0;
        Integer c1, c2;
        while (!f.empty() && !s.empty() && steps <= 106) {
            c1 = f.firstElement();
            c2 = s.firstElement();
            if (c1 > c2 && !(c1 == 9 && c2 == 0) || (c1 == 0 && c2 == 9)) {
                f.remove(c1);
                s.remove(c2);
                f.add(c1);
                f.add(c2);
            } else {
                f.remove(c1);
                s.remove(c2);
                s.add(c2);
                s.add(c1);
            }
            System.out.println("step " + ++steps + ": " +
                    "\nfirst: " + f + "\nsecond: " + s + "\n---");
        }
        if (s.empty()) {
            System.out.println("first " + steps);
        }
        if (f.empty()) {
            System.out.println("second " + steps);
        }
        else System.out.println("botva");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> f = new Stack<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 5; i++) {
            f.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            s.add(sc.nextInt());
        }
        new Game(f, s);

    }
}
//package pr7.Stack;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Class {
//
//    public Class(){
//        int count=0;
//        Scanner scanner = new Scanner(System.in);
//        String[] first = scanner.nextLine().split(" ");
//        String[] second = scanner.nextLine().split(" ");
//        Stack<Integer> f = new Stack<>();
//        Stack<Integer> s = new Stack<>();
//        for (int i=0;i<5;i++){
//            f.add(Integer.parseInt(first[i]));
//            s.add(Integer.parseInt(second[i]));
//        }
//        System.out.println(f);
//        System.out.println(s);
//        while (!s.empty() && !f.empty() && count<106){
//            if (f.firstElement()==0 && s.firstElement()==9 || f.firstElement() > s.firstElement() && !(f.firstElement()==9 && s.firstElement()==0)){
//                f.add(f.firstElement());
//                f.add(s.firstElement());
//                f.remove(f.firstElement());
//                s.remove(s.firstElement());
//            }
//            else if (f.firstElement() < s.firstElement() && !(s.firstElement()==9 && f.firstElement()==0) || s.firstElement()==0 && f.firstElement()==9){
//                s.add(f.firstElement());
//                s.add(s.firstElement());
//                s.remove(s.firstElement());
//                f.remove(f.firstElement());
//            }
//            count++;
//            System.out.println(s);
//            System.out.println(f);
//        }
//        if (s.empty()){
//            System.out.println("first "+count);
//        }
//        else if (f.empty()){
//            System.out.println("second "+count);
//        }
//        else{
//            System.out.println("botva");
//        }
//    }
//    public static void main(String[] args) {
//        new Class();
//    }
//}
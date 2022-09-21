package pr7.Deque;

import java.util.*;

public class Game {
    public Game(ArrayDeque<Integer> f, ArrayDeque<Integer> s) {
        int steps = 0;
        Integer c1, c2;
        while (!f.isEmpty() && !s.isEmpty() && steps < 106) {
            c1 = f.getLast();
            c2 = s.getLast();
            if (c1 > c2 && !(c1 == 9 && c2 == 0) || (c1 == 0 && c2 == 9)) {
                f.remove(c1);
                s.remove(c2);
                f.push(c1);
                f.push(c2);
            } else {
                f.remove(c1);
                s.remove(c2);
                s.push(c2);
                s.push(c1);
            }
            System.out.println("step " + ++steps + ": " +
                    "\nfirst: " + f + "\nsecond: " + s + "\n---");
        }
        if (s.isEmpty()) {
            System.out.println("first " + steps);
        }
        if (f.isEmpty()) {
            System.out.println("second " + steps);
        }
        else System.out.println("botva");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> f = new ArrayDeque<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            f.push(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            s.push(sc.nextInt());
        }
        new Game(f, s);

    }
}
////package pr7.Stack;
////
////import java.util.Scanner;
////import java.util.Stack;
////
////public class Class {
////
////    public Class(){
////        int count=0;
////        Scanner scanner = new Scanner(System.in);
////        String[] first = scanner.nextLine().split(" ");
////        String[] second = scanner.nextLine().split(" ");
////        Stack<Integer> f = new Stack<>();
////        Stack<Integer> s = new Stack<>();
////        for (int i=0;i<5;i++){
////            f.add(Integer.parseInt(first[i]));
////            s.add(Integer.parseInt(second[i]));
////        }
////        System.out.println(f);
////        System.out.println(s);
////        while (!s.empty() && !f.empty() && count<106){
////            if (f.firstElement()==0 && s.firstElement()==9 || f.firstElement() > s.firstElement() && !(f.firstElement()==9 && s.firstElement()==0)){
////                f.add(f.firstElement());
////                f.add(s.firstElement());
////                f.remove(f.firstElement());
////                s.remove(s.firstElement());
////            }
////            else if (f.firstElement() < s.firstElement() && !(s.firstElement()==9 && f.firstElement()==0) || s.firstElement()==0 && f.firstElement()==9){
////                s.add(f.firstElement());
////                s.add(s.firstElement());
////                s.remove(s.firstElement());
////                f.remove(f.firstElement());
////            }
////            count++;
////            System.out.println(s);
////            System.out.println(f);
////        }
////        if (s.empty()){
////            System.out.println("first "+count);
////        }
////        else if (f.empty()){
////            System.out.println("second "+count);
////        }
////        else{
////            System.out.println("botva");
////        }
////    }
////    public static void main(String[] args) {
////        new Class();
////    }
////}
//package pr7.Deque;
//
//import java.util.ArrayDeque;
//import java.util.Scanner;
//
//public class Game {
//
//    public Game(){
//        int count=0;
//        Scanner scanner = new Scanner(System.in);
//        String[] first = scanner.nextLine().split(" ");
//        String[] second = scanner.nextLine().split(" ");
//        ArrayDeque<Integer> f = new ArrayDeque<>();
//        ArrayDeque<Integer> s =new ArrayDeque<>();
//        for (int i=0;i<5;i++){
//            f.add(Integer.parseInt(first[i]));
//            s.add(Integer.parseInt(second[i]));
//        }
//        System.out.println(f);
//        System.out.println(s);
//        while (!s.isEmpty() && !f.isEmpty() && count<106){
//            if (f.getFirst()==0 && s.getFirst()==9 || f.getFirst() > s.getFirst() && !(f.getFirst()==9 && s.getFirst()==0)){
//                f.add(f.getFirst());
//                f.add(s.getFirst());
//                f.remove(f.getFirst());
//                s.remove(s.getFirst());
//            }
//            else if (f.getFirst() < s.getFirst() && !(s.getFirst()==9 && f.getFirst()==0) || s.getFirst()==0 && f.getFirst()==9){
//                s.add(f.getFirst());
//                s.add(s.getFirst());
//                s.remove(s.getFirst());
//                f.remove(f.getFirst());
//            }
//            count++;
//            System.out.println(s);
//            System.out.println(f);
//        }
//        if (s.isEmpty()){
//            System.out.println("first "+count);
//        }
//        else if (f.isEmpty()){
//            System.out.println("second "+count);
//        }
//        else{
//            System.out.println("botva");
//        }
//    }
//    public static void main(String[] args) {
//        new Game();
//    }
//}
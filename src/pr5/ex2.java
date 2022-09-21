package pr5;

import java.util.Scanner;

public class ex2 { //№3: display numbers from A to B
    public static void func(int a, int b) {
        if (a == b) System.out.print(a + " ");
        else if (a > b) {
            func(a, b + 1);
            System.out.print(b + " ");
        } else {
            func(a, b - 1);
            System.out.print(b + " ");
        }

    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.println("Numbers from " + a + " to " + b + ":");
        func(a, b);
    }
}

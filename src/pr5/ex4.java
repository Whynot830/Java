package pr5;

import java.util.Scanner;

public class ex4 { //№4 Calculate sum of digits of N
    public static int func(int num) {
        if (num < 10) return num;
        else return func(num / 10) + num % 10;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        n = sc.nextInt();
        System.out.print("Sum of digits of " + n + " is equal to " + func(n));
    }
}

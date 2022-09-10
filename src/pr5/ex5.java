package pr5;

import java.util.Scanner;

public class ex5 { //№6 determine whether number is prime
    public static boolean func(int num, int del) {
        if ((num <= 1)) return false;
        if ((num == 2) || ((int)Math.sqrt(num) + 1 == del)) return true;
        if (num % del == 0) return false;
        else return func(num,del+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        if (func(n,2)) System.out.println("YES");
        else System.out.println("NO");
    }
}

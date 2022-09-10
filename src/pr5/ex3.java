package pr5;

import java.util.Scanner;

public class ex3 { //№4 Count k-digit numbers with
                // sum of digits equal to s
    public static int sum_of_digits(int num) {
        if (num < 10) return num;
        else return sum_of_digits(num / 10) + num % 10;
    }
    public static int func(int num, int k, int s, int counter) {
        if (num == (int)Math.pow(10,k)) return counter;
        else {
            if (sum_of_digits(num) == s) counter++;
            return func(num+1,k,s,counter);
        }

    }

    public static void main(String[] args) {
        int k,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("k = ");
        k = sc.nextInt();
        System.out.print("s = ");
        s = sc.nextInt();
        System.out.println("There are " + func((int)Math.pow(10,k-1),k,s,0)
                + " " + k + "-digit numbers with sum of digits equal to " + s);
    }
}

package pr5;

import java.util.Scanner;

public class ex1 { //№2: display numbers from 1_to_n
    public static void func(int n) {
        if (n != 1) func(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("Numbers from 1 to " + n + ":\n");
        func(n);
    }

}



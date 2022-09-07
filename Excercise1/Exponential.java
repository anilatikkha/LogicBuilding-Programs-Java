package Excercise1;

import java.util.Scanner;

public class Exponential {
    public static void exponential(int x, int n) {
        int exp = 1;
        for (int i = 1; i <= n; i++) {
            exp = exp * x;
        }
        System.out.println("The value of X^N is: " + exp);
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        exponential(x, n);
        sc.close();
    }

}

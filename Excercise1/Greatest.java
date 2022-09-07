package Excercise1;

import java.util.Scanner;

public class Greatest {
    public static int greatest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        sc.close();
        System.out.print("The greatest number is " + greatest(a, b) + ".\n");

    }
}

package Excercise1;

// https://www.baeldung.com/java-greatest-common-divisor

import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        int divisor = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                // System.out.print(i + ",");
                divisor = i;
            }
        }
        return divisor;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        // gcd(a,b);
        sc.close();
    }
}

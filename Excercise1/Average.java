package Excercise1;

import java.util.Scanner;

public class Average {
    public static double average(int a, int b, int c) {
        double avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        System.out.println("Enter number c: ");
        int c = sc.nextInt();
        System.out.print(average(a, b, c));
        sc.close();
    }

}

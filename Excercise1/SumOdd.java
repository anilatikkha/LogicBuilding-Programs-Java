package Excercise1;

import java.util.Scanner;

public class SumOdd {
    public static void sumodd(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("the sum of odd numbers till n are: " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumodd(num);
        sc.close();
    }

}

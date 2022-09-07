package Excercise1;

import java.util.Scanner;

public class Vote {
    public static void vote(int age) {
        if (age > 18) {
            System.out.println("Eligible!");
        } else {
            System.out.println("Not eligible!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        vote(age);
    }
}

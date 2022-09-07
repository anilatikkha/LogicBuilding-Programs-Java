package Excercise1;

import java.util.Scanner;

public class Circumference {
    public static void circumference(double r) {
        double c = 2 * 3.14 * r;
        System.out.println("the circumference of the circle is: " + c);
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circumference(r);
        sc.close();
    }
}

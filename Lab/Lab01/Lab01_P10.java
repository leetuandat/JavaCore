package Lab.Lab01;

import java.util.Scanner;

public class Lab01_P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = sc.nextDouble();
        System.out.println("Enter number b: ");
        double b = sc.nextDouble();
        System.out.println("Enter number c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("This is not a level 2 equation!");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two real solutions: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Dual solution equation:");
                System.out.println("x = " + x);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-delta) / (2 * a);
                System.out.println("The equation has two complex solutions:");
                System.out.printf("x1 = %.2f + %.2fi%n", realPart, imaginaryPart);
                System.out.printf("x2 = %.2f - %.2fi%n", realPart, imaginaryPart);
            }
        }
    }
}

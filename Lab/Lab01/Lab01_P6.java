package Lab.Lab01;

import java.util.Scanner;

public class Lab01_P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter number m1: ");
        int m1 = sc.nextInt();

        System.out.println("Enter number n2: ");
        double n2 = sc.nextDouble();

        System.out.println("Enter number m2: ");
        double m2 = sc.nextDouble();

        System.out.printf("%d + %d = %d  \n", n1, m1, n1 + m1);

        System.out.printf("%.2f - %.2f = %.2f  \n", n2, m2, n2 + m2);

        System.out.printf("%d + %.2f = %.2f  \n", n1, n2, n1 + n2);
    }
}

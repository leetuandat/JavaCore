package Lab.Lab01;

import java.util.Scanner;

public class Lab01_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n: ");
        int n = sc.nextInt();

        System.out.println("Enter number m: ");
        int m = sc.nextInt();

        System.out.printf("%d + %d = %d", n, m, m+n);

    }
}

package Lab.Lab01;

import java.util.Scanner;

public class Lab01_P1234 {
    public static void main(String[] args) {
        System.out.println("Hello, this is my application");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = sc.nextInt();

        System.out.println("Enter number m: ");
        double m = sc.nextDouble();

        System.out.println("Enter string str: ");
        String str = sc.next();

        System.out.println(n);
        System.out.println(m);
        System.out.println(str);
    }
}

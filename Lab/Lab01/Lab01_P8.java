package Lab.Lab01;

import java.util.Scanner;

public class Lab01_P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number b: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number c: ");
        int c = sc.nextInt();

        int maxab = (a > b) ? a : b;
        int maxabc = (c > maxab) ? c : maxab;
        System.out.println("The max above is " + maxabc);

        int minab = (a < b) ? a : b;
        int minabc = (c < minab) ? c : minab;
        System.out.println("The min above is " + minabc);
    }
}

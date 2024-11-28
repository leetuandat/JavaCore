package Lab.Lab01;

import java.util.Scanner;

public class Lab01_P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double x = -b/a;

        System.out.println("The solution of the equation is: "+ x);
    }
}

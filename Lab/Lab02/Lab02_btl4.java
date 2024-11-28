/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/27/2024
 * @time: 09:53 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_btl4 {
    public static void linearEquation(float a, float b) {
        // ax + b = 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has countless solution.");
            } else {
                System.out.printf("The equation has solution: x = %.2f\n", -b/a);
            }
        }
    }

    public static void quadraticEquation(float a, float b, float c) {
        if (a == 0) {
            linearEquation(b, c);
        } else {
            float delta = b*b - 4*a*c;
            if (delta < 0) {
                float real = -b/(2*a);
                float imag = Math.abs(delta)/(2*a);
                System.out.printf("x1 = %.4f + %.2fi\n", real, imag);
                System.out.printf("x2 = %.4f - %.2fi\n", real, imag);
            } else if (delta > 0) {
                System.out.printf("x1 = %.2f\n", (-b + Math.sqrt(delta))/(2*a));
                System.out.printf("x2 = %.2f\n", (-b - Math.sqrt(delta))/(2*a));
            } else {
                System.out.printf("dual solution: x = %.2f", -b/(2*a));
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = input.nextFloat();
        System.out.println("Enter b: ");
        float b = input.nextFloat();
        System.out.println("Enter c: ");
        float c = input.nextFloat();
        quadraticEquation(a, b, c);
    }
}

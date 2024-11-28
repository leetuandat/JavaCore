/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/27/2024
 * @time: 11:20 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_btl6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        while (true) {
            System.out.print("Enter a: ");
            a = sc.nextInt();
            System.out.print("Enter b: ");
            b = sc.nextInt();
            System.out.print("Enter c: ");
            c = sc.nextInt();

            if (a+b > c && a+c > b && b+c > a) {
                System.out.printf("3 edges %d, %d, %d can create triangle\n", a, b , c);

                float perimeter = a+b+c;
                System.out.printf("Perimeter of triangle %.2f\n", perimeter);

                float p = perimeter / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.printf("Area of triangle %.2f\n", area);
                break;
            } else {
                System.out.printf("3 edges %d, %d, %d can't create triangle\n", a, b , c);
            }
        }
    }
}

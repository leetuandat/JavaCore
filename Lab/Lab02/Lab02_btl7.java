/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/28/2024
 * @time: 09:58 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_btl7 {
    public static void maxOfFour(int a, int b, int c, int d) {
        int maxab = (a>b ? a : b);
        int maxcd = (c>d ? c : d);
        int max = maxab > maxcd ? maxab : maxcd;
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        System.out.println("Enter d: ");
        int d = sc.nextInt();
        System.out.println("The largest number of 4 numbers is ");
        maxOfFour(a, b, c, d);
    }
}

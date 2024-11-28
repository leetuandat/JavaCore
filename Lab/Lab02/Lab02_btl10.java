/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/28/2024
 * @time: 11:19 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_btl10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter color char (R, G, B or other char)");
        char color = sc.next().charAt(0);

        switch (color) {
            case 'R': case 'r':
                System.out.println("Red");
                break;
            case 'G': case 'g':
                System.out.println("Green");
                break;
            case 'B': case 'b':
                System.out.println("Blue");
                break;
            default:
                System.out.println("Black");
                break;
        }
    }
}

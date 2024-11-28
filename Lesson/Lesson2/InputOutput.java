/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/26/2024
 * @time: 07:30 PM
 * @package: Lesson.Lesson2
 */

package Lesson.Lesson2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        int a, b = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a = sc.nextInt();

        int c = a + b;
        System.out.printf("\n The sum is: %d", c);
    }
}

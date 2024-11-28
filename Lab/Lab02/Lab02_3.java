/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/26/2024
 * @time: 08:15 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_3 {
    public static class PhuongTrinhB1 {
        float a, b, c;

        public void nhapDuLieu() {
            Scanner sc = new Scanner(System.in);
            System.out.println("_________Enter data_________");
            System.out.println("Enter a: ");
            a = sc.nextFloat();
            System.out.println("Enter b: ");
            b = sc.nextFloat();
            System.out.println("Enter c: ");
            c = sc.nextFloat();
        }

        public void giaiPhuongTrinhB1() {
            if (a == 0) {
                if (b == c) {
                    System.out.println("Equation has countless solution");
                } else {
                    System.out.println("Equation has no solution");
                }
            } else {
                float x = (c-b)/a;
                System.out.printf("Equation has solution: %.2f", x);
            }
        }
    }

    public static void main(String[] args) {
        PhuongTrinhB1 p = new PhuongTrinhB1();
        p.nhapDuLieu();
        p.giaiPhuongTrinhB1();
    }
}

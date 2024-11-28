/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/26/2024
 * @time: 08:07 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_2 {
    public static class SimpleCalculator {
        public void tinhTong() {
            int soA, soB;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            soA  = sc.nextInt();
            System.out.println("Enter b: ");
            soB = sc.nextInt();
            System.out.printf("Result: %d + %d = %d \n", soA, soB, soA+soB);
        }

        public void phepTru() {
            int soA, soB;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            soA  = sc.nextInt();
            System.out.println("Enter b: ");
            soB = sc.nextInt();
            System.out.printf("Result: %d - %d = %d \n", soA, soB, soA-soB);
        }

        public void phepNhan() {
            int soA, soB;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            soA  = sc.nextInt();
            System.out.println("Enter b: ");
            soB = sc.nextInt();
            System.out.printf("Result: %d * %d = %d \n", soA, soB, soA*soB);
        }

        public void phepChia() {
            int soA, soB;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            soA  = sc.nextInt();
            System.out.println("Enter b: ");
            soB = sc.nextInt();
            System.out.printf("Result: %d / %d = %.2f \n", soA, soB, (float)soA/(float)soB);
        }
    }

    public static void main(String[] args) {
        SimpleCalculator mayTinh = new SimpleCalculator();
//        mayTinh.tinhTong();
//        mayTinh.phepTru();
//        mayTinh.phepNhan();
        mayTinh.phepChia();
    }
}

/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/26/2024
 * @time: 09:08 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_btl2 {
    public static class Motorbike {
        String name;
        String manufacturer;
        int wheels;
        public void input () {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Motorbike's name: ");
            name = in.nextLine();
            System.out.print("Enter Motorbike's manufacturer: ");
            manufacturer = in.nextLine();
            System.out.print("Enter Motorbike's wheels: ");
            wheels = in.nextInt();
        }
        public void display () {
            System.out.println("Motorbike's name: " + name);
            System.out.println("Motorbike's manufacturer: " + manufacturer);
            System.out.println("Motorbike's wheels: " + wheels);
        }
    }

    public static void main(String[] args) {
        Motorbike m = new Motorbike();
        m.input();
        m.display();
    }
}

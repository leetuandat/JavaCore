/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/26/2024
 * @time: 08:55 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_btl1 {
    public static class Person {
        private String name;
        private String address;
        private double salary;
        public void input() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            name = sc.nextLine();
            System.out.println("Enter your address: ");
            address = sc.nextLine();
            System.out.println("Enter your salary: ");
            salary = sc.nextDouble();
        }
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.input();
        person.display();
    }
}

package Lab.Lab01;

import java.util.Scanner;

public class Lab01_2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");

        Scanner input = new Scanner(System.in);
        String tenCuaBan;
        System.out.println("Enter the ten cua Ban: ");
        tenCuaBan = input.nextLine();

        System.out.println("Ten cua Ban: " + tenCuaBan);
    }
}

package Lab.Lab01;

import java.util.Scanner;

public class Lab01_3 {
    public static void main(String[] args) {
        String studentName;
        int age;
        float theoryPoint;
        float practicePoint;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        studentName = input.nextLine();

        System.out.println("Enter age: ");
        age = input.nextInt();

        System.out.println("Enter theory point: ");
        theoryPoint = input.nextFloat();

        System.out.println("Enter practice point: ");
        practicePoint = input.nextFloat();

        float averagePoint = (theoryPoint + practicePoint) / 2;
        System.out.printf("Hello %s - %d years old\n", studentName, age);

        System.out.printf("Average: %f \n", averagePoint);
    }
}

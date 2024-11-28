/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/26/2024
 * @time: 09:13 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_btl3 {
    public static class Student {
        String name;
        String studentCode;
        float theoryScore;
        float practiceScore;

        public void setData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            System.out.print("Enter student student code: ");
            studentCode = sc.nextLine();
            System.out.print("Enter student theory score: ");
            theoryScore = sc.nextFloat();
            System.out.print("Enter student practice score: ");
            practiceScore = sc.nextFloat();
        }

        public void rating() {
            System.out.println("Name: " + name);
            System.out.println("Student Code: " + studentCode);
            if (theoryScore < 4) System.out.println("Retake Java theory test.");
            if (practiceScore < 4) System.out.println("Retake Java practice test.");
            float averageScore = (theoryScore + practiceScore) / 2;
            if (averageScore < 4) {
                System.out.println("Relearn!");
            } else if (averageScore  <= 7) {
                System.out.println("You pass exam");
            } else {
                System.out.println("You excellent boiz");
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData();
        s1.rating();
    }
}

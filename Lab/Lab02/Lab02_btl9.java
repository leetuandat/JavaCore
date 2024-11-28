/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/28/2024
 * @time: 10:45 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_btl9 {
    public static String choiceToString(int choice) {
        switch (choice) {
            case 0: return "Scissors";
            case 1: return "Rock";
            case 2: return "Paper";
            default: return "Error";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Scissors - Rock - Paper");
        System.out.println("Choose an option: 0: Scissors, 1: Rock, 2: Paper");

        System.out.println("Enter your choice: ");
        int playerChoice = sc.nextInt();

        int computerChoice = (int) (Math.random() * 3);

        System.out.println("Player Choice: " + choiceToString(playerChoice));
        System.out.println("Computer Choice: " + choiceToString(computerChoice));

        switch (playerChoice) {
            case 0:
                switch (computerChoice) {
                    case 0: System.out.println("Draw!"); break;
                    case 1: System.out.println("You lose! Rock wins scissors"); break;
                    case 2: System.out.println("You win! Scissors wins paper"); break;
                }
            case 1:
                switch (computerChoice) {
                    case 0: System.out.println("You win! Rock win scissors"); break;
                    case 1: System.out.println("Draw!"); break;
                    case 2: System.out.println("You lose! Paper win rock"); break;
                }
            case 2:
                switch (computerChoice) {
                    case 0: System.out.println("You lose! Scissors win paper"); break;
                    case 1: System.out.println("You win! Paper win rock"); break;
                    case 2: System.out.println("Draw!"); break;
                }
                default:
                    System.out.println("Invalid choice! please try again(0, 1, 2)");
        }
    }
}

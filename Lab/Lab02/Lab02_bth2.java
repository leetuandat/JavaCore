/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/26/2024
 * @time: 08:46 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

/**
 * Bắt gặp gái
 *     ├── Xinh? (Yes) ──> Có người yêu? (Yes) ──> Tán bạn trai của nàng
 *     │                                      └── (No) ──> Tán ngay
 *     └── (No) ──> Nhà mặt phố, bố làm to? (Yes) ──> "Tình yêu không biên giới"
 *                                           └── (No) ──> Chuyển cho thằng cùng phòng
 * Nếu tán thành công
 *     └──> Đưa đi ăn, chơi,...
 */

public class Lab02_bth2 {
    public static class FlirtGirl {

        public void SmartFlirt() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Is she beautiful? (1: Beautiful, 2: Urly)");
            int beauty = sc.nextInt();

            if (beauty == 1) {
                System.out.println("Does she have a boyfriend? (Y: Yes, N: No)");
                char haveLover = sc.next().toUpperCase().charAt(0);

                if (haveLover == 'N') {
                    System.out.println("Let's chat");
                } else if (haveLover == 'Y') {
                    System.out.println("Let's chat with her boyfriend");
                } else {
                    System.out.println("Invalid choice");
                }
            } else if (beauty == 2) {
                System.out.println("House on the street, father is a big shot? (Y: Yes, N: No)");
                char condition = sc.next().toUpperCase().charAt(0);

                if (condition == 'Y') {
                    System.out.println("Love has no borders");
                } else if (condition == 'N') {
                    System.out.println("Give your bro a chance. :))))");
                } else {
                    System.out.println("Invalid choice");
                }
            } else {
                System.out.println("Invalid choice");
            }
            System.out.println("If she said yes, let's go play! ;)");
            sc.close();
        }

    }

    public static void main(String[] args) {
        FlirtGirl girlHandle = new FlirtGirl();
        girlHandle.SmartFlirt();
    }
}

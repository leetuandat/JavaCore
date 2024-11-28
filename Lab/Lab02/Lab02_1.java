/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/26/2024
 * @time: 07:57 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_1 {
    public static class SinhVien {
        String name;
        String address;
        int soLanThi;
        float diemJava;
        double lePhiThi;
        char gioiTinh;
        void nhapThongTin() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter name: ");
            name = input.nextLine();
            System.out.println("Enter address: ");
            address = input.nextLine();
            System.out.println("Enter SoLanThi: ");
            soLanThi = input.nextInt();
            System.out.println("Enter diemJava: ");
            diemJava = input.nextFloat();
            System.out.println("Enter lePhiThi: ");
            lePhiThi = input.nextFloat();
            System.out.println("Enter gioiTinh: ");
            gioiTinh = input.next().charAt(0);
        }
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        System.out.println("Name: "+sv.name);
        System.out.println("Address: "+sv.address);
        System.out.println("SoLanThi: "+sv.soLanThi);
        System.out.println("DiemJava: "+sv.diemJava);
        System.out.println("LePhiThi: "+sv.lePhiThi);
        System.out.println("GioiTinh: "+sv.gioiTinh);
    }
}


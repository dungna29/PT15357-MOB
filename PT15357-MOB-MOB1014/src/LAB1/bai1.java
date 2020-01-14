/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author Asus Gaming PC
 */
public class bai1 {

    public static void main(String[] ags) {
        String FullName,StudentCode;
        int YearofBirth;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Xin mời nhập họ tên: ");
        FullName = scanner.nextLine();
        System.out.print("Xin mời nhập năm sinh: ");
        YearofBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Xin mời nhập mã sinh viên: ");
        StudentCode = scanner.nextLine();
        System.out.println("Chào bạn " + FullName + " | " + YearofBirth + " | " + StudentCode + " Đến với chương trình java đầu tiên");
    }
}

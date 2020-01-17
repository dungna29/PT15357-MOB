/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LegendNguyen
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            Menu();
            NguoiDungChonChucNang();
        }

    }

    static void Menu() {
        System.out.println("****** Chương Trình Quản Lý SV & GV                             ******");
        System.out.println("****** 1.Thêm Mới Sinh Viên & Thêm Mới Giáo Viên                ******");
        System.out.println("****** 2.Chỉnh Sử Giờ Dạy Giáo Viên                             ******");
        System.out.println("****** 3.Chỉnh Sử Mã Sinh Viên Theo Mã SV                       ******");
        System.out.println("****** 4.DS Sinh Viên Và Giáo Viên                              ******");
        System.out.println("****** 5.Tìm Các Sinh Viên Theo Điểm Trung Bình                 ******");
        System.out.println("****** 6.Xóa Sinh Viên Theo Mã SV                               ******");
        System.out.println("****** 7.Xuất 5 Sinh Viên có số điểm cao hoặc thấp              ******");
        System.out.println("****** 8.Sắp xếp Sinh Viên và Giáo Viên Theo Tên                ******");
        System.out.println("****** 9.Xuất 5 giáo viên có số giờ dạy cao nhất hoặc thấp nhất ******");
        System.out.println("****** 10.Xuất danh sách sinh viện được học bổng hoặc học lại   ******");

    }

    static void NguoiDungChonChucNang() {
        String input;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mời bạn chọn chức năng bằng cách nhập số từ bàn phím: ");
            input = sc.nextLine();
            Pattern pattern = Pattern.compile("\\d*");// Cụm so sánh Regex là kiểu số từ 0 đến 9
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {//matcher chỉ trả ra giá trị true hoặc false
                //Switch case
                switch (Integer.parseInt(input)) {
                    case 1:
                        System.out.println("Vào chức năng 1");
                        //Triển khai các chứng năng bên trong nó
                        break;
                    case 2:
                        System.out.println("Vào chức năng 2");
                        break;
                    case 3:
                        System.out.println("Vào chức năng 3");
                        // break; không sử dụng thì sẽ đọc xuống tiếp
                        break;
                    case 4:
                        System.out.println("Chức năng thoát");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có chức năng đó");
                }

            } else {
                System.out.println("Mời bạn nhập vào kiểu số để chọn chức năng ");

            }
        } while (true);

    }

}

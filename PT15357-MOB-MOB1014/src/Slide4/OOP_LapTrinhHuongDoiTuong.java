/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide4;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */
public class OOP_LapTrinhHuongDoiTuong {

    //Mời người dùng nhập vào tên sinh viên mã sinh viên và năm sinh và điểm
    //Sau đó in ra màn hình   
 

    public static void main(String[] args) {
//        String DV_TENDV,KieuDongVat;      
//        String MauDongVat;
//        String ThucAn;
//        String GioiTinhDongVat;
//        String PT_TENPHUONGTIEN;
//        String MauSAc;
//        String Guong;
//        String SV_TenSV;
//        String msv;
//        int namsinh;
//        double diem;
//        int tuoi;
//        String danhgiagv;
//        //sẽ có rất thuộc tính khác
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời bạn nhập tên: ");
//        ten = sc. nextLine();
//        System.out.println("");
//        System.out.print("Mời bạn nhập MSV: ");
//        msv = sc.nextLine();
//        System.out.println("");
//        System.out.print("Mời bạn nhập Năm Sinh: ");
//        namsinh = sc.nextInt();
//        System.out.println("");
//        tuoi = 2021 - namsinh;
//
//        System.out.println("Thông tin của sinh viên là:" + ten + " " + msv + " " + namsinh + " " + tuoi);
        Student studentCLASS = new Student();       
        studentCLASS.InputStudent();
        studentCLASS.OutputStudent();
        studentCLASS.TinhTuoiSV(2000);
       
       
    }

    static void OOP() {
        //OOP (LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG) (OBJECT ORIENTED PROGRAMMING)
        //Class: Một tập hợp các đối tượng bên trong gọi là Class. 
        //Đối tượng (Object): được xem là một thực thể trong thế giới thực.
        //Object bao gồm: Thuộc tính (Attribute/Properties) và Phương Thức (Hàm) (Method)
        //Attribute: Các thuộc tính của đối tượng
        //Properties: 

        //***4 Tính chất quan trọng của OOP***
        //Tính trừu tượng (abstraction):
        //Trừu tượng có nghĩ là tổng quát hóa một cái gì đó lên. không cần chú ý chi tiết bên trong.
        //Tính đóng gói (encapsulation):
        //Tính chất này nhằm bảo vệ đối tượng không bị truy cập từ code bên ngoài vào để thay
        //đổi giá trị các thuốc tính hay có thể truy cập trực tiếp. Việc này do người lập trình
        //viết ra để bảo mật lớp. Tính chất này giúp bảo vệ toàn vẹn đối tượng trong java.        
        //Tính đa hình (polymorphism): 
        //Đối với tính chất đa hình, nó được thể hiện rõ qua việc gọi phương thức của đối tượng.
        //Các phương thức hoàn toàn có thể giống nhau, nhưng việc xử lý luồng có thể khác nhau.
        //Tính kế thừa (inheritance): 
        //Tính kế thừa cho phép ta xây dựng một lớp mới dựa trên các định nghĩa của một lớp đã có. 
    }

}

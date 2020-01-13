/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_NhapXuatDuLieu {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // *********** Xuất Dữ liệu ra màn hình ***********
        //System.out.print(): Xuất xong không xuống dòng
        //System.out.println(): Xuất xong có xuống dòng
        //System.out.printf(): Xuất có định dạng, các ký tự định dạng
        // %d: số nguyên , %f: số thực, %s: chuỗi, \n: xuống dòng \t: 1 tab
        //System.out.printf("Đào tạo %d \nnghề", 12);

        //System.out.print("Nguyen");
        //System.out.print(" Anh");
        //System.out.println(" Dung");
        //System.out.print("Day Java 1");
        //In ra màn hình Tên tôi là NAD;
        //System.out.printf("");
        //Cách thông thường:
        //String namestudent = "NAD";  
        //String schoolname = "POLY";  
        //System.out.println("Tên tôi là " + namestudent + " Dậy java 1 của trường " + schoolname);
        //Cách sử dụng printf
        //System.out.printf("Tên tôi là %s Dậy java 1 \n của trường %s", namestudent,schoolname);
        //System.out.println("");
        // *********** Nhập Dữ liệu từ màn hình ***********
        //Scanner sc = new Scanner(System.in);
        //sc.next(): Nhận vào một String token (nhận vào 1 từ đầu tiên thay cả câu) //ghi cả 1 chuổi gồm 2 từ là "ANH DŨNG" nó sẽ chỉ lấy chữ ANH
        //sc.nextInt(): Nhận vào một số int
        //sc.nextLong(): Nhận vào một số long
        //sc.nextFloat(): Nhận vào một số float
        //sc.nextDouble(): Nhận vào một số double
        //sc.nextLine(): Nhận vào một chuỗi String (Cả 1 câu)
        //sc.nextByte(): Nhận vào một byte
        //sc.nextBoolean(): Nhận vào một boolean
        //Viết 1 chương trình tính tuổi của bạn       
        //Có thể thử 1 bài khác là truyền tên vào rồi in tên ra.
        //Toán tử + có thể sử dụng để cộng chuỗi
        //Tính số tuổi 1 người khi nhập năm sinh vào.
        //Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập năm sinh 4 số vào để tính số tuổi: ");
        int age, year = 2020, kq;
        age = sc.nextInt();
        kq = year - age;
        System.out.println("Số tuổi hiện tại của bạn là: " + kq + "Số năm bạn đã nhập là:" + age);
        
      
        

    }

}

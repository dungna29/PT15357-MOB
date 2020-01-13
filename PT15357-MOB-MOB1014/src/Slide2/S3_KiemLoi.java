/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class S3_KiemLoi {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số: ");
        //Dùng Try Catch để kiểm tra lỗi nếu người dùng nhập vào không đúng gây lỗi
        try {
            a = sc.nextInt();
            System.out.println("Số bạn vừa nhập là: " + a);
        } catch (Exception e) {
            System.out.println("Mày ngu lắm nhập số vào");

        }
        //a = sc.nextInt();
        //System.out.println("Số bạn vừa nhập là: " + a);
        System.out.println("Chúc mừng mày đã điền số thành công");
        
    }

}

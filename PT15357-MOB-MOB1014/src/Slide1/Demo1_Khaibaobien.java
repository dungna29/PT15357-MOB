/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide1;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class Demo1_Khaibaobien {

    public static void main(String[] args) {
        //Khai báo 2 biến số nguyên a, b và c
        //Thực hiện phép cộng a và b được c
        //Xuất kết quả c
        int a, b, c;
        // int b;//cách khai báo từng biến
        //a = 15;
        //b = 19;
        //c = a + b;
        //System.out.println("Kết quả 15 + 9 = " + c);
        //int temp;
        //temp = 5 + 7 * 2 - 4 / 2;
        //System.out.println(temp);
        //System.out.printf("Thông tin bạn nhập vào là %s | %d | %s", "Dung", 12, "test");

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("a1 :");
        String temp1 = sc.nextLine();
        System.out.println("a2 :");
        double a1 = sc.nextDouble();
        System.out.println("a3 :");
        String temp2 = sc1.nextLine();
        System.out.println(temp1 + 1 + temp2);
    }

}

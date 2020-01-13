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
public class ChuaBaiLab1 {

    public static void main(String[] args) {
        String name, msv;
        int namsinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap 1: ");
        name = sc.nextLine();
        System.out.println("Moi ban nhap 2: ");
//        namsinh = sc.nextInt();//Trôi lệnh nextLine()
//        sc.nextLine();//Cách 1
        namsinh = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap 3: ");
        msv = sc.nextLine();
        float a = 3.14f;// Cách khai báo float
//        float b = Math.PI cách khai báo PI
    }
}

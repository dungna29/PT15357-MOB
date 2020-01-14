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
public class bai5 {

    public static void main(String[] ags) {
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Xin mời nhập bán kính hình tròn:");
        radius = scanner.nextDouble();
        System.out.println("Chu vi hình tròn = " + (2 * Math.PI * radius));
        System.out.println("Diện tích hình tròn = " + (Math.PI * radius * radius));
    }
}

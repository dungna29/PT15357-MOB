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
public class bai3 {

    public static void main(String[] ags) {
        double NumberOne,NumberTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Xin mời nhập số thứ nhất: ");
        NumberOne = scanner.nextDouble();
        System.out.print("Xin mời nhập số thứ hai: ");
        NumberTwo = scanner.nextDouble();
        System.out.println("Số lớn nhất = " + (Math.max(NumberOne, NumberTwo)));
        System.out.println("Số nhỏ nhất = " + (Math.min(NumberOne, NumberTwo)));
    }

}

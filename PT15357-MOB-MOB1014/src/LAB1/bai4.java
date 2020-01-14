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
public class bai4 {

    public static void main(String[] ags) {
        double Number,IndexNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Xin mời nhập số cần tính: ");
        Number = scanner.nextDouble();
        System.out.print("Xin mời nhập số mũ: ");
        IndexNumber = scanner.nextDouble();
        System.out.println(Number + "^" + IndexNumber + "=" + Math.pow(Number, IndexNumber));
    }

}
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
public class bai2 {

    public static void main(String[] ags) {
        double canh;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Xin mời nhập cạnh của hình vuông: ");
        canh = scanner.nextDouble();
        System.out.println("S=" + (canh * canh));
        System.out.println("C=" + (4 * canh));
    }

}

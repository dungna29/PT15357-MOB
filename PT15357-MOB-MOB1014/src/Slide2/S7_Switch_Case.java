/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S7_Switch_Case {
    //Cấu trúc rẽ nhánh switch - case cho phép bạn lựa chọn một trong nhiều 
    //phương án có khả năng xảy ra, nó có thể dùng dể thay thế cho cấu trúc điều khiểnif - else if - else

    public static void main(String[] args) {
        int choicel;
        Scanner sc = new Scanner(System.in);
        choicel = sc.nextInt();
        switch (choicel) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
            case 4:
                System.out.println("Case 4");
            default:
                System.out.println("Chúng tôi không có sự lựa chọn của bạn");
        }

    }

}

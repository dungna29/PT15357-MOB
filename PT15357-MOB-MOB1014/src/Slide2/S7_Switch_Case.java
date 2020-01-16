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

    public static void main(String[] args) {
        //Cấu trúc rẽ nhánh switch - case cho phép bạn lựa chọn một trong nhiều 
        //phương án có khả năng xảy ra, nó có thể dùng dể thay thế cho cấu trúc điều khiểnif - else if - else
        int a = 3;
        switch (a) {//a là biểu thức bên trong của switch
            case 1:
                System.out.println("Vào chức năng 1");
                //Triển khai các chứng năng bên trong nó
                break;
            case 2:
                System.out.println("Vào chức năng 2");
                break;
            case 3:
                System.out.println("Vào chức năng 3");
                // break; không sử dụng thì sẽ đọc xuống tiếp
                break;
            case 4:
                System.out.println("Vào chức năng 4");
                break;
            default://Nếu tất cả các biểu thức truyền vào không thỏa mãn thì sẽ trả về giá trị mặc định này
                System.out.println("Không có chức năng đó");

        }

    }

}

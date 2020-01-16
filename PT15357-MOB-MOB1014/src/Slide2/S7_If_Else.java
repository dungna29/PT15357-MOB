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
public class S7_If_Else {

    public static void main(String[] args) {
        //Trong ngôn ngữ lập trình Java cũng như các ngôn ngữ lập trình khác, 
        //cấu trúc điều khiển if - else sẽ kiểm tra kết quả của 1 điều kiện và dựa vào kết quả đó để thực hiện các hành động tương ứng.
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Em có thích anh không?");
        temp = sc.nextLine();
//        if (temp.equals("co")) {
//            System.out.println("Chúng mình đi tà tưa đi");
//        } else {
//            System.out.println("Em có thích anh không?");
//        }
        if (temp.equals("co")) {
            System.out.println("Chúng mình đi tà tưa đi");
        } else if (temp.equals("suy nghi")) {
            System.out.println("Em có thích anh không? 1");
        } else {
            System.out.println("Em có thích anh không? 2");
        }

    }

}

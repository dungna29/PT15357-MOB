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
        //Mệnh đề if-else cũng kiểm tra giá trị dạng boolean của điều kiện. 
        //Nếu giá trị điều kiện là True thì chỉ có khối lệnh sau if sẽ được thực hiện, nếu là False thì chỉ có khối lệnh sau else được thực hiện.
        //Xây dựng một menu có sử dụng If Else và Else If
        Scanner sc = new Scanner(System.in);//Gọi lớp scanner để lấy giá trị nhập vào của người dùng
        String input;// Khởi kiểu giá trị String và khai báo biến không khởi tạo giá trị ban đầu
        int a1, b1;//Khởi tạo kiểu giá trị số nguyên với 2 biến ban đầu không khởi tạo giá trị.
        System.out.println("1. Phép cộng");//In ra màn hình chức năng 1
        System.out.println("2. Phép trừ");//In ra màn hình chức năng 2
        System.out.println("Mời bạn chọn phép tính mà bạn muốn?");//In ra màn hình yêu cầu người dùng chọn phép toán người dùng muốn sử dụng
        input = sc.nextLine();//Gán giá trị cho biến input khi người dùng nhập vào
        if (input.equals("1")) {//Nếu người dùng nhập vào 1 thì sẽ thỏa mãn if và trả giá trị bằng true
            System.out.println("Mời bạn nhập số thứ nhất : ");//Yêu cầu người dùng nhập số thứ nhất
            a1 = sc.nextInt();//Gán giá trị cho biến thứ nhất
            System.out.println("Mời bạn nhập số thứ hai : ");
            b1 = sc.nextInt();
            System.out.println("Kết quả phết tính cộng là:" + (a1 + b1));// In ra màn hình kết quả của phép tính cộng
        } else if (input.equals("2")) {//Nếu người dùng không thỏa mãn điều kiện thứ nhất thì sẽ kiểm tra xem điều kiện thứ 2 có thỏa mãn không
            //Thực hiện một mã thực thi nếu thỏa mãn điều kiện 2

        } else {
            //Thực hiện một mã thực thi nếu cả 2 điều kiện trên không thỏa mãn

        }

    }

}

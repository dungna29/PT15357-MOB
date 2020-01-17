/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S1_VongLap {

    public static void main(String[] args) {

        //Vòng lặp while Một vòng lặp while là một cấu trúc điều khiển cho phép bạn lặp đi lặp lại một tác vụ một số lần nào đó.
        //Với kiểu vòng lặp này, chương trình sẽ kiểm tra điều kiện trước khi thực thi phần thân vòng lặp.
//        int x = 0, y = 0;
//        while (x < 5) {
//            x++;
//            System.out.println("Vòng lặp While in lần " + y++);
//            
//            if (x == 3) {
//                break;// Ngắt vòng lặp ngay
//            }
//
//        }
//        //System.out.println("Sau khi chạy xong vòng lặp");
        //Một vòng lặp do … while là tương tự như vòng lặp while, ngoại trừ rằng phần thân của vòng lặp do…while được bảo đảm thực thi ít nhất một lần.
        //Nói cách khác, vòng lặp do ... while thực hiện phần thân vòng lặp trước khi kiểm tra điều kiện.
//        int x = 0, y = 0;
//        do {
//            System.out.println("Java 1 in lần " + y++);
//            x++;
//            if (x == 3) {
//                break;
//            }
//
//        } while (x < 5);
        //Vòng lặp For
        //Một vòng lặp for cho phép bạn viết một vòng lặp một cách hiệu quả để cần thực thi một số lần lặp cụ thể nào đó.
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Java 1 vòng lặp for in lần" + i);
//
//        }
        //Bắt lỗi người dùng nhập vào     Pattern pattern = Pattern.compile("\\d*");  Matcher matcher = pattern.matcher(input);   
        //https://o7planning.org/vi/10175/huong-dan-su-dung-bieu-thuc-chinh-quy-trong-java 
        String input;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bạn phải nhập một số nguyên vào: ");
            input = sc.nextLine();
            Pattern pattern = Pattern.compile("\\d*");// Cụm so sánh Regex là kiểu số từ 0 đến 9
            Matcher matcher = pattern.matcher(input);// Giúp só sánh cụm số và giá trị người dùng nhập vào từ bàn phím
            if (!matcher.matches()) {//Gọi làm matches để trả ra giá trị so sanh là true or false
                System.out.println("Mày phải nhập lại");
            } else {
                System.out.println("Bạn đã nhập đúng");
               
            }
        } while (true);

//        boolean tempbool = input.equals("1") || input.equals("c")  ? true : false;
//        if (tempbool == false) {
//            System.out.println("Bạn đã nhập đúng");
//        } else {
//            System.out.println("Bạn phải nhập lại kiểu số");
//
//        }
        //Bài tập tạo một menu sử dụng switch case chương trình máy tính đơn giản có sử dụng switch case và sử dụng vòng lặp và bắt lỗi người dùng nhập vào
    }

    static void Menu() {
        System.out.println("--------------Chương trình máy tính cơ bản -----------------");
        System.out.println("| 1. Phép Cộng                                             |");
        System.out.println("| 2. Phép Trừ                                              |");
        System.out.println("| 0. Thoát                                                 |");
        System.out.println("------------------------------------------------------------");
    }

}

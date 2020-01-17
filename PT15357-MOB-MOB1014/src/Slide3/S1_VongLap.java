/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide3;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S1_VongLap {

    public static void main(String[] args) {

        //Vòng lặp while Một vòng lặp while là một cấu trúc điều khiển cho phép bạn lặp đi lặp lại một tác vụ một số lần nào đó.
        //Với kiểu vòng lặp này, chương trình sẽ kiểm tra điều kiện trước khi thực thi phần thân vòng lặp.
        int x = 10;
        while (x != 10) {
            System.out.println("abc");

        }

        //Một vòng lặp do … while là tương tự như vòng lặp while, ngoại trừ rằng phần thân của vòng lặp do…while được bảo đảm thực thi ít nhất một lần.
        //Nói cách khác, vòng lặp do ... while thực hiện phần thân vòng lặp trước khi kiểm tra điều kiện.
        //Vòng lặp For
        //Một vòng lặp for cho phép bạn viết một vòng lặp một cách hiệu quả để cần thực thi một số lần lặp cụ thể nào đó.
        //Bắt lỗi người dùng nhập vào     Pattern pattern = Pattern.compile("\\d*");  Matcher matcher = pattern.matcher(input);
        //https://o7planning.org/vi/10175/huong-dan-su-dung-bieu-thuc-chinh-quy-trong-java       
        //Bài tập tạo một menu sử dụng switch case chương trình máy tính đơn giản có sử dụng switch case và sử dụng vòng lặp và bắt lỗi người dùng nhập vào
    }
    static void Menu() {
        System.out.println("----------Hệ thống quản lý -----------");
        System.out.println("| 1. Phép Cộng                                 |");
        System.out.println("| 2. Phép Trừ                                  |");     
        System.out.println("| 0. Thoát                                     |");
        System.out.println("------------------------------------------------");
    }

}

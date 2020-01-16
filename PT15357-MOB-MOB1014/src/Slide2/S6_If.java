/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

/**
 *
 * @author LegendNguyen
 */
public class S6_If {

    public static void main(String[] args) {
        //Mệnh đề if trong java được sử dụng để kiểm tra giá trị dạng boolean của điều kiện. Mệnh đề này trả về giá trị True hoặc False .
        // Giống như trong tiếng anh các bạn phải sử dụng mệnh đề nếu thì. Nếu các bạn chăm chỉ code thì sẽ qua môn java1.
        // Vì vậy trong lập trình cũng có câu điều kiện tương tự đó là IF và nếu thỏa mãn sẽ chạy vào bên trong if để thực hiện một hành độc thực thi
        //Ví dụ tìm số nguyên âm và nguyên dương
        int a = -5;
        if (a < 0) {//Điều kiện phải thỏa mãn và có giá trị bằng true thì mới chạy vào trong để thực thi
            System.out.println("Số nguyên âm ");
        }
        if (a > 0) {//Điều kiện phải thỏa mãn và có giá trị bằng true thì mới chạy vào trong để thực thi
            System.out.println("Số nguyên dương ");
        }

        //Ví dụ viết 1 chương trình đẳng nhập có 2 biến String user và pass là 
        final String user = "dungna";
        final String pass = "12345";
        String user1 = "dungna";
        String pass1 = "12345";
        if (user == user1 && pass == pass1) {//nếu mật khẩu và password trùng với 2 giá trị hằng thì if = true và cho người dùng đăng nhập vào
            System.out.println("Đăng nhập thành công ");
        }
        if (!(user == user1 && pass == pass1)) {//Phủ định của câu if trên
            System.out.println("Đăng nhập thất bại ");
        }

    }

}

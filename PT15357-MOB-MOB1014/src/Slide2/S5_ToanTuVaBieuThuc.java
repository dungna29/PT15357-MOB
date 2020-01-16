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
public class S5_ToanTuVaBieuThuc {

    public static void main(String[] args) {
        //Toán tử số học bao gồm + - * /  %(Chia lấy dư)   ++ -- 
        
        //Ví dụ về toán tử:
        //int a = 5;//Khai báo một số nguyên kiểu int với tên biến là a và khởi tạo giá trị ban đầu là 5
        //a++;// Tăng giá trị của a lên 1
        //++a;// Tăng giá trị của a lên 1
        //System.out.println(a);// In ra kết quả a để xem kết quả
        
        //Ví dụ về toán tử --
        //int b = 5;
        //b--;// Giảm giá trị của b đi 1
        //++b;
        //System.out.println(b);

        //Toán tử so sánh > , < , >=, <=, ==, != dùng để so sánh giữa 2 giá trị trả ra giá trị true hoặc false
        //boolean bool = 5 == 9;//Nếu 5 mà bằng 9 thì sẽ trả ra giá trị true hoặc false
        
        //Toán tử Logic (|| (hoặc)) (&& (và)) (!(phủ định) not) Dùng để nối giữa 2 mệnh đề điều kiện và trả ra giá trị true hoặc false tùy vào điều kiện bài toán đề ra
        //boolean boollogic = !((1 > 0) && (8 > 0));// Phủ định của ((1 lớn hơn 0 = true) và  (8 lớn 0 = true)) = true) vì có dấu phủ định bên ngoài nên = false
        


        //Toán tử 3 ngồi <điều kiện> ? <giá trị đúng> : <giá trị sai>
        double diemsv = 8.0;// Khởi tạo biến số thực có kiểu là double và có tên biến là diemsv và khởi tạo giá trị ban đầu là 8.0
        String toantubangoi = 5.0 >= diemsv ? "Toang" : "Hên 3 ngôi"; //Nếu 5.0 mà lớn hơn hoặc bằng diemsv thì vào true hoặc false        
        System.out.println(toantubangoi);
        
        //So sánh giữa việc dùng if và toán tử 3 ngôi các bạn sẽ thấy toán tử 3 ngôi viết gọn gàng code hơn rất nhiều so với việc dùng if trên cùng 1 bài toán
        //Nhưng nếu câu điều kiện phức tạp và dài hơn có thể gây ra khó bảo trì code nếu không có kinh nghiệm
        //Cách sử dụng if bên dưới tường minh hơn rất nhiều
        if (diemsv <= 5.0) {
            System.out.println("Toang");

        }
        if (diemsv > 5.0) {
            System.out.println("Hên");

        }
        if (!false) {
            System.out.println("123");
        }

    }

}

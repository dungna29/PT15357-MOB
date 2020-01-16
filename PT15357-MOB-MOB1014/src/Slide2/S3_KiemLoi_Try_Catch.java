/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class S3_KiemLoi_Try_Catch {

    public static void main(String[] args) {

        //Ví dụ 1: Nếu bài toán không sử dụng Try Catch khi người dùng không đúng với kiểu dữ liệu sẽ làm crash chương trình
        // Các bạn biết rằng code chạy từ trên xuống dưới và khi đến đoạn lỗi nó sẽ làm chương trình dừng lại tại vị trí lỗi
        //int a;//Khai báo 1 biến a không khởi tạo giá trị
        //Scanner sc = new Scanner(System.in);// Gọi lớp Scanner để lấy dữ liệu người dùng từ bàn phím
        //System.out.println("Mời bạn nhập số nguyên: ");//In ra màn hình một lời kêu gọi người dùng nhập vào số
        // a = sc.nextInt();//Nếu người dùng không nhập vào một số nguyên từ bàn phím sẽ làm chương trình báo lỗi và không thực thi tiếp các câu lệnh tiếp theo
        // System.out.println("Số bạn vừa nhập là: " + a);// Dòng này Chỉ thực thi nếu không có lỗi sau khi người dùng nhập vào
        
        
        
        
        //Vì vậy ví dụ 1 vẫn còn nhiều bất cập và cần 1 giải pháp để khắc phục đó chính là Try Catch
        //Kiểm lỗi Khối try trong Java được sử dụng để bao quanh code mà có thể ném một Exception. 
        //Nó phải được thực hiện ở bên trong 1 hàm
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số: ");
        //Dùng Try Catch để kiểm tra lỗi nếu người dùng nhập vào không đúng kiểu số nguyên ở đây và gây ra lỗi
        try {
            a = sc.nextInt();
            System.out.println("Số bạn vừa nhập là: " + a);//Nếu người dùng nhập vào thỏa mãn thì sẽ in ra số người dùng nhập vào
        } catch (Exception e) {
            System.out.println("Bạn phải nhập số vào");//Nếu người dùng nhập không phải số nguyên sẽ in ra một thông báo cho người dùng
        }     
        System.out.println("Chúc mừng bạn đã điền số thành công");//Cho dù người dùng có nhập sai hay đúng thì chương trình luôn chạy đc hết code trong file này

    }

}

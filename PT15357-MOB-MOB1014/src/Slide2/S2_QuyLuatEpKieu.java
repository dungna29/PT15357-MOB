/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

import javax.sound.midi.Soundbank;

/**
 *
 * @author LegendNguyen
 */
public class S2_QuyLuatEpKieu {

    public static void main(String[] args) {
        //Ép kiểu trong java là việc gán giá trị của một biến có kiểu dữ liệu này tới biến khác có kiểu dữ liệu khác.
        
        //Ép kiểu nguyên thủy đối các số
        //Ví dụ 1:
        int a = 5;//khai báo biến a có kiểu số nguyên là int
        short b = 9;// khai báo biến b có kiểu số nguyên là short
        a = b;//Gán giá trị biến a kiểu int = b kiểu short// Cách này được gọi là Ép kiểu tự động  
        a = (int) b;//Cách ép kiểu tường minh sẽ có thêm (int) đứng trước biến
        //b = a;//Không thể gán b có kiểu short bằng int vì size lưu trữ của int lớn hơn short
        
        
        //Ví dụ 2 cũng giống như ví dụ 1
        float f1 = 3.14f;// Khai báo biến f1 với giá trị khởi tạo ban đầu là 3.14 kiểu float
        double d1 = 9.5;//Khai báo biến d1 kiểu dữ liệu là double và khởi tạo giá trị bạn đầu là 9.5
        d1 = f1;// Gán biến d1 kiểu double bằng f1 có kiểu float// Cách này được gọi là ép kiểu tự động
        d1 = (double)f1;
        // f1 = d1;//Lỗi vì không thể gán giá trị của float bằng double được vì size của double lớn hơn float
       

        //Cách ép kiểu chuỗi sang kiểu số 
        String number = "38";//Khai báo biến number với kiểu chuỗi String và khởi tạo là giá trị 38 cũng là kiểu chuỗi
        String number2 = "39";
        System.out.println(number + number2);// Thực hiện cộng 2 chuỗi string thì sẽ không ra kết quả là một phép cộng toán học mà sẽ là một phép cộng chuỗi
        // Để thực hiện được phép cộng toán học các bạn phải Convert từ số kiểu chuỗi về dạng số học thì phải gọi lớp Integer.parseInt("Truyền số kiểu chuỗi vào")
        int temp1 = Integer.parseInt(number) + Integer.parseInt(number);
        double temp2 = Double.parseDouble("8.5") + 8.6;//Cũng tự tự kiểu số nguyên, Bạn cần gọi hàm số thực để ép kiểu chuỗi số thực về kiểu số thực.
        boolean temp3 = Boolean.parseBoolean("false");//Đối với Boolean thì chỉ có 2 giá trị True và False
        System.out.println(temp3);
        
        // Các bạn có thể thực hành bài trong bài Lab

    }

}

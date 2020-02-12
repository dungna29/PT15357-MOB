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
public class S2_Mang {

    public static void main(String[] args) {
        //Mảng là cấu trúc lưu trữ nhiều phần từ bên trong nó và phải có cùng kiểu dữ liệu.
        //Khi lưu trữ được thì có thể truy xuất các phần tử bên trong nó

        //Khai báo về mảng số nguyên:
        int[] a;//Khai báo mảng chưa bao gồm phần tử
        int b[];//Khai báo mảng chưa bao gồm phần tử
        int c[] = {4, 5, 9, 10, 11, 15, 19, 10, 9, 8, 7, 6};//Khai báo mảng số nguyên đã bao gồm phần tử.
        // Khi đếm phần tử trong mảng phải đếm từ 0
        // Số 4 trong mảng là một phần tử của mảng c.
        //Lấy 1 phần tử ra trong mảng
        //System.out.println("Phần tử lấy ra trong mảng tại vị trí thứ nhất là số " + c[1]);//Không lấy đúng vì truyền sai vị trí của phần tử trong mảng
        //Thứ tự trong mảng bắt đầu tự 0 chứ không bắt đầu từ 1.
        //Chúng ta muốn lấy số 4 nằm trong mảng thì phải truyền vị trí thứ 0
        //System.out.println("Phần tử lấy ra trong mảng tại vị trí thứ nhất là số " + c[0]);
        //Lưu ý: Khi nhắc đến mảng vị trí đầu tiên luôn là 0
        //Giả sử muốn in phần tử 10 nằm trong mảng C[] thì chúng ta phải đếm vị trí 0
        //System.out.println("In phần tử số 10 nằm ở vị trí số 3 đếm từ 0 là " + c[3]);
        //Sử dụng để in cả một mảng ra màn hình chúng ta sẽ sử dụng vòng lặp for
        System.out.println("Độ dài của mảng c[] là: " + c.length);
//        for (int i = 0; i < c.length; i++) {//c/lengt là chỉ độ dài của mảng
//            System.out.println("In phần tử thứ " + i + " Có giá trị là " + c[i]);
        //Vòng lặp sẽ giúp in lần lượt từng phần tử trong mảng ra
        //}
        //Thay thế vị trị của một phật tử trong mảng với một giá trị khác.
        int temp = 3;//khai báo một biến có giá trị bằng 3
        //Lấy vị trị thứ 0 trong mảng c[] để cộng với 3.
        c[0] = 1;//Gán lại giá trị cho vị trí thứ 0 = 1
        int kq = temp + c[0];//Phép toán ở đây sẽ thay đổi
        System.out.println("Vị trí thứ 0 cộng với giá trị temp = " + (temp + c[0]));
        //Các bạn thực hành 5 phút đi tự tạo mảng và khai báo mảng sau đó in mảng ra

        System.out.println(c[0]);// In 1 phần tử trong mảng
        System.out.println(c[1]);
        System.out.println(c[2]);

        //In ra nhiều phần tử trong mảng
//        for (int i = 0; i < c.length; i++) {
//            System.out.println("Giá trị của i = " + i);
//            System.out.println(c[i]);
//        }
        //Vòng lặp nữa foreach
        for (int x : c) {
            System.out.println("Các phần trử trong mảng là: " + x);
        }

    }

}

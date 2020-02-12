/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide3;

import java.util.Arrays;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S3_TongKetMang {

    public static void main(String[] args) {
        //Mảng Arrays trong java (Mảng index luôn bắt đầu từ 0 chứ không phải 1)
        //1. Khai báo một mảng có khởi tạo giá trị hoặc không khởi tạo giá trị 
        //Kiểu dữ liệu [] Tên mảng;  
        //Kiểu dữ liệu Tên mảng[];
        //Kiểu dữ liệu Tên mảng[] = {value,value,value};//Khai báo trực tiếp giá trị  
        //******************************************************
        //KhaiBaoMangBai1();
        //1A. Khai báo một mảng khởi tạo kích thước mảng.        
        //Tên mảng = new Kiểu dữ liệu[Kích thước mảng];
        //******************************************************    

        //2. Gán giá trị một phần tử trong mảng
        //Tên Mảng[Index] = Value;
        //******************************************************
        //3. Lấy một phần tử trong mảng và in ra màn hình.
        //Tên Mảng[Index] in ra giá trị của phần tử trong mảng theo index
        //******************************************************
        //4. In nhiều phần tử trong mảng ra màn hình bằng vòng lặp
        //Sử dụng vòng lặp tăng index trong mảng để in ra các phần tử trong mảng chú ý đến số lần vòng lặp chạy
        //******************************************************
        //5. Tìm kiếm giá trị của phần tử trong mảng sử dụng BinarySearch (cách này phải sắp xếp mảng) binarySearch(Object[] a, Object key)
        //******************************************************
        //6. Tìm kiếm phần tử trong mảng theo cách thủ công bằng vòng lặp
        //******************************************************
        //7. Sắp xếp mảng bẳng Arrays Sort
        //******************************************************
        //8. Gán giá trị mặc định cho tất cả phần tử trong mảng fill(int[] a, int val)
        //******************************************************
        //9. So sánh 2 độ dài 2 mảng Arrays Boolean equals(long[] a, long[] a2) trả ra giá trị đúng hay sai.
        //******************************************************
        //10. Sắp xếp mảng 1 chiều sử dụng thuật toán sắp xếp
        //******************************************************
        //1B. Mảng 2 chiều (Ma Trận)
        //Khai báo mảng 2 chiều:
        //[Kiểu_dữ_liệu] Tên_mảng[][];
        //[Kiểu_dữ_liệu][][] Tên_mảng;       
        //[Kiểu_dữ_liệu] Tên_mảng[][] = new [Kiểu_dữ_liệu] [Số_dòng][Số_cột];
        //Gán dữ liệu cho phần tử mảng 2 chiều
        //Tên_mảng[Chỉ_số_dòng][Chỉ_số_cột] = Value;
        //******************************************************
        //Bài tập1 :
        //Cho người dùng khai báo một mảng và nhập các phần tử vào trong mảng đó sau đó in ra màn hình mảng người dùng nhập vào
        //Sắp xếp mảng người dùng vừa nhập vào
        //BaiTap1();
        //Bài tập 2 :
        //Tạo ra mảng 2 chiều
        //In mảng 2 chiều ra màn hình
        ThuatToan();
    }

    static void KhaiBaoMangBai1() {
        //1. Khai báo một mảng có khởi tạo giá trị hoặc không khởi tạo giá trị 
        //Kiểu dữ liệu [] Tên mảng;  
        //Kiểu dữ liệu Tên mảng[];
        //Kiểu dữ liệu Tên mảng[] = {value,value,value};//Khai báo trực tiếp giá trị 
        //1A. Khai báo một mảng khởi tạo kích thước mảng.        
        //Tên mảng = new Kiểu dữ liệu[Kích thước mảng];
        //******************************************************
        Double[] arrTien = {15.00, 20.90};
        String arrTenSV[] = {"DungNA29", "DuyenNN28", "LongNT89", "NamNA30"};
        int[] arrNamSinh = {1989, 2001, 2002, 2003};
        String arrTruong[];
//        String arrTruong[] = new String[3]; Cách khai baos khác
        arrTruong = new String[3];//Mảng này có thể khai báo tối đa 5 phần tử bên trong nó
        arrTruong[0] = "DH FPT";
        arrTruong[1] = "DH BK";
        arrTruong[2] = "DH CN";
        System.out.println(arrTruong[0]);
        //arrTruong[5] = "DH CT";//Không được khai báo index lớn hơn size của array(mảng)
//        for (String x : arrTruong) {
//            System.out.println(x);
//        }
//        int tempi = 0;
//        while (tempi < arrTruong.length) {
//            System.out.println(arrTruong[tempi]);
//            tempi++;
//        }
//        for (int i = 0; i < arrTruong.length; i++) {
//            System.out.println(arrTruong[i]);
//        }

    }

    static void BaiTap1() {
        //Bài tập1 :
        //Cho người dùng khai báo một mảng và nhập các phần tử vào trong mảng đó sau đó 
        //in ra màn hình mảng người dùng nhập vào        
        //Phân tích\
        //Mời người dùng nhập vào kích thước của mảng
        //Cảm ơn bạn đã nhập vào kích thước của mảng là số mà người dùng.
        //Mời người dùng nhập vào các phần tử có trong mảng đến khi kết thúc.
        //In ra mảng người dùng đã nhập vào
        int[] arrSoNguyen;//Khai báo mộng mảng
        int _sizeArr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào kích thước của mảng: ");
        _sizeArr = sc.nextInt();//Sau khi nhận được giá trị của người dùng nhập vào SIZE CỦA MẢNG
        arrSoNguyen = new int[_sizeArr];//Khởi tạo luôn mảng với kích thước như người dùng nhập vào
        System.out.println("Cảm ơn kích thước của mảng bạn nhập vào là: " + _sizeArr);
        int input;
        for (int i = 0; i < _sizeArr; i++) {//Vòng lặp for dùng để gán giá trị vào các phần tử cỏ trong mảng
            System.out.print("Mời bạn nhập vào giá trị phần tử số : " + (i + 1));
            input = sc.nextInt();//Lấy giá trị của người dùng nhập vào
            arrSoNguyen[i] = input;//Gán giá tại index           
        }
        System.out.println("Mảng bạn vừa nhập vào là");
        for (int x : arrSoNguyen) {
            System.out.print(x + " ");
        }

    }

    static void CacHamArrays() {
        //5. Tìm kiếm giá trị của phần tử trong mảng sử dụng BinarySearch (cách này phải sắp xếp mảng) binarySearch(Object[] a, Object key)
        //******************************************************
        //6. Tìm kiếm phần tử trong mảng theo cách thủ công bằng vòng lặp
        //******************************************************
        //7. Sắp xếp mảng bẳng Arrays Sort
        //******************************************************
        //8. Gán giá trị mặc định cho tất cả phần tử trong mảng fill(int[] a, int val)
        //******************************************************
        //9. So sánh 2 độ dài 2 mảng Arrays Boolean equals(long[] a, long[] a2) trả ra giá trị đúng hay sai.
        //******************************************************
        String arrLop[] = {"WamNA30", "DungNA29", "DuyenNN28", "LongNT89", "NamNA30"};
        String arrLop2[] = {"WamNA30", "DungNA29", "DuyenNN28", "LongNT89", "NamNA30"};

        String _msv = "DuyenNN281";
//        int index = Arrays.binarySearch(arrLop, _msv);//Cách tìm kiếm sử dụng BinarySearch nếu trả về âm là không tồn tại
//        if (index >= 0) {
//            System.out.println("Bạn CÓ trong danh sách của lớp học");
//        } else {
//            System.out.println("Bạn không có trong danh sách của lớp học");
//        }
//
//        //Sắp sếp danh sách Sort
//        //Arrays.sort(arrLop);
//        for (String x : arrLop) {
//            System.out.println(x);
//        }
//        //Fill trong Array
//        //Arrays.fill(arrLop, "Toan12");
//        for (String x : arrLop) {
//            System.out.println(x);
//        }
//        //So sánh 2 mảng trong Arrays.equals(mang1, mang2);
//        boolean tempequal = Arrays.equals(arrLop, arrLop2);
//        System.out.println(tempequal);
//        if (Arrays.equals(arrLop, arrLop2)) {
//            System.out.println("2 mảng bạn vừa truyền vào bằng nhau");
//        } else {
//            System.out.println("2 mảng bạn vừa truyền vào KHÔNG bằng nhau");
//        }

        //Tìm kiếm bằng cách thủ công trong mảng này
        boolean temp = true;//Cái này gọi là cờ
        for (String x : arrLop) {
            if (x.equals(_msv)) {
                System.out.println("Bạn có trong danh sách");
                temp = false;
                break;
            }
        }
        if (temp == true) {
            System.out.println("Bạn không có trong danh sách");
        }
    }

    static void ThuatToan() {
        int[] a = {9, 7, 8, 4};
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("Vòng lặp của 1");
            for (int j = 1; j < a.length; j++) {
                System.out.println("Vòng lặp của 2");
                System.out.println(" i và j  hiện tại = " + i + "  " + j);
                System.out.println("Mảng TRƯỚC khi kiểm tra");
                for (int x : a) {
                    System.out.print(x + "  ");
                }
                System.out.println("");
                System.out.println("Kiểm tra j có lớn hơn j " + a[i] + " > " + a[j]);                
                if (a[i] > a[j]) {//nếu vị trí liên kề mà lớn hơn thì dảo cho nó
                    temp = a[i];// 9 > 8 temp = 9
                    a[i] = a[j];// vị trí ố 0 sẽ bằng 8
                    a[j] = temp;
                }
                System.out.println("Mảng SAU khi kiểm tra");
                for (int x : a) {
                    System.out.print(x + "  ");
                }
                System.out.println("");
            }

        }

        for (int x : a) {
            System.out.print(x + "  ");
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời bạn chọn Yes hoặc No (Bạn phải gõ SV hoặc GV)");
//        String input = sc.nextLine();
//        input.toLowerCase();//Khi ng dùng truyền vào Y thì nó sẽ bị thành y thường
//        if (input.length() == 1) {
//            //ngườ dùng có thể nhập y Y hoặc n N
//            if (input.equals("y")) {
//                //Thực hiện 1 chức năng nào đó
//                //Khi người ta truyền nguyễn Thị Duyên - nguyễn thị duyên
//            }
//            if (input.equalsIgnoreCase("y")) {
//                //Thực hiện 1 chức năng nào đó
//            }
//        }else{
//            System.out.println("Bạn phải nhập 1 ký tự");
//        }

    }

}

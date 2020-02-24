package Slide5;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {

    String ten;
    double gia;
    String hangsx;

    public String toString() {
        return " Tên : " + ten + " Giá : " + gia + " Hãng sản xuất : " + hangsx;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm : ");
        ten = scanner.nextLine();
        System.out.print("Nhập giá : ");
        gia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập hãng sản xuất : ");     
        hangsx = scanner.nextLine();
       
    }

    public static void main(String[] args) {
        ArrayList<SanPham> arrSanpham = new ArrayList<SanPham>();
        for (int i = 0; i < 1; i++) {
            System.out.println("Nhập thông tin sản phẩm " + (i + 1));
            SanPham sanpham = new SanPham();
            sanpham.Input();
            arrSanpham.add(sanpham);
        }
        System.out.println(arrSanpham.get(0).hangsx);
        System.out.println(arrSanpham.get(0).hangsx.equals("Apple"));
        
        System.out.println("Các sản phẩm có hãng Apple là : ");        
        for (int i = 0; i < arrSanpham.size(); i++) {
            if(arrSanpham.get(i).hangsx.equals("Apple")){
                System.out.println(arrSanpham.get(i).toString());
            }            
        }

    }
}

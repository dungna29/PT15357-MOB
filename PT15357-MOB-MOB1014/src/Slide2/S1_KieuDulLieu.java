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
public class S1_KieuDulLieu {

    public static void main(String[] args) {
        //Kiểu dữ liệu (int, double, float...)

        //1.Kiểu dữ liệu số nguyên:     
        byte b = 0;
        short sh = 9;
        int in = 8;// Hay sử dụng
        long l = 7;
        long l1 = 7l;
        long l2 = 7L;
        //2. Kiểu số thực:
        float f1 = 9.5f;
        float f2 = 9.5F;
        float f21 = (float) 9.5;//Ko sử dụng cách này
        double d1 = 8.2;//Hay sử dụng
        double d2 = 8.2d;
        double d3 = 8.2D;
        //3. Kiểu ký tự:
        char c = '1';
        char c1 = 'A';
        //4. Kiểu logic:
        boolean bl = true;//Cực nhiều
        boolean b2 = false;//Cực nhiều
        //5. Kiểu chuỗi:
        String str = "JAVA1";//Cực nhiều
        byte temp1 = 127;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}

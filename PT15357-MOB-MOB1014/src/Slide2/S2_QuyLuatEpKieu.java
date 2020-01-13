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
        //Ép kiểu nguyên thủy đối các số
        int a = 5;
        short b = 9;
        a = b;//Ép kiểu tự động
        //b = a;//Không ép kiểu được vì size short nhỏ hơn int
        float f1 = (float) 3.14;// Ép kiểu tường minh
        double d1 = 9.5;
        // f1 = d1;//Lỗi
        d1 = f1;//Ép kiểu tự động

        //Chuyển String sang kiểu nguyên thủy
        String number = "38";
        String number2 = "39";
        System.out.println(number + number2);
        int temp1 = Integer.parseInt(number) + Integer.parseInt(number);
        double temp2 = Double.parseDouble("8.5") + 8.6;
        boolean temp3 = Boolean.parseBoolean("false");
        System.out.println(temp3);
        //Double.parseDouble("Luôn truyền String")

    }

}

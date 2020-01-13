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
public class S4_Wrapper {

    public static void main(String[] args) {
        //Mỗi kiểu dữ liệu nguyên thủy đều có các Lớp của riêng nó
        double temp = 9.5;
        //Boxing
        Double d0 = Double.valueOf(8.5);//Khai báo tường minh
        Double d1 = new Double(temp);//Khai báo tường minh
        Double d = 5.0;//khai báo ngầm định
        
        //Unbox
        temp = d0.doubleValue();//Unbox 2
        temp = d;//Unbox 1
        
        //Đã khai bao biến là viết thường
        

    }

}

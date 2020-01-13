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
        int a = -5;
        if (a < 0) {
            System.out.println("Số nguyên âm ");
        }
        if (a > 0) {
            System.out.println("Số nguyên dương ");
        }

        String user = "dungna";
        String pass = "12345";
        String user1 = "dungna";
        String pass1 = "12345";
        if (user == user1 && pass == pass1) {
            System.out.println("Đăng nhập thành công ");
        }
        if (!(user == user1 && pass == pass1)) {
            System.out.println("Đăng nhập thất bại ");
        }

    }

}

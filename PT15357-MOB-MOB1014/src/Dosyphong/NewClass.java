/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosyphong;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nguyen Anh Dung
 */
public class NewClass {

    public static void main(String[] args) {
        Bai1();
        //Bai2();

    }

    static void Bai1() {
        Scanner scanner = new Scanner(System.in);
        int amount;
        System.out.print("Xin mời nhập số lượng chuỗi: ");
        amount = scanner.nextInt();
        scanner.nextLine();
        String[] arrInput = new String[amount];
        String[] arrTen;
        for (int i = 0; i < arrInput.length; i++) {
            System.out.println("Xin mời nhập chuỗi " + (i + 1));
            arrInput[i] = scanner.nextLine();
        }
       
        System.out.println("\n");
        System.out.print("mảng kiểu Ký tự: ");
        Pattern pattern = Pattern.compile("[a-zA-Z]+");//pattern ở đây là gồm các chữ cái trong bàn phím
        Arrays.sort(arrInput);
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher = pattern.matcher(arrInput[i]);
            if (matcher.matches()) {
                System.out.print(arrInput[i] + " ");                
            }            
        }
       
        
       
        
        
//        for (String inPut1 : arrInput) {
//            Pattern pattern = Pattern.compile("[a-zA-Z]+");
//            Matcher matcher = pattern.matcher(inPut1);
//            while (matcher.find()) {
//                System.out.print(inPut1.substring(matcher.start(), matcher.end()) + " | ");
//            }
//        }
//        System.out.println("\n");
//        System.out.print("mảng kiểu số: ");
//        for (String inPut1 : arrInput) {
//            Pattern pattern = Pattern.compile("[0-9]+");
//            Matcher matcher = pattern.matcher(inPut1);
//            while (matcher.find()) {
//                System.out.print(inPut1.substring(matcher.start(), matcher.end()) + " | ");
//            }
//        }
//        System.out.println("\n");
//        System.out.print("mảng ký tự: ");
//        for (String inPut1 : arrInput) {
//            Pattern pattern = Pattern.compile("\\W+");
//            Matcher matcher = pattern.matcher(inPut1);
//            while (matcher.find()) {
//                System.out.print(inPut1.substring(matcher.start(), matcher.end()) + " | ");
//            }
//        }
//        System.out.println("*********************************************");
//        System.out.println("\n Sắp xếp");
//        Arrays.sort(arrInput);
//        System.out.println("\n");
//        System.out.print("mảng kiểu chữ: ");
//        for (String inPut1 : arrInput) {
//            Pattern pattern = Pattern.compile("[a-zA-Z]+");
//            Matcher matcher = pattern.matcher(inPut1);
//            while (matcher.find()) {
//                System.out.print(inPut1.substring(matcher.start(), matcher.end()) + " | ");
//            }
//        }
//        System.out.println("\n");
//        System.out.print("mảng ký tự: ");
//        for (String inPut1 : arrInput) {
//            Pattern pattern = Pattern.compile("\\W+");
//            Matcher matcher = pattern.matcher(inPut1);
//            while (matcher.find()) {
//                System.out.print(inPut1.substring(matcher.start(), matcher.end()) + " | ");
//            }
//        }
    }

    static void Bai2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("xin mời nhập 8 tên riêng");
        ArrayList a = new ArrayList();
        for (int i = 0; i < 8; i++) {
            System.out.print("Mời nhập tên thứ " + (i + 1) + ": ");
            a.add(i, scanner.nextLine());
        }
        System.out.println("Chưa sắp xếp");
        System.out.println(a);
        System.out.println("Đã sắp xếp");
        Collections.sort(a);
        System.out.println(a);
        System.out.println("Bạn có muốn sửa tên ai đó trong mảng không?");
        System.out.println("y/n");
        String a1 = scanner.nextLine();
        if (a1.length() == 1) {
            
        }
        switch (a1) {
            case "y":
                suaTen(a);
                System.out.println("Danh sách sau ki chỉnh sửa");
                System.out.println(a);
                break;
            default:
                System.out.println("Nhập sai xin mời nhập lại");
                break;
        }
        System.out.println("Bạn có muốn xóa tên ai đó trong mảng không?");
        System.out.println("y/n");
        String a2 = scanner.nextLine();
        switch (a2) {
            case "y":
                xoaTen(a);
                System.out.println("Danh sách sau ki chỉnh xóa");
                System.out.println(a);
                break;
            default:
                System.out.println("Nhập sai xin mời nhập lại");
                break;
        }

    }

    static String xoaTen(ArrayList a) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Mời nhập tên muốn xóa");
        String nhap = scanner2.nextLine();
        a.remove(nhap);
        return null;
    }

    static String suaTen(ArrayList a) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Mời nhập tên muốn sửa");
        String nhap = scanner2.nextLine();
        boolean check = a.contains(nhap);
        if (check == true) {
            System.out.println("Xin mời thay thế");
            String thay = scanner2.nextLine();
            int index = a.lastIndexOf(nhap);
            a.set(index, thay);          
        } else {
            System.out.println("Không tìm thấy tên này trong danh sách ");
        }
        return null;
    }

}

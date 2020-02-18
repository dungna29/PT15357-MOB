/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide4;

import java.util.Scanner;
/**
 *
 * @author Nguyen Anh Dung
 */
//Lớp Sinh viên
public class Student {

    //Bao gồm các thuộc tính ngoài đời mà sinh viên có
    private String HoTen;
    private int NamSinh;
    private String Lop;
    private String Msv;
    private String DiaChi;
    private String HanhKiem;
    private String Mail;
    private double Diem;
    private String Nghanh;
    private int GioiTinh;

    //Alt + Insert và Tích vào đầu của lớp đó
    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getMsv() {
        return Msv;
    }

    public void setMsv(String Msv) {
        this.Msv = Msv;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getHanhKiem() {
        return HanhKiem;
    }

    public void setHanhKiem(String HanhKiem) {
        this.HanhKiem = HanhKiem;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }

    public String getNghanh() {
        return Nghanh;
    }

    public void setNghanh(String Nghanh) {
        this.Nghanh = Nghanh;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void InputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập Họ tên: ");
        setHoTen(sc.nextLine());
        System.out.print("Mời bạn nhập Năm Sinh: ");
        setNamSinh(sc.nextInt());
        sc.nextLine();
        System.out.print("Mời bạn nhập Lớp: ");
        setLop(sc.nextLine());

    }

    public void OutputStudent() {
        System.out.println("Thông tin của sinh viên là: " + getHoTen() + " " + getLop() + " " + getNamSinh());

    }

    public void TinhTuoiSV(int namsinh) {
        if (namsinh > 2001) {
            System.out.println("Bạn chưa đủ tuổi đi học");
        } else {
            System.out.println("Bạn đã đủ tuổi đi học");
        }
    }

}

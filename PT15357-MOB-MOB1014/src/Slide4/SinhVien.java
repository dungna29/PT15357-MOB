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
//Class là tên của đối tượng để mô tả các đối tượng cùng loại
// Sinh viên của các lớp Lớp Mobile - Lớp Web - Lớp MArketing - Lớp đồ họa
public class SinhVien {

    //Thuộc tính sinh viên
    //Mỗi đối tượng sinh viên sẽ có các thuộc tính dưới đây
    private String HoVaTen;
    private String Msv;
    private String Tuoi;
    private String diem;
    private String nghanhhoc;
    private String kyhochientai;
    private int namsinh;
    private String TenTruong = "FPT";

    public String getTenTruong() {
        return TenTruong;
    }   
    // String dihoc;//Mang động từ lên là đi học thì không đúng 

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public String getMsv() {
        return Msv;
    }

    public void setMsv(String Msv) {
        this.Msv = Msv;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }

    public String getNghanhhoc() {
        return nghanhhoc;
    }

    public void setNghanhhoc(String nghanhhoc) {
        this.nghanhhoc = nghanhhoc;
    }

    public String getKyhochientai() {
        return kyhochientai;
    }

    public void setKyhochientai(String kyhochientai) {
        this.kyhochientai = kyhochientai;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    //hành vi của sinh viên
    //Phương thức của class SinhVien
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập Họ tên: ");

    }

    //Hàm không trả về kết quả chính là hàm void    
    void Output() {
        System.out.println("Đây là hàm output dùng để dữ liệu Sinh viên ra màn hình");
    }

    //Hàm không trả về và yêu cầu khi gọi hàm sẽ phải truyền tham số tương ứng với kiểu dữ liệu
    void Kiemtranghihoc(int sobuoinghi) {
        if (sobuoinghi > 4) {
            System.out.println("Cấm thi");
        } else {
            System.out.println("Đi học bình thường");
        }
    }

    //hàm trả về sẽ phải sử dụng lệnh return  và phải trả về đúng với kiểu dữ liệu của hàm
    //Param có thể có hoặc không
    int Travenamhientai() {
        return 2020;
    }

    int Tinhsotuoisv(int namsinh) {
        int temptuoi;
        return temptuoi = 2020 - namsinh;
//      return 8.6;//Lỗi vì hàm int không thể trả về kiểu double
//        return "Dung";//Lỗi vì hàm int không thể trả về kiểu string;
//        return 0;

    }

    double TinhdiemTBSV(double diemjava1, double diemhtml, double diemC) {
        double tempdiem;
        tempdiem = (diemjava1 + diemhtml + diemC) / 3;
        return tempdiem;
    }

    public boolean CheckNghiHoc(int sobuoinghi) {
        if (sobuoinghi > 4) {
            return true;
        } else {
            return false;
        }

    }

    //Có những kiểu dữ liệu nào thì hàm trả về có đủ những kiểu dữ liệu đó
    //Hàm có param truyền vào với nhiều kiểu dữ liệu khác nhau
    public void InthongtinSV(String tensv, String malopsv, int tuoisv, double diemsv, boolean tinhtrang) {
        if (tinhtrang) {
            System.out.println("Chúc mừng bạn " + tensv + " " + malopsv + " " + tuoisv + " " + diemsv);
            System.out.println("Vì bạn bị không bị cấm thi");
        } else {
            System.out.println("Chia buồn bạn " + tensv + " " + malopsv + " " + tuoisv + " " + diemsv);
            System.out.println("Vì bạn nghỉ quá số buổi");
        }

    }

    void InTenVaTinhTuoiCuaSV() {
        System.out.println("Chào bạn tôi sẽ in cho bạn thông tin của bạn");
    }

    void InTenVaTinhTuoiCuaSV(String ten, int namsinh) {
        System.out.println("Chào bạn: " + ten + " Số tuổi của bạn là: " + (2020 - namsinh));
    }

    void InTenVaTinhTuoiCuaSV(String ten, int namsinh, double diem) {
        System.out.println("Chào bạn: " + ten + " Số tuổi của bạn là: " + (2020 - namsinh) + "Điểm số là: " + diem);
    }

    //Hàm khởi tạo Contrustor
    //Sử dụng phím tắt ALT + INSERT để gọi hàm khởi tạo
    //Cả cụm hàm phía dưới được gọi là hàm khởi tạo có tham số truyền vào
    // //This chỉ cần nhớ là nó thuộc class và đại diện để gọi đến thuộc tính được đặt trong class
    public SinhVien(String HoVaTen, String Msv, String Tuoi, String diem, String nghanhhoc, String kyhochientai, int namsinh) {
        this.HoVaTen = HoVaTen;
        this.Msv = Msv;
        this.Tuoi = Tuoi;
        this.diem = diem;
        this.nghanhhoc = nghanhhoc;
        this.kyhochientai = kyhochientai;
        this.namsinh = namsinh;
    }

    public SinhVien() {
    }

}

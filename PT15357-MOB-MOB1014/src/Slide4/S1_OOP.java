/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide4;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S1_OOP {

    public static void main(String[] args) {
//        SinhVien sv = new SinhVien("Nguyen Anh Dung", "Ph00532", "32", "5.0", "UDPM", "6");
//        System.out.println("Chào bạn: " + sv.hovaten + "  " + sv.msv + "  " + sv.nghanhhoc);

        SinhVien sv2 = new SinhVien();
//        sv2.setHovaten("Dang Quang Huy"); 
        sv2.setMsv("PH00555");         
        System.out.println("Chào bạn: " + sv2.getTenTruong()+ "  " + sv2.getMsv());

    }

    void Bai() {
        //Người lập trình tự đặt biến là tuổi
        //Lập trình viên DUY sẽ đặt: Year 
        //Lập trình viên Kien sẽ đặt: Old 
        //Lập trình viên Dũng sẽ đặt: Tuoi
        //Lập trình viên Long sẽ đặt: YearOld
        //Mỗi 1 người sẽ có 1 cách đặt khác nhau
        //Gọi 1 class để sử dụng
//        SinhVien sv = new SinhVien();   
//        //Hàm void output không trả về
//        sv.Output();
//        int sobuoinghi = 4;
//        //Hàm void kiemtranghihoc không trả về nhưng có tham số truyền vào
//        //Tham số truyền vào phải đúng với kiểu dữ liệu bên hàm yêu cầu
//        sv.Kiemtranghihoc(sobuoinghi);
//        //Hàm trả về
//        System.out.println("Số tuổi của bạn là: " + sv.Tinhsotuoisv(2001));
//        //sv.TinhdiemTBSV(5.5, 6.3, 9.0) là gì??? No là 1 hàm nhưng hàm này là hàm trả về và giá trị được trả về ở đây là điểm của sinh viên
//        System.out.println("Diểm của trung bình của bạn DUY là: " + sv.TinhdiemTBSV(5.5, 6.3, 9.0));
//        if (sv.CheckNghiHoc(4)) {
//            System.out.println("Cấm thi");
//        }else{
//            System.out.println("Học bình thường");
//        }
//        System.out.println(sv.Travenamhientai());
//        sv.InthongtinSV("Pham Cong Huy", "PT000089", 19,8.9, false);
//        sv.InTenVaTinhTuoiCuaSV();
//        sv.InTenVaTinhTuoiCuaSV("Pham Cong Huy", 2001);
//        sv.InTenVaTinhTuoiCuaSV("Pham Cong Huy", 2001, 8.9);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuaLAB_JAVA1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */
public class ChucNangQuanLySinhVien {

    ArrayList<Student> arrListStudent = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);

    void themSinhVien() {
        System.out.println("Bạn muốn nhập bao nhiêu sinh viên:");
        int input = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < input; i++) {
            System.out.println("Mời bạn nhập tên sinh sinh viên " + i);
            String ten = sc.nextLine();
            System.out.println("Mời bạn nhập môn sinh sinh viên " + i);
            String mon = sc.nextLine();
            System.out.println("Mời bạn nhập tuôi sinh sinh viên " + i);
            int tuoi = sc.nextInt();
            sc.nextLine();
            Student st = new Student(ten, mon, tuoi);
            arrListStudent.add(st);
        }
    }

    void sapXepSinhVien() {
        //        Collections.sort(arrListStudent, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return -o1.getTenSV().compareTo(o2.getTenSV());
//                if (o1.getTuoiSV() > o2.getTuoiSV()) {
//                    return -1;
//                } else if (o1.getTuoiSV() < o2.getTuoiSV()) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
        Collections.sort(arrListStudent);
    }

    void xoaSinhVienTheoTen() {
        Student st1 = new Student("Nguyen Anh Dung", "JAVA", 19);
        Student st2 = new Student("HOANG QUOC VIET", "JAVA", 12);
        Student st3 = new Student("NGUYEN KHANH TOAN", "JAVA", 13);
        Student st4 = new Student("TO NGOC VAN", "JAVA", 14);
        arrListStudent.add(st1);
        arrListStudent.add(st2);
        arrListStudent.add(st3);
        arrListStudent.add(st4);
//        Xóa theo tên Sinh viên
        System.out.println("Tìm và xóa họ tên");
        System.out.println("Mời bạn nhập vào tên người muốn xóa");
        String nguoiMuonXoa = sc.nextLine();
//        ArrayList<Student> arrListRemove = new ArrayList<Student>();
//        for (Student student : arrListStudent) {
//            if (student.getTenSV().equals(tensinhcanxoa)) {
//                arrListRemove.add(student);
//                break;
//            }
//        }
//        arrListStudent.removeAll(arrListRemove);
        //Sử dụng dóa bẳng thằng Iterator
        for (int i = 0; i < arrListStudent.size(); i++) {
            if (arrListStudent.get(i).getTenSV().equals(nguoiMuonXoa)) {
                arrListStudent.remove(i);
                break;
            }
        }
    }

    void suaSinhVienTheoTen() {

    }

    void LAB5() {

        Student st1 = new Student("Nguyen Anh Dung", "JAVA", 19);
        Student st2 = new Student("HOANG QUOC VIET", "JAVA", 12);
        Student st3 = new Student("NGUYEN KHANH TOAN", "JAVA", 13);
        Student st4 = new Student("TO NGOC VAN", "JAVA", 14);
        arrListStudent.add(st1);
        arrListStudent.add(st2);
        arrListStudent.add(st3);
        arrListStudent.add(st4);        
        System.out.println("Danh sách sinh viên là :");
        for (Student student : arrListStudent) {
            System.out.println(student.getTenSV() + " " + student.getMonSV() + " " + student.getTuoiSV());
        }

        //Sử tên sinh viên        
        System.out.println("Mời bạn nhập vào tên người muốn sửa");
        String nguoiMuonSua = sc.nextLine();
        for (int i = 0; i < arrListStudent.size(); i++) {
            if (arrListStudent.get(i).getTenSV().equals(nguoiMuonSua)) {
                System.out.println("Mời bạn sửa tên của " + nguoiMuonSua);
                arrListStudent.get(i).setTenSV(sc.nextLine());
                System.out.println("Mời bạn sửa mon của " + nguoiMuonSua);
                arrListStudent.get(i).setMonSV(sc.nextLine());
                System.out.println("Mời bạn sửa tuổi của " + nguoiMuonSua);
                arrListStudent.get(i).setTuoiSV(sc.nextInt());
                System.out.println("Chúc mừng bạnd dã sửa thông tin của " + nguoiMuonSua);
            }
        }

        System.out.println("Danh sách sinh viên là :");
        for (Student student : arrListStudent) {
            System.out.println(student.getTenSV() + " " + student.getMonSV() + " " + student.getTuoiSV());
        }

    }

}

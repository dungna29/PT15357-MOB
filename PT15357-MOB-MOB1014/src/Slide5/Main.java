/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Main {

    public static void main(String[] args) {
        //  ArrayObject();
//        JavaList();
//        Arraylist();

        System.out.println("Các câu lệnh nâng cao của ArrayList");
        ArrayList<String> arrListString1 = new ArrayList<String>();
        arrListString1.add("A");
        arrListString1.add("B");
        ArrayList<String> arrListString2 = new ArrayList<String>();
        arrListString2.add("A");
        arrListString2.add("D");
        for (Object object : arrListString1) {
            System.out.println(object);
        }
        for (Object object : arrListString2) {
            System.out.println(object);
        }
        System.out.println("----RetainAll GIAO CỦA 2 TẬP HƠP LIST 1 và LIST 2");
        //System.out.println(arrListString1.retainAll(arrListString2));//retainAll Giao của 2 tập hợp
        arrListString1.retainAll(arrListString2);
        for (Object object : arrListString1) {
            System.out.println(object);
        }

    }

    static void ArrayObject() {
        //int[] arrmang = new int[5] //Khai báo mảng theo kiểu dữ liệu cơ bản
        Student st = new Student("Duy", "JAVA1", 19);
        Student st2 = new Student("Kien", "Web", 19);
        Student st3 = new Student("Duyen", "JAVA2", 19);
        //System.out.println(st.getTenSV() + st.getMonSV());
        // st là gì? st đại diện cho 1 người hoặc 1 đối tượng
        //Mảng đối tượng và đối tượng ở đây là Student
        //Ở đây kiểu dữ liệu sẽ là kiểu đối tượng
        Student[] arrStudent = new Student[3];
        arrStudent[0] = new Student();
        arrStudent[0].setTenSV("Duy");
        arrStudent[0].setMonSV("JAVA1");
        arrStudent[0].setTuoiSV(19);
        arrStudent[1] = new Student("Kien", "WEB", 19);
        arrStudent[2] = new Student("Duyen", "JAVA2", 19);
//        for (Student x : arrStudent) {
//            System.out.println(x.getTenSV() + x.getMonSV() + x.getTuoiSV());
//        }
        for (int i = 0; i < arrStudent.length; i++) {
            System.out.println(arrStudent[i].getTenSV() + arrStudent[i].getMonSV() + arrStudent[i].getTuoiSV());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn hãy chọn người muốn xóa:");
        String input = sc.nextLine().toLowerCase();
        boolean temp = true;
        for (Student x : arrStudent) {
            if (x.getTenSV().toLowerCase().equals(input)) {
//                System.out.println("bạn muốn sửa thành gì?");
//                x.setTenSV(sc.nextLine());
                x.setTenSV("");
                x.setMonSV("");
                x.setTuoiSV(0);
//                System.out.println("Tôi đã thấy bạn " + x.getTenSV());
                temp = false;
            }

        }
        if (temp) {
            System.out.println("Không tìm thấy người bạn cần tìm kiếm");
        }
        for (int i = 0; i < arrStudent.length; i++) {
            System.out.println(arrStudent[i].getTenSV() + arrStudent[i].getMonSV() + arrStudent[i].getTuoiSV());
        }
    }

    static void JavaList() {
        //List không định kiểu    
        List lstKhongDinhKieu = new ArrayList();
        lstKhongDinhKieu.add("Kien");
        lstKhongDinhKieu.add(2020);
        lstKhongDinhKieu.add("Duy");
        lstKhongDinhKieu.add(9.5);
        lstKhongDinhKieu.add(true);
        //Khi add thêm số nguyên thủy thì tự động chuyển sang đối tượng kiểu wrapper Double Interge
        //Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
//        double temp = lstKhongDinhKieu.get(3);(Lỗi)
//        double temp = (double) lstKhongDinhKieu.get(3);
        Double temp = (Double) lstKhongDinhKieu.get(3);
        //System.out.println(lstKhongDinhKieu.get(1));
//        for (Object object : lstKhongDinhKieu) {
//            System.out.println(object);
//        }

        //List có định kiểu    
        List<Double> lstDouble = new ArrayList<Double>();
        lstDouble.add(8.5);
        lstDouble.add(8.9);
        lstDouble.add(10.0);
//        lstDouble.add("Dung");//Ko thể add vào List vì không cùng  kiểu dữ liệu
        //double temp2 = lstDouble.get(0);

        //List đối tượng
        Student st1 = new Student("Duy", "JAVA1", 19);
        Student st2 = new Student("Kien", "Web", 19);
        Student st3 = new Student("Duyen", "JAVA2", 19);
        Student st4 = new Student("Thang", "JAVA2", 19);
        List<Student> lstStudent1 = new ArrayList<Student>();
        lstStudent1.add(st1);
        lstStudent1.add(st2);
        lstStudent1.add(st3);
        //lstStudent1.add(0, st4);Add phần tử vào index theo yêu cầu
        List<Student> lstStudent2 = new ArrayList<Student>();
        Student lst2 = new Student("Toan", "JAVA1", 19);
        Student lst21 = new Student("Toan2", "JAVA1", 19);
        lstStudent2.add(lst2);
        lstStudent2.add(lst21);
        //Add list số 1 + với list số 2 bằng hàm addAll
        lstStudent1.addAll(lstStudent2);
        //In ra 1 phần tử trong list theo index
        //System.out.println(lstStudent.get(0).getTenSV() + lstStudent.get(0).getMonSV());
        //in ra danh sách của list
//        for (Student x : lstStudent) {
//            System.out.println(x.getTenSV() + x.getMonSV() + x.getTuoiSV());
//        }
        //lstStudent.size() chỉ ra độ dài của List       
        for (int i = 0; i < lstStudent1.size(); i++) {
            System.out.println(lstStudent1.get(i).getTenSV() + lstStudent1.get(i).getMonSV());
        }
        System.out.println("------------------");
        //Xóa phần tử trong mảng có 2 kiểu remove 1 là remove theo index 2 là remove theo object
        lstStudent1.remove(0);//Xóa theo index
        //Student stremove = new Student("Kien", "Web", 19);
        lstStudent1.remove(st2);//Xóa theo object st2 chính là Student st2 = new Student("Kien", "Web", 19);
        for (int i = 0; i < lstStudent1.size(); i++) {
            System.out.println(lstStudent1.get(i).getTenSV() + lstStudent1.get(i).getMonSV());
        }

        //Duyệt các phần tử trong List (In ra màn hình)
        System.out.println("------------Duyệt các phần tử-------");
        ListIterator<Student> litr = lstStudent1.listIterator();
        System.out.println("Duyệt các phần từ từ đầu List");
        while (litr.hasNext()) {
            System.out.println("\t" + litr.next().getTenSV());
        }
        System.out.println("Duyệt các phần từ từ cuối List");
        while (litr.hasPrevious()) {
            System.out.println("\t" + litr.previous().getTenSV());
        }

        System.out.println("------Convert mảng về List------");
        //Convert mảng về List
        String[] arrName = {"Dung", "Duy", "Kien"};
        List<String> lstName = Arrays.asList(arrName);//Doạn này dùng để convert từ mảng về List
        List<String> lstStringConvert = new ArrayList<String>();
        lstStringConvert.add("Thang");
        lstStringConvert.addAll(lstName);
        for (int i = 0; i < lstStringConvert.size(); i++) {
            System.out.println(lstStringConvert.get(i));
        }
        //Để sắp xếp được List các bạn nhớ lại thằng Arrays để chữ ý s
        Collections.sort(lstStringConvert);
        System.out.println("Sau khi sắp xếp");
        for (int i = 0; i < lstStringConvert.size(); i++) {
            System.out.println(lstStringConvert.get(i));
        }

        //Kiểm tra xem list có rỗng hay không
        List<Student> lstnull = new ArrayList<Student>();
        //        lstnull.add(st4);
//        if (lstnull.size() > 0) {
//            for (int i = 0; i < lstnull.size(); i++) {
//                System.out.println(lstnull.get(i).getTenSV());
//            }
//        }else{
//            System.out.println("Hiện tại danh sách cần in đang không có gì");
//        }
        if (lstnull.isEmpty()) {
            System.out.println("Hiện tại danh sách cần in đang không có gì");
        } else {
            for (int i = 0; i < lstnull.size(); i++) {
                System.out.println(lstnull.get(i).getTenSV());
            }
        }

    }

    static void Arraylist() {
        //Arraylist không định kiểu
        ArrayList arrListlKhongDinhKieu = new ArrayList();
        arrListlKhongDinhKieu.add("Cường");
        arrListlKhongDinhKieu.add(true);
        arrListlKhongDinhKieu.add(1);
        arrListlKhongDinhKieu.add(2.5);
        //Khi add thêm số nguyên thủy thì tự động chuyển sang đối tượng kiểu wrapper Double Interge
        //Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
//       double temp = arrListlKhongDinhKieu.get(3);(Lỗi)
//        double temp = (double) arrListlKhongDinhKieu.get(3);
        Double temp = (Double) arrListlKhongDinhKieu.get(3);
        //System.out.println(lstKhongDinhKieu.get(1));

        //ArrayList có định kiểu ở đây là kiểu String
        ArrayList<String> arrListString = new ArrayList<String>();
        arrListString.add("Cường");
        arrListString.add("Dũng");//Chèn phần tử vào cuối list khi dùng add
        arrListString.add(0, "Duy");// Chèn phần tử vào List theo vị trí chỉ định
        //boolean remove(Object) dùng để tìm và xóa phần tử trong ArrayList
        arrListString.remove("Dũng");
        //Object remove(int index) Xóa phần tử theo vị trí chỉ định trong ArrayList
        arrListString.remove(0);
        //void clear() Xóa toán bộ phần tử trong ArrayList
        //arrListString.clear(); 
        arrListString.add("Kien");
        //Set object // chỉ áp dụng với thằng kiểu dữ liệu nguyên thủy
        arrListString.set(1, "Duyen");
        //Hàm get dùng để lấy phần tử ra theo index
        System.out.println(arrListString.get(0));
        //Hàm size để đo kích thước của mảng
        System.out.println(arrListString.size());
        //Contains dùng để kiểm tra tồn tại của phần tử có trong mảng hay không
        if (arrListString.contains("Duyen")) {
            System.out.println("Có bạn Duyên trong lớp MOB");
        } else {
            System.out.println("Không tìm thấy bạn đó trong lớp");
        }
        //Tìm vị trí của phần tử trong Arraylist dùng indexOf
        System.out.println(arrListString.indexOf("Duyen"));

        //isEmpty là kiểm tra xem mảng có rỗng hay không
        if (!arrListString.isEmpty()) {
            for (Object object : arrListString) {
                System.out.println(object);
            }
        } else {
            System.out.println("Arraylist không chưa phần tử");
        }

        //Các câu lệnh nâng cao của ArrayList
        System.out.println("Các câu lệnh nâng cao của ArrayList");
        ArrayList<String> arrListString1 = new ArrayList<String>();
        arrListString1.add("A");
        arrListString1.add("B");
        ArrayList<String> arrListString2 = new ArrayList<String>();
        //arrListString2.add("Cường");
        arrListString2.add("A");
        arrListString2.add("D");
        //arrListString1.addAll(arrListString2);//addAll dùng để hợp 2 danh sách lại
        //arrListString1.removeAll(arrListString2);//removeAll List2 là xóa danh sách những người nằm trong list 2 chứ ko xóa List1
        for (Object object : arrListString1) {
            System.out.println(object);
        }
        System.out.println("----RetainAll");
        //System.out.println(arrListString1.retainAll(arrListString2));//retainAll Giao của 2 tập hợp
        arrListString1.retainAll(arrListString2);
        for (Object object : arrListString1) {
            System.out.println(object);
        }
        System.out.println(arrListString1.containsAll(arrListString2));//Kiểm tra sự tồn tại của list 2 có đang nằm trong list 1 hay không

//
//        Student st1 = new Student("Duy", "JAVA1", 19);
//        Student st2 = new Student("Kien", "Web", 19);
//        Student st3 = new Student("Duyen", "JAVA2", 19);
//        Student st4 = new Student("Thang", "JAVA2", 19);
//        ArrayList<Student> arrayListStudent = new ArrayList<Student>();
//        arrayListStudent.add(st1);
//        arrayListStudent.remove(0);
//        arrayListStudent.add(st1);//Có thể add nhiều đối tượng giống nhau
//        arrayListStudent.add(st1);
//        arrayListStudent.add(st2);
//        arrayListStudent.add(1, st3);       
//       
//        for (Student student : arrayListStudent) {
//            System.out.println(student.getTenSV() + student.getMonSV());
//        }
//        System.out.println(arrayListStudent.indexOf(st2));
//        arrayListStudent.remove(arrayListStudent.indexOf(st2));
    }
}

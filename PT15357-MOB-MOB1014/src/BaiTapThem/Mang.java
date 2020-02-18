/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapThem;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Nguyen Anh Dung
 */
public class Mang {

    public static void main(String[] args) {
        // kiểu dữ liệu của mảng [] tên mảng = { value,value};
//        int input;
//        String[] arrName = {"Quân", "Duyên", "Duy"};
//        int arrYear[] = {1989, 2020, 2019};
//        double arrDiem[]; //Cách khai báo chưa khởi tạo
//        arrDiem = new double[3];
//        arrDiem[0] = 8.25;
//        arrDiem[1] = 10.25;
//        arrDiem[2] = 9.25;
//        for (String x : arrName) {
//            System.out.print(x + " ");
//        }
//        System.out.println("Bạn muốn nhập vào bao nhieu giá trị? ");
//        Scanner sc = new Scanner(System.in);
//        input = sc.nextInt();//Hiện tượn bị trôi lệnh
//        sc.nextLine();
//        String[] arrInput = new String[input];
//        for (int i = 0; i < arrInput.length; i++) {
//            System.out.println("Mời bạn nhập vào phần tử thứ " + (i + 1));
//            arrInput[i] = sc.nextLine();
//        }
//        System.out.println("Các giá trị bạn vừa nhập vào là :");
//        for (String x : arrInput) {
//            System.out.print(x + " ");
//        }
//
//      // Sử dụng vòng lặp for để in ra các phần tử trong mảng.
//        for (int index = 0; index < arrInput.length; index++) {
//            System.out.println("Element " + index + " = " + arrInput[index]);
//        }
        PatternMatcher();
    }

    static void Bai1() {
        String arrInput[];
        int sizeArr;
        String inputValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng phần tử bạn muốn ghi vào: ");
        sizeArr = sc.nextInt();//Người ta truyền xuống kiểu số nguyên
        sc.nextLine();//Xử lý trôi lệnh vì nextInt ở trên
        arrInput = new String[sizeArr];//Truyền giá trị người dùng muốn để khởi tạo mảng
        for (int i = 0; i < arrInput.length; i++) {
            System.out.println("Mời bạn nhập vào lần thư " + (i + 1));
            inputValue = sc.nextLine();
            //Cần phải đưa các giá trị người dùng truyền vào vào trong mảng
            arrInput[i] = inputValue;//Gán giá trị vào mảng bắt đàu từ index 0
        }
        System.out.print("Các phần tử bạn vừa nhập vào là: ");
        //In các phần tử trong mảng ra màn hình
//        for (String x : arrInput) { //x đại diện cho giá trị cho 1 phần tử trong mảng
//            System.out.print(x + " | ");           
//        }
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print(arrInput[i] + " | ");
        }
        System.out.println("");

        //Sử dụng Pattern để tách phần tử trong mảng theo quy tắc
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        System.out.println("Dưới đây là các phần tử kiểu tên hoặc chữ cái");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = pattern.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
        System.out.println("");
        Pattern patternKieuSo = Pattern.compile("\\d+");
        System.out.println("Dưới đây là các phần tử kiểu số ");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = patternKieuSo.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
        System.out.println("");
        Pattern patternKieuKyTu = Pattern.compile("\\W+");
        System.out.println("Dưới đây là các phần tử kiểu ký tự ");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = patternKieuKyTu.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }

        Arrays.sort(arrInput);

        Pattern pattern1 = Pattern.compile("[a-zA-Z]+");

        System.out.println("Dưới đây là các phần tử kiểu tên hoặc chữ cái");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = pattern1.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
        System.out.println("");
        Pattern patternKieuSo1 = Pattern.compile("\\d+");
        System.out.println("Dưới đây là các phần tử kiểu số ");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = patternKieuSo1.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
        System.out.println("");
        Pattern patternKieuKyTu1 = Pattern.compile("\\W+");
        System.out.println("Dưới đây là các phần tử kiểu ký tự ");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = patternKieuKyTu1.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
    }

    static void PatternMatcher() {
        //Viết 1 chương trình kiểm tra người dùng nhập vào là số hay chữ hay là ký tự
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập bất kì vào : ");
        String input = sc.nextLine();//Người dùng truyền vào chương trình
//        String temInput = input.replace(".", "@");
//        String temInput = input.replaceAll("\\s", "");//Xử lý khoảng trống //Gọi là xử lý chuỗi
//        System.out.println(temInput.charAt(1));
       
        Pattern patternTapHopSo = Pattern.compile("[0-9]+");//Khai báo ra tập hợp các ký tự, số hoặc chữ cái mà người lập trình cần [0-9] \\d
        Pattern patternTapHopKyTu = Pattern.compile("[^\\w]+");//Tập hợp kiểu ký tự [^\w] hoặc \\W
        Pattern patternTapHopChuCai = Pattern.compile("[a-zA-Z]+");//Tập hợp chữ cái (Cách viết tường minh không có dấu \\)
        Matcher matcherKiemTraKieSo = patternTapHopSo.matcher(input);//Gọi đến tập hợp số và so sánh với cái người dùng truyền vào
        Matcher matcherKiemTraKyTu = patternTapHopKyTu.matcher(input);
        Matcher matcherKiemTraChu = patternTapHopChuCai.matcher(input);        
        
        if (matcherKiemTraKieSo.matches()) {
            System.out.println("Kiểu dữ liệu bạn vừa truyền vào là kiểu số");
        } else if (matcherKiemTraKyTu.matches()) {
            System.out.println("Kiểu dữ liệu bạn vừa truyền vào là kiểu Ký tự");
        } else if (matcherKiemTraChu.matches()) {
            System.out.println("Kiểu dữ liệu bạn vừa truyền vào là kiểu chữ");
        } else {
            System.out.println("Không xác định được ký tự bạn đưa vào");
        }
        

    }

}

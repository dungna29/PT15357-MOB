/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide3;

import java.util.Arrays;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_ViduMang {

    public static void main(String[] args) {
        // Yêu cầu các bạn tạo 1 mảng số nguyên  36 10 18 19 20 21 9
        int arrA[] = {36, 10, 18, 20, 21, 9};//Tạo mảng khởi tạo giá trị  trong nó

        //Cách lấy một phần tử trong mảng
        //In ra một phần tử trong mảng bằng index
        // arrA[1] Lấy giá trị theo index của mảng trên ở đây giá trị là 1 thì sẽ in ra số 10
        //System.out.println("Giá trị index tại vị trí 1 là: " + arrA[1] );
        //Cách Lấy nhiều phần tử trong mảng sử dụng vòng lặp FOR hoặc FOREACH
        for (int i = 0; i < arrA.length; i++) {
            System.out.println("Các phần tử trong mảng là: " + arrA[i]);
        }

        for (int x : arrA) {
            System.out.println("Các phần tử trong mảng là: " + x);
        }
        System.out.println("Tìm kiếm phần tử trong mảng mà không cần dùng binarysearch");
        //Tìm kiếm trong mảng sử dụng vòng lặp
        // yêu cầu tìm số 21 trong mảng và in ra vị trí và giá trị của nó
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] == 36) {
                System.out.println("Giá trị mà bạn cần tìm:" + arrA[i] + "Tại vị trí số: " + i);
            }
        }
        System.out.println("____________________________________________");

        //Sắp xếp mảng
        Arrays.sort(arrA);//Hàm giúp sắp xếp mảng trong Arrays nhanh
        for (int x : arrA) {
            System.out.println("Các phần tử trong mảng là: " + x);
        }
        //Tìm kiếm giá trị của phần tử trong mảng
        int indexArr = Arrays.binarySearch(arrA, 21);//Phải sắp xếp mảng mới được sử dụng binarySearch

        System.out.println("Vị trí bạn cần tìm của giá trị truyền vào là: " + indexArr);

        System.out.println("Giá trị mà bạn cần tìm:" + arrA[indexArr] + "Tại vị trí số: " + indexArr);

    }

}

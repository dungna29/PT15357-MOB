/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide3;
import Slide4.A;

/**
 *
 * @author Nguyen Anh Dung
 */
public class C {

    void TempFunction() {
        A a = new A();
        a.a = 1;
//        a.b = 2;//Không thể truy cập bên ngoài A
//        a.c = 3;//Bạn không thể truy cập c ở bên ngoài packages
        //c ở đây khai báo bình thường
//        a.d = 4;// không thể sử dụng biến d ở đây
        //Vì biến d khi báo sử dụng private

    }
}

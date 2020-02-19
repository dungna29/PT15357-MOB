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
public class D extends A {

    void TempFunction() {
        A a = new A();
        a.a = 1;
//        a.b = 2;//Trong trường hợp này muốn sử dụng được b thì phải kế thừa lớp A
//        a.c = 3;
//        a.d = 4;// không thể sử dụng biến d ở đây
        //Vì biến d khi báo sử dụng private

    }

}

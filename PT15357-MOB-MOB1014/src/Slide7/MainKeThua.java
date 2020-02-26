/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide7;

/**
 *
 * @author Nguyen Anh Dung
 */
public class MainKeThua {

    public static void main(String[] args) {

//        Cho dv = new Cho("Chó Ta", "Mực", "Đen");//
        Cho cho = new Cho();
        Meo meo = new Meo();
        ChoTay ct = new ChoTay();

        cho.setTenDV("Mực");//Cái này của lớp cha.3
        cho.setGiongCho("Chó Ta");//Cái này của lớp cha
        cho.setMausacDV("Đen");
        System.out.println(cho.getGiongCho() + " " + cho.getTenDV() + " " + cho.getMausacDV());
        DongVat dv = new Cho();
        //dv.dongVatKeu();
        cho.dongVatKeu();// hàm này đều của lớp cha
        meo.dongVatKeu();// hàm này đều của lớp cha
        ct.dongVatKeu();
    }
}

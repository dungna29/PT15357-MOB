/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide8;

/**
 *
 * @author Nguyen Anh Dung
 */
public class BaiToanDemSo {

    static int count = 0;

    public BaiToanDemSo() {
    }

    public void TangSoHS() {
        count++;
        this.print();
    }

    public void print() {
        System.out.println("count = " + count);
    }

    public static void main(String[] args) {
        BaiToanDemSo sv1 = new BaiToanDemSo();
        sv1.TangSoHS();
        BaiToanDemSo sv2 = new BaiToanDemSo();
        sv2.TangSoHS();
        BaiToanDemSo sv3 = new BaiToanDemSo();
        sv3.TangSoHS();
    }

}

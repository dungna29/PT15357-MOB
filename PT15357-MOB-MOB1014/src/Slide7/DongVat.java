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
public class DongVat {

    private String tenDV;
    private String mausacDV;
    String quocgiaDV = "Ý";

    public String getQuocgiaDV() {
        return quocgiaDV;
    }
    

    public DongVat() {
    }

    public DongVat(String tenDV, String mausacDV) {
        this.tenDV = tenDV;
        this.mausacDV = mausacDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getMausacDV() {
        return mausacDV;
    }

    public void setMausacDV(String mausacDV) {
        this.mausacDV = mausacDV;
    }

    void dongVatKeu() {
        System.out.println("Động vật kêu");
    }

}

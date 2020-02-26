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
public class Meo extends DongVat{
     private String giongMeo;
     private String quocgiaDV = "Thái Nguyên";

    public Meo() {
    }
    public Meo(String giongMeo, String tenDV, String mausacDV) {
        super(tenDV, mausacDV);
        this.giongMeo = giongMeo;
    }

    public String getGiongMeo() {
        return giongMeo;
    }

    public void setGiongMeo(String giongMeo) {
        this.giongMeo = giongMeo;
    }

    @Override
    void dongVatKeu() {
        System.out.println("Meo Meo");
    }
    
    
    
}

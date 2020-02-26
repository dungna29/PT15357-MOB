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
public class Cho extends DongVat{
    private String giongCho;
   

    public Cho() {
    } 

    public Cho(String giongCho, String tenDV, String mausacDV) {
        super(tenDV, mausacDV);//Gọi đến lớp cha
        this.giongCho = giongCho;
    }

    public String getGiongCho() {
        return giongCho;
    }

    public void setGiongCho(String giongCho) {
        this.giongCho = giongCho;
    }
     String quocgiaDV = "PHÁp";
    @Override
    void dongVatKeu() {
        System.out.println("Gâu Gâu" + super.quocgiaDV);
    }
    
    
//     void choKeu(){
//         System.out.println("Gâu Gâu");
//     }
}

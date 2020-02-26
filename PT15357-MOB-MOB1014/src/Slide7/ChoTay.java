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
public class ChoTay extends Cho {

    private String giongchoTay;

    public ChoTay() {
    }

    public ChoTay(String giongchoTay, String giongCho, String tenDV, String mausacDV) {
        super(giongCho, tenDV, mausacDV);
        this.giongchoTay = giongchoTay;
    }
    private String quocgiaDV = "MỸ";

    @Override
    void dongVatKeu() {
        System.out.println("Tôi là chó tây đây" + super.quocgiaDV);
    }

}

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
public class ChoTayPhiaBac extends ChoTay{
    private String giongchoTayPhiaBac;

    public ChoTayPhiaBac(String giongchoTayPhiaBac, String giongchoTay, String giongCho, String tenDV, String mausacDV) {
        super(giongchoTay, giongCho, tenDV, mausacDV);
        this.giongchoTayPhiaBac = giongchoTayPhiaBac;
    }
    
}

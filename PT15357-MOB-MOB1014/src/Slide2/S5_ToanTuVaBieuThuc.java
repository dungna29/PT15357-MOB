/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

/**
 *
 * @author LegendNguyen
 */
public class S5_ToanTuVaBieuThuc {

    public static void main(String[] args) {
        //Toán tử số học + - * /     ++ --
        //int a = 2;
        //a++;// cộng thêm 1
        //++a;// ++ và trừ trừ khai báo như nhau
        //++a;
        //System.out.println(a);//
        ////      System.out.println(--a);//Trừ đi 1

        //Bài tập
        //Postfix và Prefix
        //int a = 14;
        //int b = 9;
        //a++;
        //--a;
        //System.out.println(++a + b++ - 2);
        //Toán tử so sánh > , < , >=, <=, ==, !=
        //int a = 7;
        //int b = 8;
        //boolean temp = a>b;
        //System.out.println(temp);
        //Toán tử Logic || && !
        int a = 7;
        int b = 8;
        //boolean temp = !(5 > 8) && 9 < 10;
        // System.out.println(temp);
        //<điều kiện> ? <giá trị đúng> : <giá trị sai>
        //boolean temp2 = 5 > 8 ? true : false;
        //System.out.println(temp2);

        //trong database
        String user = "dungna";
        String pass = "1234";

        String user1 = "dungna";
        String pass1 = "12345";
        boolean temp3 = (user == user1) || (pass == pass1) ? true : false;
        System.out.println(temp3);

    }

}

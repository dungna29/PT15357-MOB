/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Postfix_Prefix {

    public static void main(String[] args) {
        int firstVariable = 5, secondVariable = 9, thirdVariable = 3, result;        
        result = ++firstVariable + secondVariable-- - ++thirdVariable;       
        System.out.println("First variable = " + firstVariable);
        System.out.println("Second variable = " + secondVariable);
        System.out.println("Third variable = " + thirdVariable);
        System.out.println("Result variable = " + result);
    }

}

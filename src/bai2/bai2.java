/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author ngoc
 */
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder string = new MyStringBuilder()
                .addString("Cộng 2 số: ")
                .addFloat((float) 4.511)
                .addString(" + ")
                .addFloat((float) 5.546)
                .addString(" = ")
                .addBool(true);
        System.out.println(string.toString());
    }
    
}
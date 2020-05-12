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
public class MyStringBuilder {
    String str;

    public MyStringBuilder() {
        this.str = "";
    }
    
    public MyStringBuilder  addString(String s){
        this.str += s;
        return this;
    } 
    
    public MyStringBuilder addFloat(float f){
        this.str += f;
        return this;
    }
    
    public MyStringBuilder addBool(boolean b){
        this.str += b;
        return this;
    }

    @Override
    public String toString() {
        return "Chuỗi được xây dựng: " + str ;
    }
    
}

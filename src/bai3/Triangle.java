/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author ngoc
 */
public class Triangle extends Shape{

    private static Triangle instance;
    
    protected Triangle() {
    }
    
    public static Triangle Instance(){
        if(instance == null){
            instance = new Triangle();
        }
        return instance;
    }
    @Override
    public String draw() {
        return this.getBrush() + this.getPaper() + this.getFrame() + " hình tam giác";
    }
    
}

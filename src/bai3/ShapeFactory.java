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
public class ShapeFactory{
    public Shape createShape(ShapeType shapeType){
        switch(shapeType){
            case Rectangle: return Rectangle.Instance();
            case Triangle: return Triangle.Instance();
            case Circle: return Circle.Instance();
        }
        return null;
    } 

}
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
public abstract class Shape {
  
    private String  brush;
    private String  paper;
    private String  frame;

    public Shape() {
    }
    
    public abstract String draw();

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
    
    
}

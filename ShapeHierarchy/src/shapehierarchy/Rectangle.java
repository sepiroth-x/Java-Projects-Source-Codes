/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy;

/**
 *
 * @author sepirothx
 */
public class Rectangle extends Shape{
    
    float length;
    float width;
    
    
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
 

    }
    
    public float getLength() {
        return this.length;
        
    }
    
    public float getWidth() {
        return this.width;
    }
    
}

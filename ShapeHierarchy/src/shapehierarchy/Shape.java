/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapehierarchy;

/**
 *
 * @author sepirothx
 */
public class Shape {
    
    
    
    public void getArea() {
        
   System.out.println("Function coming from Shape");        
        
    }
    
    public void getArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle having: " + radius + " radius is: " + area);
        
        
    }
    
    public void getArea(int length, int width) {
        double area = length * width;
        System.out.println("Area of Rectangle is: " + area);
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapehierarchy;

/**
 *Description: The source code you find here shows inheritance, constructor, method & method overloading.
 * @author sepirothx | Richard Cebel Cupal, LPT
 * License: GNU Public License
 */
public class ShapeHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This project shows inheritance, constructor, method and method overloading
        
        Circle circle1 = new Circle(3);
        Rectangle rectangle1 = new Rectangle(5,3);
        
        circle1.getArea(); //calling method no param from Shape class
        rectangle1.getArea(); //calling method no param from Shape class
        
        circle1.getArea(3); //calling method with one (1) param from Shape class
        rectangle1.getArea(5,3); //calling method with two  (2) param from Shape class
        
        //this will get the radius of the circle object
        System.out.println("Radius of Circle is: "+circle1.getRadius()); 
        
        //this will get the length and width of the rectangle object
        System.out.println("Rectangle Length is: " + rectangle1.getLength());
        System.out.println("Rectangle Width is: " + rectangle1.getWidth());
    }
    
}

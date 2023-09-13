/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myproject;
import java.util.Scanner;
/**
 *
 * @author sepirothx
 */
public class MyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter a number: ");
        
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        
        if(a < 50) {
            int counter = 0;
            
            System.out.println("Number is less than 50");
            
            while(a < 50) {
                counter++;
                a++;
            }
            
            System.out.println("Loops:"+counter);
            
            
            
        }
        
    }
    
}

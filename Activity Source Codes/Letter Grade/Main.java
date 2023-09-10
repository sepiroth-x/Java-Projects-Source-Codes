 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.Scanner;

/**
 *
 * @author sepirothx
 * Description: Source Code for Java Language Students
 * License: Open-Source
 */
public class Main {

    public static void main(String[]args) {
            //90-100: A
            //80-89: B
            //70-79: C
            //60-69: D
            //0-59: F
            int examScore;
            Scanner console = new Scanner(System.in);

            System.out.println("Enter the score:");
            examScore = console.nextInt();


            if((examScore > 90)&&(examScore <100)) {

                System.out.printf("Score is: %d and Grade is: A\n",examScore);
            } else if((examScore > 80)&&(examScore <89)) {
                System.out.printf("Score is: %d and Grade is: B\n",examScore);
            } else if((examScore > 70)&&(examScore <79)) {
                System.out.printf("Score is: %d and Grade is: C\n",examScore);
            } else if((examScore > 60)&&(examScore <69)) {
                System.out.printf("Score is: %d and Grade is: D\n",examScore);
            } else if((examScore >0)&&(examScore <59)) {
                System.out.printf("Score is: %d and Grade is: F\n",examScore);
            } else {
                System.out.println("Invalid Score");
            }

    }

}

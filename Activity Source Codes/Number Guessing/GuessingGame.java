 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sepirothx
 * Description: For Students Learning Java
 * License: GNU Public License / Open-Source
 */
public class GuessingGame {
    public static void main(String[]args){
        Random rand = new Random();
        Scanner console = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Random number generated!");
        System.out.println(randomNumber);

        System.out.println("Guess the number generated from 1~100");
        System.out.println("Enter a number below: ");
        int guess = console.nextInt();

        while(guess != randomNumber) {

            if (guess > 100) {
                System.out.println("Enter a number between 1 and 100 ONLY!: ");
                System.out.println("Have another guess below:");
                guess = console.nextInt();
            }else if(guess > randomNumber) {
                System.out.println("Your guess is higher! ");
                System.out.println("Have another lesser guess below:");
                guess = console.nextInt();
            } else if (guess < randomNumber) {
                System.out.println("Your guess is lesser! ");
                System.out.println("Have another higher guess below:");
                guess = console.nextInt();
            }  else {
                break;
            }



        }
        System.out.println("You got it right! Your guess: "+guess);
        System.out.println("Generated number is: "+randomNumber);




    }
}

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   

        //get the user's age
    System.out.println("Please enter your age");
    int age = input.nextInt();
    if (age < 16)
    {
        System.out.println("Sorry, you are not old enough to drive yet");
    }
    else if (age >= 18)
    {
        System.out.println("Your can drive and vote");
    }
    else
    {
        System.out.println("you can drive if you have your license ");
    }
    
    }
    
}

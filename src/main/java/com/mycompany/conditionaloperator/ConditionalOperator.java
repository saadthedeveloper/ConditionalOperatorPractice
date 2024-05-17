/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conditionaloperator;
import java.util.Scanner;
/**
 *
 * @author MKAY
 */
public class ConditionalOperator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        int anothernumber;
        
        //part one below
        
        System.out.println("Enter a whole number: ");
        number = keyboard.nextInt(); 
        System.out.println("Enter a whole number: ");
        number = keyboard.nextInt();
        
        System.out.println("Number entered is: "+((number%2==0)?"even":"odd"));
       
        //part two below
        
        System.out.println("Enter a another whole number between 0 and 20: ");
        anothernumber = keyboard.nextInt();
        System.out.println("Number entered is " + ((number>0 && number<20)?"within range":"out of range"));
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionpractive;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zain.aaban
 */
public class ExceptionPractice {

    /**
     */
    
     public static int getUserInput(){
         Scanner scan = new Scanner(System.in);
         int choice = scan.nextInt();
         int userChoice = choice;
     
                    //user Scanner to ask user foor int
         return userChoice;
                }
     
     
     public static void main(String[] args) {
         System.out.println("Enter an integer from 0-4: ");
         int t = 1;
        
         while(t==1){
         try {
            accessArray();
            t = 0;
        }
        catch(IndexOutOfBoundsException | InputMismatchException ex){
            System.out.println("That is not an integer from 0-4, please try again: ");
        }
        
     }
     }
     
    public static void accessArray() 
            throws IndexOutOfBoundsException {
        
        
                int[] testArray = new int[5] ;
                testArray[0] = 438932;
                testArray[1] = 212;
                testArray[2] = 30000000;
                testArray[3] = 900;
                testArray[4] = 7;
                int binToAccess = getUserInput();
                System.out.println("Array Value: " +testArray[binToAccess]);
                
               
                
                System.out.println("I am at the end of the program!");
                
                
      
    }
                
                
                        
                        }   
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalityprogramf;
import java.util.Scanner;
/**
 *
 * @author Zain A
 */ 

 
public class Run {

    public static void main(String[] args) {
        // MBTI personality types
        char IE; 
        char NS;
        char TF;
        char PJ;
        boolean charCheck = true;  //tests MBTI input validity

        
        
        System.out.println("Please type your four MBTI personality type letters: ");
        
        
        // Creates scanner object 
        Scanner sc = new Scanner(System.in);
        String Input = sc.next();
        
        int inputLength = Input.length();
       
            // Checks for error 1 - catches length error
        while (inputLength != 4){
            System.out.println("Error: Please enter the exact 4 letters that are"
                    + " associated with your MBTI type: ");
            Input = sc.next();
            inputLength = Input.length();
        }
            
            // places each MBTI letter into respective char value
            IE = Input.charAt(0);
            NS = Input.charAt(1);
            TF = Input.charAt(2);
            PJ = Input.charAt(3);
        
            // sets all characters to uppercase 
            IE = Character.toUpperCase(IE);
            NS = Character.toUpperCase(NS);
            TF = Character.toUpperCase(TF);
            PJ = Character.toUpperCase(PJ);
          
            
            if (IE != 'I' && IE !='E'){
                charCheck = false;
            }
            if (NS != 'N' && NS !='S'){
                charCheck = false;
            }
            if (TF != 'T' && TF !='F'){
                charCheck = false;
            }
            if (PJ != 'P' && PJ !='J'){
                charCheck = false;
            }
        
         // Checks for error 2 - catches both length and letter type error
            while (inputLength != 4 || charCheck == false){
            
             System.out.println("");
            System.out.println("Error: Please enter the exact 4 letters that are"
                    + " associated with your MBTI type: ");
            Input = sc.next();
            inputLength = Input.length();
            
            if (inputLength == 4){
            IE = Input.charAt(0);
            NS = Input.charAt(1);
            TF = Input.charAt(2);
            PJ = Input.charAt(3);
            } 
            
            IE = Character.toUpperCase(IE);
            NS = Character.toUpperCase(NS);
            TF = Character.toUpperCase(TF);
            PJ = Character.toUpperCase(PJ);
            
            // runs the letter check 
                charCheck = true;
            if (IE != 'I' && IE !='E'){
                charCheck = false;
            }
            if (NS != 'N' && NS !='S'){
                charCheck = false;
            }
            if (TF != 'T' && TF !='F'){
                charCheck = false;
            }
            if (PJ != 'P' && PJ !='J'){
                charCheck = false;
            }
            
        }
        
        PersonalityType pp = new PersonalityType();
        IorE iore = new IorE();
        
        if (IE == 'E'){
            iore.Extroverted();
            iore.getOutdoors();
        } 
        
        
        
        System.out.println("");
        System.out.println("You reached the end of the program");
        
        /*
        int results = pp.getOutdoors();
        System.out.println(results);
        System.out.println(iiee.getOutdoors());
        iiee.Extroverted();
        System.out.println(outdoors);
        */
        
        } // closes psvm
    } // closes class

    
    
    


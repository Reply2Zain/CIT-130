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
        char IE; 
        char NS;
        char TF;
        char PJ;
        boolean charCheck = true;

        
        
        System.out.println("Please type your four MBTI personality type letters: ");
        
        
        
        Scanner sc = new Scanner(System.in);
        String Input = sc.next();
        
        int inputLength = Input.length();
        
        // Error 1: catches length error
        while (inputLength != 4){
            System.out.println("Error: Please enter the exact 4 letters that are"
                    + " associated with your MBTI type: ");
            Input = sc.next();
            inputLength = Input.length();
        }
                
        
     
            
            IE = Input.charAt(0);
            NS = Input.charAt(1);
            TF = Input.charAt(2);
            PJ = Input.charAt(3);
        
     
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
        
        /* //This checked the status of the program before Error 2 loop
            System.out.println(" ");
            System.out.println("CharCheck Boolean:  " + charCheck) ;
            System.out.println("InputLength: " + inputLength);
        
        */
        
         // Error 2: catches wrong letter error + maintains length check
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
                                    
            
        System.out.println("");
        System.out.println("You reached the end of the program");
        
        PersonalityType pp = new PersonalityType();
        IorE iiee = new IorE();
        
        
        
        /*
        int results = pp.getOutdoors();
        System.out.println(results);
        System.out.println(iiee.getOutdoors());
        iiee.Extroverted();
        System.out.println(outdoors);
        */
    }
        
        /*
        System.out.println("Please type the second of your "
                + "four MBTI personality type letters");
        System.out.println("N or S");
        
        System.out.println("Please type the third of your "
                + "four MBTI personality type letters");
        System.out.println("T or F");
        
        System.out.println("Please type the first of your "
                + "four MBTI personality type letters");
        System.out.println("P or J");
    */
    }

    
    
    

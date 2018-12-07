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
        char JP;
        boolean charCheck = true;  //tests MBTI input validity
        
        //creates instances of each class
        PersonalityType pType = new PersonalityType();
        IorE iore = new IorE();
        NorS nors = new NorS();
        TorF torf = new TorF();
        JorP jorp = new JorP();
        
        System.out.println("Please type your four MBTI personality type letters: ");
        
        
        // Creates scanner object 
        Scanner sc = new Scanner(System.in);
        String Input = sc.next();
        
        
        int inputLength = Input.length();
       
            // Checks for error 1 - catches length error
        while (inputLength != 4){
            System.out.println("");
            System.out.println("Error: Please enter the exact 4 letters that are"
                    + " associated with your MBTI type: ");
            Input = sc.next();
            inputLength = Input.length();
        }
            
            // places each MBTI letter into respective char value
            IE = Input.charAt(0);
            NS = Input.charAt(1);
            TF = Input.charAt(2);
            JP = Input.charAt(3);
        
            // sets all characters to uppercase 
            IE = Character.toUpperCase(IE);
            NS = Character.toUpperCase(NS);
            TF = Character.toUpperCase(TF);
            JP = Character.toUpperCase(JP);
          
            
            if (IE != 'I' && IE !='E'){
                charCheck = false;
            }
            if (NS != 'N' && NS !='S'){
                charCheck = false;
            }
            if (TF != 'T' && TF !='F'){
                charCheck = false;
            }
            if (JP != 'P' && JP !='J'){
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
            JP = Input.charAt(3);
            } 
            
            IE = Character.toUpperCase(IE);
            NS = Character.toUpperCase(NS);
            TF = Character.toUpperCase(TF);
            JP = Character.toUpperCase(JP);
            
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
            if (JP != 'P' && JP !='J'){
                charCheck = false;
            }
            
        } // closes while loop - error 2 check
        
        //Tells the user what they entered in all caps
        String InputU = Input.toUpperCase();
        pType.getPersonalityType(InputU);
        
        
        //runs the results from respective classes
        if (IE == 'E'){
            iore.Extroverted();
        }
        else{
            iore.Introverted();
        }
        if (NS == 'N'){
            nors.Intuition();
        }
        if (IE == 'S'){
            nors.Sensing();
        }
        if (TF == 'T'){
            torf.Thinking();
        }
        if (TF == 'F'){
            torf.Feeling();
        }
        if (JP == 'J'){
            jorp.Judging();
        }
        if (JP == 'P'){
            jorp.Perceiving();
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

    
    
    


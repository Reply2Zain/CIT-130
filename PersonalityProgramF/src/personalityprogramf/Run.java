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
        iore.getEnteredPType(InputU);
        
        //create instance of PersonalityDesctiption - gets the
        PersonalityDescription pdo = new PersonalityDescription();
        
        //runs the results from respective classes
        System.out.println("");
        
        //I & E
        System.out.println("Extraversion (E) vs Introvesion (I):");
        if (pdo.getMoreInfo()){
        System.out.println(iore.displayTypeSummary());
        }
        if (IE == 'E'){
            iore.getExtroverted();
        }
        if (IE =='I'){
            iore.getIntroverted();
        }
        pdo.getEachDescription(IE);
        
        System.out.println("");
        // N & S
        System.out.println("Intuition (N) vs Sensing (S) :");
        if (pdo.getMoreInfo()){
        System.out.println(nors.displayTypeSummary());
        }
        if (NS == 'N'){
            nors.getIntuition();
        }
        if (IE == 'S'){
            nors.getSensing();
        }
        pdo.getEachDescription(NS);
        
        System.out.println("");
        //T & F
        System.out.println("Thinking (T) vs Feeling (F):");
        if (pdo.getMoreInfo()){
        System.out.println(torf.displayTypeSummary());
        }
        if (TF == 'T'){
            torf.getThinking();
        }
        if (TF == 'F'){
            torf.getFeeling();
        }
        pdo.getEachDescription(NS);
        
        System.out.println("");
        //J & P
        System.out.println("Judging (J) vs Perceiving (P):");
        if (pdo.getMoreInfo()){
        System.out.println(jorp.displayTypeSummary());
        }
        if (JP == 'J'){
            jorp.getJudging();
        }
        if (JP == 'P'){
            jorp.getPerceiving();
        }
        pdo.getEachDescription(NS);
        
        
        
                
        System.out.println("");
        System.out.println("-----------");
        System.out.println("You have reached the end of the program.");
        
        /*
        int results = pp.getOutdoors();
        System.out.println(results);
        System.out.println(iiee.getOutdoors());
        iiee.Extroverted();
        System.out.println(outdoors);
        */
        
    } // closes psvm

   
} // closes class

    
    
    


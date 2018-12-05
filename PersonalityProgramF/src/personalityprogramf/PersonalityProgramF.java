/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalityprogramf;
import java.util.Scanner;
/**
 *
 * @author Zain
 */
public class PersonalityProgramF {
        
        String introvert;
        String extrovert;
        public static boolean charCheck = true;
    /**
     * @param args the command line arguments
     */
        

    public static void main(String[] args) {
        char IE; 
        char NS;
        char TF;
        char PJ;
        
        System.out.println("Please type your four MBTI personality type letters");
        
        
        
        Scanner sc = new Scanner(System.in);
        String Input = sc.next();
        
        int inputLength = Input.length();
        while (inputLength != 4){
            System.out.println("Please enter exactly 4 letters that are"
                    + " associated with your MBTI type: ");
            Input = sc.next();
            inputLength = Input.length();
        }
                
            IE = Input.charAt(0);
            NS = Input.charAt(1);
            TF = Input.charAt(2);
            PJ = Input.charAt(3);
        
         
        
          

    
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
        System.out.println(" ");
            System.out.println("CHAR " + charCheck) ;
            System.out.println("InputLength " + inputLength);
            
         while (inputLength != 4 || charCheck == false){
            
             System.out.println("");
            System.out.println("Error 2: Please enter exactly 4 letters that are"
                    + " associated with your MBTI type: ");
            Input = sc.next();
            inputLength = Input.length();
            if (inputLength == 4){
            IE = Input.charAt(0);
            NS = Input.charAt(1);
            TF = Input.charAt(2);
            PJ = Input.charAt(3);
            } 
            if (IE == 'I' || IE =='E'){
                charCheck = true;
            }
            if (NS == 'N' || NS =='S'){
                charCheck = true;
            }
            if (TF == 'T' || TF =='F'){
                charCheck = true;
            }
            if (PJ == 'P' || PJ =='J'){
                charCheck = true;
            }
        }
            
         
            
            
        System.out.println("");
        System.out.println("You reached the end of the program");
        
        
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

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalityprogramf;

/**
 *
 * @author Zain
 */

public class PersonalityType {
        //These are the personality factors
        int outdoors;   
        int indoors;
        String Input;
        
     void getPersonalityType(String Input){
            System.out.println("");
            System.out.println("Personality type entered: ");
            System.out.println(Input);
        } // close getPersonalityType      
       
     int getOutdoors(){
            System.out.println("Outdoors value is: " + outdoors );
            System.out.println("");
            return outdoors;
     }  //  close getOutdoors
     
     int getIndoors(){
            System.out.println("Indoors value is: " + indoors );
            System.out.println("");
            return indoors;
        } // close getIndoors
        

}
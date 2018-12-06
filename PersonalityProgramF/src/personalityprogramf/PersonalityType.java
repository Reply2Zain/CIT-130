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
        
       void PersonalityType(){
            System.out.println("The personality type inputted is: ");
            
        }
       
       
        public int getOutdoors(){
            System.out.println("Outdoors value is: " + outdoors);
            return outdoors;
        } // close getOutdoors
        

}
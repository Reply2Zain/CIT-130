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
    
        String isIntroverted;
        String isExtroverted;
        
        //These are the personality factors
        int outdoors;        // give weight to each
        int indoors;             // give weight to each
            //or
        int location; // set outdoors >1, set indoor <1
        
       void PersonalityType(){
            System.out.println("I am the constructor of PersonalityType");
            
        }
       
       
        public int getOutdoors(){
            outdoors +=100;
            return outdoors;
        }
        

}
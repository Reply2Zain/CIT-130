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

public abstract class PersonalityType {
        //These are the personality factors
        int outdoors;   
        int indoors;
        
     void getPersonalityType(String Input){
            System.out.println("");
            System.out.println("");
            System.out.print("Personality Type Entered: ");
            System.out.println(Input);
        } // close getPersonalityType      
       
     int getOutdoors(){
            System.out.println("Outdoors value is: " + outdoors );
            return outdoors;
     }  //  close getOutdoors
     
     int getIndoors(){
            System.out.println("Indoors value is: " + indoors );
            return indoors;
        } // close getIndoors
     
     void getAllPersonalityTypes(){
         System.out.println("This will print out the description off all personality types. Specificity available upon request");
         
     }
     
        
public abstract String displayTypeSummary();
        String ioreDescription = "This is the description of the IorE dimension";
        String norsDescription = "This is the description of the NorS dimension";
        String jorpDescription = "This is the description of the JorP dimension";
        String torfDescription = "This is the description of the TorF dimension";
        
} // Close Class
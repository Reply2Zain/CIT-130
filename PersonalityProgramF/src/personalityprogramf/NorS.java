/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalityprogramf;


/**
 *
 * @author reply
 */
public class NorS extends PersonalityType implements MyInterface{
         
    public void getIntuition(){
                   //outdoors += 1 ;
                    System.out.println("");
                    System.out.println("You are Intuitive:");
                    //System.out.println("Intition has added one to outdoors");                 
    } // Closes Intuition
     
    public void getSensing(){
                    //indoors +=1;
                    System.out.println("");
                    System.out.println("You are a Senser:");
                    //System.out.println("Sensing as added one to indoors");
    } // Closes Sensing
     
      @Override
    public String displayTypeSummary(){
        return norsDescription;
    }
     
    public void sayEffective() {
        System.out.println(TipsEffective);    
    }
}

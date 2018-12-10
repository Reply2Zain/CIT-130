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
public class IorE extends PersonalityType{
             
    public void Extroverted(){
                   outdoors += 1 ;
                    System.out.println("");
                    System.out.println("Extroverted diagnostic:");
                    System.out.println("Extroverted added one to outdoors");
                    getOutdoors();
    } // Closes Extroverted
                
    public void Introverted(){
                    indoors +=1;
                    System.out.println("");
                    System.out.println("Introverted diagnostic:");
                    System.out.println("Introverted has added one to indoors");
                    getIndoors();
    } // Closes Introverted
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSuccessP;

/**
 *
 * @author Zain
 */
public class IorE extends PersonalityType implements MyInterface{
    
    public void getExtroverted(){
                    outdoors += 1 ;
                    System.out.println("");
                    System.out.println("You are an Extrovert");
                    //System.out.println("Extroverted added one to outdoors");
                    //getOutdoors();
    } // Closes Extroverted
                
    public void getIntroverted(){
                    indoors +=1;
                    System.out.println("");
                    System.out.println("You are an introvert");
                    //System.out.println("Introverted has added one to indoors");
                    //getIndoors();
    } // Closes Introverted
    
    
    @Override
    public String displayTypeSummary(){
        return ioreDescription;
    }
        

    @Override
    public void sayEffective() {
        System.out.println(TipsEffective);    
    }
}

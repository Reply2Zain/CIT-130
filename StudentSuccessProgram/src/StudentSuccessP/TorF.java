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
public class TorF extends PersonalityType {
    
    
    public void getThinking(){
                    //variable += 1 ;
                    System.out.println("");
                    System.out.println("You are a Thinker: ");
                    //System.out.println("Thinking has added one to variable");
    } // Closes Thinking
    
    public void getFeeling(){
                    //variable += 1 ;
                    System.out.println("");
                    System.out.println("You are a Feeler: ");
                    //System.out.println("Thinking has added one to variable");
    } // Closes Feeling
@Override
    public String displayTypeSummary(){
        return torfDescription;
    }
}

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
public class JorP extends PersonalityType {
    
    public void getJudging(){
                    //variable += 1 ;
                    System.out.println("");
                    System.out.println("Judging diagnostic:");
                    System.out.println("Judging has added one to variable");
    } // Closes Judging
    
      public void getPerceiving(){
                    //variable += 1 ;
                    System.out.println("");
                    System.out.println("Perceiving diagnostic:");
                    System.out.println("Perceiving has added one to variable");
    } // Closes Perceiving
    
      @Override
    public String displayTypeSummary(){
        return jorpDescription; 
    }
}

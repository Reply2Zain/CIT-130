/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalitymain;

/**
 *
 * @author zain.aaban
 */
public class InfoLand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PublicInfoBundle pib = new OccSubclass();
      OccSubclass ocs =(OccSubclass) pib;
      pib.attachCaseMessage("Sample Message");
      // type cast of parent memvar into
      // child type
      
    }
    
}

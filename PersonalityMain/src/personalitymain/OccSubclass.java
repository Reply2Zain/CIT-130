/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalitymain;

/**
 * Subclass of PublicInfoBundle
 * Stores publicly released info
 * about occupancy permit info
 * @author zain.aaban
 */
public class OccSubclass extends PublicInfoBundle{
    //mem vars specific to subclass
    String occupancyType;
    
    @Override
    public void attachCaseMessage(String msg){
        System.out.println("Simulating attaching message " + msg);
    } // Close overriden method
}

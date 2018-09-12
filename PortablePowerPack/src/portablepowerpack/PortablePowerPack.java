/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portablepowerpack;

/**
 *
 * @author zain.aaban
 */
public class PortablePowerPack {

    public boolean powerOn;
    public float batteryPercentage;
    public boolean jumperCablesConnected;
    public String upc;
    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
            if (jumperCablesConnected){
            powerOn = true; 
            }
            else{
            powerOn = false;
                    }
        }

    void startSwitch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    


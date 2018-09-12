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
public class WoodShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PortablePowerPack pack1 = new PortablePowerPack();
       System.out.println("Press status: " + pack1.powerOn);
       pack1.jumperCablesConnected = true;
       //pack1.startSwitch();
       
       

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author zain.aaban
 */
public interface Securable {
    Securable armSystem();
    Securable disarmSystem(int passcode);
    Securable triggerAlarm();
    Securable cancelAlarm(int passcode);
}

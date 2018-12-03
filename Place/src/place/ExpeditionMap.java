/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package place;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author zain.aaban
 */
public class ExpeditionMap {
    Map <String,String> expedMap; 
    
    public ExpeditionMap(){
        expedMap = new HashMap<>();
        expedMap.put ("locationName", "Wind Rivers");
    }
 
    public List<String> setExpeditionMap (Map<String, String> inMap) {
       
        expedMap = inMap;
        System.out.println(inMap);
        return null;
    }
    public Map <String,String> getExpeditionMap(Map<String, String> expedMap){
        return expedMap;
    }
    
   
    
}

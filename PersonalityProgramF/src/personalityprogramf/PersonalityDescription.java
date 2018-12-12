/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalityprogramf;

import java.util.HashMap;

/**
 *
 * @author Zain
 */
public class PersonalityDescription extends PersonalityType {
    HashMap pIndividualDescription = new HashMap();
            
            
    void getEachDescription(char InputC){
    pIndividualDescription.put('E', eDescription);
    pIndividualDescription.put('I', iDescription);
    pIndividualDescription.put('N', nDescription);
    pIndividualDescription.put('S', sDescription);
    pIndividualDescription.put('T', tDescription);
    pIndividualDescription.put('F', fDescription);
    pIndividualDescription.put('P', pDescription);
    pIndividualDescription.put('J', jDescription);
    
    
    
     System.out.println(pIndividualDescription.get(InputC));
}
    
    
    @Override
    public String displayTypeSummary(){
        return null;
    }

    
}


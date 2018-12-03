/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package place;
import java.util.HashMap;
import java.util.Map; 
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/**
 *
 * @author zain.aaban
 */
public class Place {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        
        System.out.println("Do you want to see a map of Dubai? (yes or no)");
        System.out.print("> ");
        String visit = sc.nextLine();

                HashMap <String, String> map = new HashMap<>();
                
    if (visit.equals("yes")){ 
        map.put("Location Name", " Dubai");
        map.put("Building", " Burj Khalifa"); 
        map.put("Person", " King of Arabia"); 
        map.put("Fun", " Racing"); 
    }
    else{
        map.clear();
    }
    
        switch (visit) {
            case "yes":
                System.out.println("-------");
                System.out.println("The contents of the map are: " + map);
                break;
            case "no":
                System.out.println("-------");
                System.out.println("Map is empty because you said no");
                break;
            case "other":
                System.out.println("-------");
                System.out.println("other was stated, say 'yes' or 'no'");
                break;
            default:
                System.out.println("-------");
                System.out.println("Please run the program again and choose "
                        + "'yes' or 'no'");
                break;
        }
     
       
        System.out.println();
        // System.out.println("The full list of keys are: " + map.keySet());
      
        /**
         * 
         */
       { Set setOfKeys = map.keySet();
       setOfKeys.iterator();
       Iterator<String> iter = setOfKeys.iterator(); 
            while (iter.hasNext()){
                int i = 1;
                String z = iter.next();
                System.out.println(z);
                 System.out.println();
                 i++;
        }
            
           
    } // closes iterator
    } // main method
        
        public List <String> printMap (Map<String, String> name) {
            
                return new LinkedList<>();
                
                
     
        
} // close printmap
    
    
} // closer place class


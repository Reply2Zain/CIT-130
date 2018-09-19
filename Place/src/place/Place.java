/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package place;
import java.util.HashMap;
import java.util.Map; 
import java.util.Scanner;
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
    
     if (map.isEmpty())  
        { 
            System.out.println("-----");
            System.out.println("Map is empty"); 
        } 
          
        else
        { 
            System.out.println("-----");
            System.out.println("The contents of the map are: " + map); 
    }
    
}
}

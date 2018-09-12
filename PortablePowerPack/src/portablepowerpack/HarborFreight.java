package portablepowerpack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
import java.lang.Number;
import java.lang.String;
import java.util.ListIterator;
/**
 *
 * @author zain.aaban
 */
public class HarborFreight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = new String();
        PortablePowerPack firstP = new PortablePowerPack ();
        firstP.upc = "abc";
        
        PortablePowerPack secondP = new PortablePowerPack ();
        secondP.upc = "wxy";
        
        
        Scanner keyboard = new Scanner (System.in);
        LinkedList <String> List = new LinkedList <> ();
        
        System.out.println("How many times would you like to manipulate your list?");
        System.out.print("> ");
        String test  = keyboard.next();
        int repeat = Integer.parseInt(test);
        if (repeat > 0){
        
        //int repeat  = keyboard.nextInt();
        
        System.out.println("");
        System.out.println("You currently have a list with " + List.size() + " items");
       
        for (int i=1;i<=repeat;){ 
        System.out.println("");
        System.out.println("How would you like to interact?");
        System.out.println("(Enter 1) Add an item");
        System.out.println("(Enter 2) Remove an item");
            System.out.print("> ");
       
            int myint = keyboard.nextInt();
            System.out.println("");
       
        if (myint == 1) {
            System.out.println("What would you like to add?");
            System.out.print("> ");
            String x = keyboard.next();
            List.add(x);
            
            System.out.println("");
            System.out.println( "" + x + " has been added!");
            i++;
        }
        if (myint == 2){
            System.out.println("");
            System.out.println("What place would you like to remove from? (1 -> list size)");
            System.out.print("> ");
            int remove = keyboard.nextInt();
            String get = List.get(remove -1 );
            List.remove(remove - 1);
            System.out.println( get + " was deleted");
            i++;
        }
        else {
              System.out.println("Please type a number listed");
              System.out.println("");
                }
        System.out.println("You now have a list with " + List.size() + " items");
        }
        
        }
        
        else{
            System.out.println("Please type a number listed");
        }
        
        
        
        
        Stack <PortablePowerPack> pressStack = new Stack<>();
        pressStack.push(firstP);
        pressStack.push(secondP);
        
        //System.out.println("Popping: " + pressStack.pop());
    }
    
}

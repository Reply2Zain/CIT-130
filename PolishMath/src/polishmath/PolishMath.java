/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polishmath;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author zain.aaban
 */
public class PolishMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Creating a Stack
    String s = "placeHolder" ;
    int valueX = 0;
    int i = -1; //counter
    int x = 0;
    
        Stack <String> stack = new Stack<>();  // create a stack called stack
        Scanner scan = new Scanner(System.in); //makes a scanner object
        System.out.println("Welcome to Polish Math Comp.");
        System.out.println("Type out the list of value");  //Welcome text
       
        
        
                
        while (!s.endsWith("=")){
        s = scan.next();
        stack.push(s);
        i++;
        }                   // Puts every value into the stack
        
        stack.pop(); //removes the equal sign from stack
        
        System.out.println("i is equal to " + i);
        while (x<i) {
        if (stack.get(x).endsWith("*"))
            
        valueX =  Integer.parseInt(stack.get(x));
        x++;
        }

        //System.out.println("int x is " + x);
        //stack.push("2");
        //stack.push("5");
        
        System.out.println("This is the resulting stack");
        System.out.println(stack);   
    }
    
}

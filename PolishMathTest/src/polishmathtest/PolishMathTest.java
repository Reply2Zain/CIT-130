/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author reply
 */
public class PolishMathTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Creating a Stackds
    String s = "placeHolder" ;
    int total = 0;
    int next = 0;
    int stackSize = -1; //counter
    int stackTicker = 0;
    
   
        Stack <String> stack = new Stack <>();  // create a stack called stack
        Scanner scan = new Scanner(System.in); //makes a scanner object
        System.out.println("Welcome to Polish Math Comp.");
        System.out.println("Type out the list of value");  //Welcome text
       
        
        
                
        while (!s.endsWith("=")){
        s = scan.next();
        stack.push(s);
        stackSize++;           // i counts the number of values in the stack 
        }                   // Puts every value into the stack
        
        stack.pop(); //removes the equal sign from stack
        
        
        try{
            total =  Integer.parseInt(stack.get(stackTicker));
            }
            catch(NumberFormatException e){
                System.out.println("---------------");
                System.out.println("Error:");
                System.out.println("Please input numbers and operators only");
                System.out.println("---------------");
            } 
        stackTicker++;      // puts the top value into total and counts the stackTicker
        
        
        System.out.println("The stack size is " + stackSize); // total size of stack
        while (stackTicker<stackSize) {     //stackTicker starts at 0
        if (stack.get(stackTicker).equalsIgnoreCase("*"))
            total*=next
                    ;
        
        if (stack.get(stackTicker).equalsIgnoreCase("/")){
            total/=next;
            //stack.pop();
        }
        if (stack.get(stackTicker).equalsIgnoreCase("+"))
            total+=next
            ;
        if (stack.get(stackTicker).equalsIgnoreCase("-"))
            total-=next
            ;
        
        else
            try{
            next =  Integer.parseInt(stack.get(stackTicker));
            }
            catch(NumberFormatException e){
                System.out.println("---------------");
                System.out.println("Error:");
                System.out.println("Please input numbers and operators only");
                System.out.println("---------------");
            }
        stackTicker++;
        }

        //System.out.println("int x is " + x);
        //stack.push("2");
        //stack.push("5");
        
        System.out.println("This is the resulting stack");
        System.out.println(stack);       }
    
}

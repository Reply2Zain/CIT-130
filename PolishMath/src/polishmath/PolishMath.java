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
    String s ;
    int x;
        Stack <String> polishMath = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Polish Math Comp.");
        System.out.println("Print out the first value");
        s = scan.next();
       x =  Integer.parseInt(s);
        
        System.out.println("String s string is " + s);
        System.out.println("int x is " + x);
        
        //polishMath.push("2");
        //polishMath.push("5");
  
        System.out.println(polishMath);   
    
    
    }
    
}

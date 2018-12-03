/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackt;

import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author zain.aaban
 */
public class StackT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // Creating a Stack
    String s ;
        Stack <String> polishMath = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to PolishMathComputation");
        System.out.println("Print out the first value");
        s = scan.next();
        System.out.println("input is " + s);
        polishMath.push("2");
        polishMath.push("5");
  
        System.out.println(polishMath);
        
        
    
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.color;

/**
 *
 * @author zain.aaban
 */
public class guiTest {

    private static Frame mainFrame;
    private static Panel topPanel;
    private static Panel bottomPanel;
    private static Button button1;
    private static Button button2;
    private static Label instructionLabel;
    private static Label pushedButton1;
    private static Label pushedButton2;
    private static FlowLayout centeredText;
    private static Font labelFont;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIMaker();
        
    }
    public static void GUIMaker(){
       mainFrame = new Frame ("AWT Simple Demo"); 
       
       mainFrame.setLayout (new GridLayout(1,2));
       mainFrame.setSize(500, 250);
       
       mainFrame.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing (WindowEvent windowEvent){
           System.exit(0);
    }   //Close windowClosing
       }); //Close addWindowListener
       
       //create top and bottom panels 
       centeredText = new FlowLayout(FlowLayout.CENTER,35,35);
       topPanel = new Panel (centeredText);
       bottomPanel = new Panel (centeredText);
       
       //add panels to mainFrame
       mainFrame.add(topPanel,BorderLayout.NORTH);
       mainFrame.add(bottomPanel,BorderLayout.SOUTH);
       
       //create buttons
       button1 = new Button ("Button 1");
       button2 = new Button ("Button 2");
       
       //add buttons to topPanel
       topPanel.add(button1);
       topPanel.add(button2);
       
       
       //adjust the size of the buttons
       Dimension buttonSize = new Dimension (175,55);
       button1.setPreferredSize (buttonSize);
       button2.setPreferredSize (buttonSize);
       
       //change the font size of the buttons
       Font buttonFont = new Font ("",Font.PLAIN, 30);
       button1.setFont(buttonFont);
       button2.setFont(buttonFont);
       
       //create labels
       instructionLabel = new Label ("Push a button");
       pushedButton1 = new Label ("You pushed Button 1");
       pushedButton2 = new Label ("You pushed Button 2");
       
       //add instructionLabel to bottomPanel
       bottomPanel.add(instructionLabel);
       
       //create and set label font
       labelFont = new Font ("",Font.PLAIN,25);
       instructionLabel.setFont(labelFont);
       pushedButton1.setFont(labelFont);
       pushedButton2.setFont(labelFont);
       
       //make Label text green
       pushedButton1.setForeground(Color.GREEN);
       pushedButton2.setForeground
       
       mainFrame.setVisible(true);
       
    }
    
    
    
    
}


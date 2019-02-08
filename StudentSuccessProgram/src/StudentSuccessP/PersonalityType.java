/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSuccessP;
import java.util.Scanner;

/**
 *
 * @author Zain
 */

public abstract class PersonalityType {
        
        //These are the personality factors
        int outdoors;   
        int indoors;
        
        Scanner scanInfo = new Scanner(System.in);
        
        
     void getEnteredPType(String Input){
            
            System.out.println("");
            System.out.println("");
            System.out.print("Personality Type Entered: ");
            System.out.println(Input);
        } // close getEnteredPType      
       
     int getOutdoors(){
            System.out.println("Outdoors value is: " + outdoors );
            return outdoors;
     }  //  close getOutdoors
     
     int getIndoors(){
            System.out.println("Indoors value is: " + indoors );
            return indoors;
        } // close getIndoors
     
     void getAllPersonalityTypes(){
         System.out.println("This will print out the description off all personality types. Specificity available upon request");
         
     }
     
     boolean getMoreInfo(){
         System.out.print("Would you like to receive background information on these two types? (yes or no) > ");
         String Input = scanInfo.next();
            return Input.equalsIgnoreCase("yes");
     }
     
    String ioreDescription = 
            "The first of the four preferences is Introversion vs Extraversion. Extroverts "
            + "get their energy "
            + "\nfrom the outside environment including people and places. "
            + "They feel better and are more productive "
            + "\nwhen in social settings and "
            + "often look forward to going out. Introvertson the other hand get their"
            + "\n energyfrom within themselves "
            + "and are more productive when in by themselves. Social "
            + "settings drain "
            + "\nthe energy of an introvert and does not come "
            + "off as a productive"
            + "enviornemnt for them. Extroverted "
            + "\npeople are accessible and seem to process "
            + "things faster due to "
            + "their ''act first think later''"
            + "\nattitude. Introverted "
            + "people on the other hand tend to have a more reserved attitude and can easily "
            + "\nend up thinking deeply about a given before acting.";
    
    String norsDescription = 
            "The difference between intuition and sensing are includes the way we process new"
            + "\ninformation. People who have a preference of sensing are always in the ''here"
            + "\nand now.'' Along with being factual, they process information through the five senses."
            + "\nThey are concrete thinkers that value realsim and ideas with practical applications. "
            + "\nPeople who have a preference of intuition always think about the future and are always"
            + "\nlooking for new possiblilies. They process information by looking for patters and "
            + "enjoy inspiration and imagination. Intuitive people are attracted towards big ideas and concepts.";
    String torfDescription = 
            "The difference of thinking vs feeling involves the way decisions are made. Those who like to prefer "
            + "\nnthinking over feeling make their decisions primarily on logic. They try to not let feeling get"
            + "\nin the way of whatever they might be doing and are task and goal oriented. Those who prefer "
            + "\nfeeling on the other hand make a lot of their decisions based off social considerations. They "
            + "\nlisten and do what feels right and helpful to the purpose of society. They can be seen as more "
            + "\npeople and value-oriented.  ";
    String jorpDescription = 
            "The difference between Judging and Perceiving involves the way we organize and structure"
            + "\nour lives. People who are said to prefer Judging approach life in a more structured way,"
            + "\nand enjoy creating organized plans to achieve their goals and to get things done. People that"
            + "\nare of this type tend to be more disciplined and pay a lot of attention to their decisions."
            + "\nOn the other hand, people who prefer Perceiving over Judging tend to find structure and lists"
            + "\nto be more of a limit or hinder on their abilities. Perceivers are more tolerant of other"
            + "\npeople and like to keep their options open for as long as they can. Judgers may see perceivers"
            + "\nas purposeless wanderers. ";    
    
    //Description of each class
    String iDescription =
            "Study Tip: Having a preference of intraversion over extravarsion means that you work better"
            + "\nin a personal, more individual setting. You like to plan things out, which is a good trait "
            + "\nto have. Mind maps can help connect your thoughts. If you do end up studying with others,"
            + "\n try to not pick a group of friends who are too outgoing or producitivty would diminish";
    String eDescription =
            "Study Tip: Having a preference of extroversion over intraversion means that you work better in "
            + "\n a social, outgoing environment. It is beneficial at times to think out loud and "
            + "\nto bounce ideas around with others. Try to discuss concepts with people who share "
            + "\nthe same interests. Extroverts are more likely to skip mundane, boring tasks which"
            + "\ncan be a detriment especially when it is related to schoolwork.";
    String nDescription =
            "Study Tip: Being intuitive means that you like to know the why. Looking for patterns"
            + "\nand relationships often help and go a long way. Use your energy wisely and take breaks "
            + "\never so often to make the most out of your study time. Take part in evidence based note-taking"
            + "\n and always see why the certain thing is important.";
    String sDescription =
            "Study Tip:Make diagrams and outlines while studying. Flash cards and visual aids help a lot in retaining"
            + "\nideas. Hands-on activities are also beneficial to do when possible. It may be easy to forget"
            + "\nthe big picture at times...don't.";
    String tDescription ="Study Tip: Having a preference of Thinking means that you prefer logic. Think about your"
            + "\nchoices and make learning/studying a thinking endeavor with reasons why to increase motivation.";
    String fDescription ="Study Tip: Feeling types tend to look for a pesonal connection to find reason in their work. Working"
            + "\nin group settings with people who you are have some sort of relationship with enhances productivity.";
    String jDescription =
            "Study Tip: judging types like to have a structured day with organized things to do. It is better to "
            + "\nto make a list and organzie your day and prioritize the bigger, more important tasks first. ";
    String pDescription =
            "Study Tip: Perceiving types like to work when they have a lot of flexibility. The biggest problem is "
            + "\nprocrassination. Keep your work enviornment free of distactions";
        
                
        
 public abstract String displayTypeSummary();       
} // Close Class
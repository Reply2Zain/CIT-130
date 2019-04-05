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
public class SuccessDecisionTree {
      Scanner sq = new Scanner (System.in);
      String answer;
      int whileLoopCheck = 0;
      private void ev(){
          System.out.print("> ");          
      }

    public void StudentSuccessQuestions(){
        System.out.println("Welcome to the Student Success Program!");
        
        while (whileLoopCheck == 0){
        System.out.println("");
        System.out.println("All inputted answers should be either 'yes' or 'no' unless otherwise specified ");
        System.out.println("Are you stressed and/or facing any difficulites in school?");
        ev();
        answer = sq.next();
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no") ){
            whileLoopCheck = 1;
            }
        }
        if (answer.equalsIgnoreCase("yes")){
            
            System.out.println("Is it due to academic reasons?");
            ev();
            answer = sq.next();
            
            if (answer.equalsIgnoreCase ("yes")){
                
                System.out.println("Is it due to homework, exams, time-management or personal reasons");
                ev();
                answer = sq.next();
                if (answer.equalsIgnoreCase ("homework")){
                    
                    System.out.println("Is the coursload too difficult or homework too demanding?");
                    System.out.println("Please enter 'difficult' or 'demanding'");
                    ev();
                    answer = sq.next();
                    if (answer.equalsIgnoreCase ("difficult")){
                        
                        System.out.println("What subject is the homework? enter one: math, english, other");
                        ev();
                        answer = sq.next();
                        if (answer.equalsIgnoreCase("math")){
                            
                            System.out.println("Advice: Try going to the Math Cafe, there are math tutors there who are able to help.");
                        }
                        else if (answer.equalsIgnoreCase("english"))
                            
                            System.out.println("Advice: Try going to the Learning Commons, there are English tutors there who are able to help. ");
                        else {
                            
                            System.out.println("Advice: Try going the tutoring services at CCAC, they can be found at the library.");
                        }
                    }
                    else {
                    System.out.println("Try setting a schedule and working on time management tactics");
                        System.out.println("If it remains to be too demanding then try talking to your professor");
                    }
                }
                else if (answer.equalsIgnoreCase ("exams")) {
                {
                    System.out.println("What subject of the exam? enter one: math, english, other");
                        ev();
                        answer = sq.next();
                        if (answer.equalsIgnoreCase("math")){
                            System.out.println("Advice: When it comes to exam study, review guides have been shown to be effective."
                                    + "\nReview older exams to see the type of questions being asked and talk to the professor."
                                    + "\nAlso be sure to do as many practice problems on the subject as possible. ");
                            System.out.println("If the example questions are difficult to get through try going to the Math Cafe, "
                                    + "\nthere are math tutors there who are able to help.");
                        }
                        else if (answer.equalsIgnoreCase("english")){
                            System.out.println("Know exactly what is gonna be on the exam. English exams vary and are usually heavily dependent on the "
                                    + "\nconcepts being covered leading up to the exam. Speak with your professor during office hours if need be to "
                                    + "\nreally understand exactly what the exam will cover. ");
                            System.out.println("");
                            System.out.println("If the english exam covers grammar try going to the Learning Commons or seek an English tutor. "
                                    + "\nThere are English tutors at both centers that are great in covering grammar rules for test prep. ");
                            System.out.println("");
                            System.out.println("Would you like more info about the learning commons or CCAC tutoring services?");
                            ev();
                            answer = sq.next();
                            
                            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("learning commons") || answer.equalsIgnoreCase("tutoring")){
                                System.out.println("The learning commons and tutoring serives are located on the second floor in the library.");
                                System.out.println("The hours of the learning commons are M-Th: 9am to 7pm  |  Friday: 9am to 4:30pm  | Saturday: 10am to 2pm ");
                            }
                        }
                        else {
                            System.out.println("Advice: Try going the tutoring services at CCAC, they can be found at the library.");
                        }
                }
                
                }
            }
            else {
            System.out.println("Please go to the student success office for more information.");
                }
        }
        else if (answer.equalsIgnoreCase("no")) {
            System.out.println("That's great!");
        }
        
    }
    
}

  

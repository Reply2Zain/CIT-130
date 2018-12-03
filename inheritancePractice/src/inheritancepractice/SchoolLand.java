/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author zain.aaban
 */
abstract class Student {

    String name;
    int id;
    int credits;
    boolean graduationStatus;

    Student() {

    }

    Student(String n, int i) {
        name = n;
        id = i;
    }

    abstract boolean canGraduate();
}

// make me work!
class HSStudent extends Student {
    int numPeriodsPerDay;
    String principalName;
    
    @Override 
    public boolean canGraduate(){
        return true ;
    }
}

class CollegeStudent extends Student{
    String major;
    
    @Override
    public boolean canGraduate(){
        
        return true;
    }
}
    
class GradStudent extends CollegeStudent{
        String advisorName;
        String thesisTopic;
        
    
}

public class SchoolLand {

    public static void main(String[] args) {
        CollegeStudent colstudent = new CollegeStudent();
        HSStudent hss = new HSStudent();
        GradStudent grads = new GradStudent();
        Student stud = new HSStudent();
        stud.canGraduate();
        System.out.println(stud);
    }

}
/**
 * @param args the command line arguments
 */

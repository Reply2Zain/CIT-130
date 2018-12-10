/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalityprogramf;

import java.util.HashMap;

/**
 *
 * @author zain.aaban
 */
public class PersonalityDescription {
    HashMap pDescription = new HashMap();
    
    
    /*This constructor is made to put the personality types into a HashMap
    and then only print out the value that the user entered */
    void getPDescription(String InputU){
        
        //Puts each personality type and description into HashMap
        pDescription.put("ISTJ", "" +
                    "Quiet, serious, earn success by thoroughness and dependability. Practical, matter-of-fact, "
        + "\nrealistic, and responsible. Decide logically what should be done and work toward it steadily, regardless of "
        + "\ndistractions. Take pleasure in making everything orderly and organized - their work, their home, their "
        + "\nlife. Value traditions and loyalty.\n");
       pDescription.put("ISFJ", "" +
                    "Quiet, friendly, responsible, and conscientious. Committed and steady in meeting their "
        + "\nobligations. Thorough, painstaking, and accurate. Loyal, considerate, notice and remember specifics "
        + "\nabout people who are important to them, concerned with how others feel. Strive to create"
        + "\n an orderly and harmonious environment at work and at home.\n");
       pDescription.put("INFJ", "" +
                    "Seek meaning and connection in ideas, relationships, and material possessions. Want to "
        + "\nunderstand what motivates people and are insightful about others. Conscientious and committed to "
        + "\ntheir firm values. Develop a clear vision about how best to serve the common good. Organized and "
        + "\ndecisive in implementing their vision.\n");
       pDescription.put("INTJ", "" +
                    "Have original minds and great drive for implementing their ideas and achieving their goals. "
        + "\nQuickly see patterns in external events and develop long-range explanatory perspectives. When "
        + "\ncommitted, organize a job and carry it through. Skeptical and independent, have high standards "
        + "\nof competence and performance - for themselves and others.\n");
       pDescription.put("ISTP", "" +
                    "Tolerant and flexible, quiet observers until a problem appears, then act quickly to find workable "
        + "\nsolutions. Analyze what makes things work and readily get through large amounts of data to isolate the core "
        + "\nof practical problems. Interested in cause and effect, organize facts using logical principles, value efficiency.\n");
       pDescription.put("ISFP", "" +
                    "Quiet, friendly, sensitive, and kind. Enjoy the present moment, what's going on around them. "
        + "\nLike to have their own space and to work within their own time frame. Loyal and committed to their "
        + "\nvalues and to people who are important to them. Dislike disagreements and conflicts, do not force "
        + "\ntheir opinions or values on others.\n");
       pDescription.put("INFP", "" +
                    "Idealistic, loyal to their values and to people who are important to them. Want an external "
        + "\nlife that is congruent with their values. Curious, quick to see possibilities, can be catalysts for "
        + "\nimplementing ideas. Seek to understand people and to help them fulfill their potential. "
        + "\nAdaptable, flexible, and accepting unless a value is threatened.\n");
       pDescription.put("INTP", "" +
                    "Seek to develop logical explanations for everything that interests them. Theoretical and abstract, "
        + "\ninterested more in ideas than in social interaction. Quiet, contained, flexible, and adaptable. Have "
        + "\nunusual ability to focus in depth to solve problems in their area of interest. Skeptical, sometimes "
        + "\ncritical, always analytical.\n");
       pDescription.put("ESTP", "" +
                    "Flexible and tolerant, they take a pragmatic approach focused on immediate results. Theories and "
        + "\nconceptual explanations bore them - they want to act energetically to solve the problem. Focus on the here-"
        + "\nand-now, spontaneous, enjoy each moment that they can be active with others. Enjoy material comforts "
        + "\nand style. Learn best through doing.\n");
       pDescription.put("ESFP", "" +
                    "Outgoing, friendly, and accepting. Exuberant lovers of life, people, and material comforts. Enjoy "
        + "\nworking with others to make things happen. Bring common sense and a realistic approach to their work, and "
        + "\nmake work fun. Flexible and spontaneous, adapt readily to new people and environments. Learn best by trying "
        + "\na new skill with other people.\n");
       pDescription.put("ENFP", "" +
                    "Warmly enthusiastic and imaginative. See life as full of possibilities. Make connections between "
        + "\nevents and information very quickly, and confidently proceed based on the patterns they see. Want a lot of "
        + "\naffirmation from others, and readily give appreciation and support. Spontaneous and flexible, often "
        + "\nrely on their ability to improvise and their verbal fluency.\n");
       pDescription.put("ENTP", "" +
                    "Quick, ingenious, stimulating, alert, and outspoken. Resourceful in solving new and challenging "
        + "\nproblems. Adept at generating conceptual possibilities and then analyzing them strategically. Good at reading "
        + "\nother people. Bored by routine, will seldom do the same thing the same way, apt to turn to one new interest "
        + "\nafter another.\n");
       pDescription.put("ESTJ", "" +
                    "Practical, realistic, matter-of-fact. Decisive, quickly move to implement decisions. Organize "
        + "\nprojects and people to get things done, focus on getting results in the most efficient way possible. Take "
        + "\ncare of routine details. Have a clear set of logical standards, systematically follow them and want others "
        + "\nto also. Forceful in implementing their plans.\n");
       pDescription.put("ESFJ", "" +
                    "Warmhearted, conscientious, and cooperative. Want harmony in their environment, work with determination "
        + "\nto establish it. Like to work with others to complete tasks accurately and on time. Loyal, follow through even in "
        + "\nsmall matters. Notice what others need in their day-by-day lives and try to provide it. Want to be appreciated "
        + "\nfor who they are and for what they contribute.\n");
       pDescription.put("ENFJ", "" +
                    "Warm, empathetic, responsive, and responsible. Highly attuned to the emotions, needs, and motivations of "
        + "\nothers. Find potential in everyone, want to help others fulfill their potential. May act as catalysts for individual "
        + "\nand group growth. Loyal, responsive to praise and criticism. Sociable, facilitate others in a group, and "
        + "\nprovide inspiring leadership.\n");
       pDescription.put("ENTJ", "" +
                    "Frank, decisive, assume leadership readily. Quickly see illogical and inefficient procedures and policies, "
        + "\ndevelop and implement comprehensive systems to solve organizational problems. Enjoy long-term planning and "
        + "\ngoal setting. Usually well informed, well read, enjoy expanding their knowledge and passing it on to others. "
        + "\nForceful in presenting their ideas.\n");
       
        System.out.println("Description: "+ pDescription.get(InputU));
    } // Closes pDescription constructor
    
    
} // Closes PersonalityDescription class

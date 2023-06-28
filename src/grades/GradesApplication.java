package grades;

import util.Input;
import java.util.HashMap;


public class GradesApplication {
    public static void main(String[] args) {
        CommandLine();
    }
    public static void CommandLine(){
        HashMap<String, Student> usernames = new HashMap<>();
        Student brenden = new Student("Brenden", 90);
        brenden.addGrade(95);
        brenden.addGrade(85);
        usernames.put("Brenden-Ferguson", brenden);
        Student shaine = new Student("Shaine", 99);
        shaine.addGrade(95);
        shaine.addGrade(99);
        usernames.put("Shaine-Simon", shaine);
        Student drake = new Student("Drake", 85);
        drake.addGrade(90);
        drake.addGrade(89);
        usernames.put("Drake-Spencer", drake);
        Student stephen = new Student("Stephen", 90);
        stephen.addGrade(90);
        stephen.addGrade(85);
        usernames.put("Stephen-Ford", stephen);
//        System.out.println(usernames.get("Stephen-Ford"));
//        System.out.println(usernames.get("Shaine-Simon"));
//        System.out.println(usernames.get("Brenden-Ferguson"));
//        System.out.println(usernames.get("Drake-Spencer"));
        Input input = new Input();
        StringBuilder studentList = new StringBuilder();

        for (String username : usernames.keySet()) {
            studentList.append(username).append(" ");
        }
        System.out.printf(studentList.toString().trim()+"%n%nWhich student grade would you like to view?%n");
        String userInput = input.getString();
        System.out.println(usernames.get(userInput));
        Boolean userResponse = input.yesNo("Would you like to view another student? [y/n]");
        if(userResponse){
            CommandLine();
        } else{
            System.out.println("Exiting...");
        }
    }
}

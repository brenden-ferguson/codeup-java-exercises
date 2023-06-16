import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String talkToBob = "Say something to Bob: ";
            System.out.println(talkToBob);
            String userInput = scanner.nextLine();
            if (userInput.trim().endsWith("?")) {
                System.out.printf("Bob says :%n Sure.%n");
            } else if (userInput.trim().endsWith("!")) {
                System.out.printf("Bob says :%n Woah, chill out!%n");
            } else if (userInput.trim().equals("")) {
                System.out.printf("Bob says :%n Fine, be that way!%n");
            }else if(userInput.trim().equals("Exit")){
                break;
            } else {
                System.out.printf("Bob says :%n Whatever.%n");
            }
        }
    }
}

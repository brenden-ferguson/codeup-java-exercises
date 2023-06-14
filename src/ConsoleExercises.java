import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();
//        System.out.println(userInput);
        scanner.nextLine();


//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.println("Enter the first word: ");
//        String userInput1 = scanner.nextLine();
//        System.out.println("Enter the second word: ");
//        String userInput2 = scanner.nextLine();
//        System.out.println("Enter the third word: ");
//        String userInput3 = scanner.nextLine();
//        System.out.printf("%s, %s, %s %n", userInput1, userInput2, userInput3);
//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.printf(userSentence);
        System.out.println("Width of room: ");
        String userWidth = scanner.nextLine();
        System.out.println("Length of room: ");
        String userLength = scanner.nextLine();
        System.out.println("Perimeter: " + ((parseInt(userWidth)*2) + (parseInt(userLength)*2)));
        System.out.println("Area: " + (parseInt(userWidth)) * (parseInt(userLength)));

//        Can also use Integer.parseInt(variableName)
    }
}

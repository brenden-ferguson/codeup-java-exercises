package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public Boolean yesNo(){
        String userResponse = scanner.next();
        return (userResponse.equals("yes")) || userResponse.equals("y");
    }
    public Boolean yesNo(String prompt){
        System.out.println(prompt);
        String userResponse = scanner.next();
        return (userResponse.equals("yes")) || userResponse.equals("y");
    }

    public Integer getInt(int min, int max){
        System.out.printf("Enter a number between %s and %s: ", min, max);
        int userInt = scanner.nextInt();
        if(userInt < min || userInt > max){
            return getInt(min,max);
        }
        return userInt;
    }

    public Integer getInt(){
        System.out.println("Enter an Integer: ");
        while (true) {
            try {
                String userInput = getString();
                return Integer.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public Double getDouble(double min, double max){
        System.out.printf("Enter a number between %s and %s: ", min, max);
        double userDub = scanner.nextDouble();
        if(userDub < min || userDub > max){
            return getDouble(min,max);
        }
        return userDub;
    }

    public Double getDouble(){
        System.out.println("Enter a Double: ");
        while(true){
            try{
                String userInput = getString();
                return Double.valueOf(userInput);
            } catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid double.");
            }
        }
    }

}

import java.util.Scanner;

public class HighLow {

    public static int randomNumber(){
        return (int) ((Math.floor(Math.random()* 100)) + 1);
    }

    public static String highAndLow(int randomNumber){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100.");
        int userNumber = scanner.nextInt();
        if(userNumber < 0 || userNumber > 100){
            System.out.printf("Enter a valid number please,%nResetting...");
            highAndLow(randomNumber);
        } else if (userNumber > randomNumber){
            System.out.println("LOWER");
            highAndLow(randomNumber);
        } else if(userNumber < randomNumber){
            System.out.println("HIGHER");
            highAndLow(randomNumber);
        }
        return "GOOD GUESS";
    }



    public static void main(String[] args) {
        highAndLow(randomNumber());
    }
}

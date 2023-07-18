import java.util.Scanner;

public class MethodsExercises {
//    public static long getPower(int base, int exponent) {
//        if (exponent == 0) {
//            return 1;
//        } else if (exponent == 1) {
//            return base;
//        } else if (exponent == 2) {
//            return (long) base * base;
//        }
//        return base * getPower(base, exponent - 1);
//    }

    public static long addition(int base, int increment) {
        return base + increment;
    }

    public static long subtraction(int base, int decrement) {
        return base - decrement;
    }

    public static long multiplication(int base, int number) {
        return (long) base * number;
    }

    public static long division(int base, int number) {
        return base / number;
    }

    public static long remainder(int base, int number) {
        return base % number;
    }


//    Create a method that validates that user input is in a certain range and returns that input as
//    an integer if it is within the given range.
//    If not, prompt the user to input their number again until the input is within range.


    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ", min, max);
        int userNum = scan.nextInt();
        if (userNum < min || userNum > max) {
            return getInteger(min, max);
        }
        return userNum;
    }

    public static long getFactorial(int num) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to continue? [y/n]");
        String userResponse = scan.next();
        long factorial = 1;
        if (userResponse.equals("y")) {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
                System.out.println(i);
            }
        } else {
            System.out.println("Cancelling...");
        }
        return factorial;
    }

    public static String diceRoll(int num){
        Scanner scan = new Scanner(System.in);
        int diceOne = (int) Math.floor(Math.random()*num) + 1;
        int diceTwo = (int) Math.floor(Math.random()*num) + 1;
        String diceTotal = "Your total is: " + (diceOne + diceTwo);
        System.out.println(diceTotal);
        System.out.println("Do you want to roll again? [y/n]");
        String response = scan.next();
        if(response.equals("y")){
            diceRoll(num);
        }
        return "Your final roll is: " + (diceOne + diceTwo);
    }

    public static int randomNumber(){
        int randomNumber = (int) ((Math.floor(Math.random()* 100)) + 1);
        return randomNumber;
    }

    public static String highAndLow(int randomNumber){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100.");
        int userNumber = scan.nextInt();
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
        Scanner scan = new Scanner(System.in);
//        System.out.println(getPower(5, 2));
//        System.out.println(addition(5, 2));
//        System.out.println(subtraction(5, 2));
//        System.out.println(multiplication(5, 2));
//        System.out.println(division(10, 2));
//        System.out.println(remainder(7, 3));
//        System.out.println(getInteger(1, 10));
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = scan.nextInt();
//        System.out.println(getFactorial(userInput));
//        System.out.println("Enter a number for how many sides your dice will have: ");
//        int userDice = scan.nextInt();
//        System.out.println(diceRoll(userDice));

        System.out.println(randomNumber());
    }

}

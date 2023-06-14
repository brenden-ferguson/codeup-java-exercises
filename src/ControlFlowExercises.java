import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//
//        int addByTwo = 0;
//        do{
//            System.out.println(addByTwo);
//            addByTwo += 2;
//        }while(addByTwo <= 100);
//
//        int minusFive = 100;
//        do{
//            System.out.println(minusFive);
//            minusFive -= 5;
//        }while(minusFive >= 0);

//        long multiplyBySelf = 2;
//        do{
//            System.out.println(multiplyBySelf);
//            multiplyBySelf *= multiplyBySelf;
//        }while(multiplyBySelf <= 100000);

//        for(long i = 2; i <= 100000; i*= i){
//            System.out.println(i);
//        }

//    for(int i = 1; i < 100; i++){
//        if(i % 3 == 0 && i % 5 == 0){
//            System.out.println(i + " is FizzBuzz");
//        } else if (i % 3 == 0) {
//            System.out.println(i+ " is Fizz");
//        } else if(i % 5 == 0) {
//            System.out.println(i + " is Buzz");
//        } else {
//            System.out.println(i);
//        }
//    }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int userInt = scanner.nextInt();
//        System.out.println("Here is a table: ");
//        System.out.println("number | squared | cubed ");
//        System.out.println("------ | ------- | -----");
//        for(int i = 1; i <= userInt; i++){
//            if(i*i < 10) {
//                System.out.println((i) + "      | " + (i * i) + "       | " + (i * i * i));
//            } else {
//                System.out.println((i) + "      | " + (i * i) + "      | " + (i * i * i));
//            }
//        }
        System.out.println("Enter a grade: ");
        int userGrade = scanner.nextInt();
        if(userGrade >= 88 && userGrade < 101){
            System.out.println("Your grade is an 'A'");
        } else if (userGrade > 79) {
            System.out.println("Your grade is a 'B'");
        } else if (userGrade > 66) {
            System.out.println("Your grade is a 'C'");
        } else if(userGrade > 59){
            System.out.println("Your grade is a 'D'");
        } else if(userGrade <= 59 && userGrade >= 0){
            System.out.println("You failed. :(");
        } else {
            System.out.println("Invalid grade.");
        }

    }
}

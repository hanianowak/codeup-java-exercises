import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

////        Loop Basics
////
////        While
////
////        Create an integer variable i with a value of 5.
////        Create a while loop that runs so long as i is less than or equal to 15
////        Each loop iteration, output the current value of i, then increment i by one.
////        Your output should look like this:
////        5 6 7 8 9 10 11 12 13 14 15
//
//        int i = 5;
//        while (i<=15)  {
//            System.out.print(i + " ");
//            i++;
//        }
//
//
////        Do While
//
////        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//
//        int a=0;
//        do {
//            System.out.println(a);
//            a += 2;
//        } while (a<=100);
//
//
////        Alter your loop to count backwards by 5's from 100 to -10.
//
//        int b=100;
//        do {
//            System.out.println(b);
//            b -= 5;
//        } while (b>=-10);
//
//
////        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
////        Output should equal:
////        2
////        4
////        16
////        256
////        65536
//
////        long c=2;
////
////        do {
////            System.out.println(k);
//              c*=c;
////
////        } while (c<1000000);
//
//
//
////       * For *
////
////        refactor the previous two exercises to use a for loop instead
//
//        for (int d = 5; d<=15; d++) {
//            System.out.println(i);
//        }
//
//         for (int e=0; e<=100; e+=2 )  {
//             System.out.println(e);
//         }
//
//         for (int f=100; f>=-10; f-=5) {
//             System.out.println(f);
//         }


//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

        for (int g = 1; g <= 100; g++) {
            if (g % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (g % 3 == 0) {
                System.out.println("Fizz");
            } else if (g % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(g);
            }
        }


//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.


//        String heading1 = "Exam_Name";
//        String heading2 = "Exam_Grade";
//
//        System.out.printf( "%-15s %15s %n", heading1, heading2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("do you want to play a game?");
        boolean dec = scanner.nextBoolean();


        while (dec == true) {
            System.out.println("enter a number");
            int num = scanner.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.println(i);
                System.out.println(i * i);
                System.out.println(i * i * i);
            }

            System.out.println("do you want to play a game?");
            dec = scanner.nextBoolean();
        }



//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0


        System.out.println("you want to convert your grade?");
        boolean dec2 = scanner.nextBoolean();

        while (dec2 == true) {
            System.out.println("enter your grade (0-100)");
            int grade = scanner.nextInt();

            if (grade >= 0 && grade <= 100) {
                if (grade <= 59) {
                    System.out.println("you got F :(");
                } else if (grade <= 66) {
                    System.out.println("you got D");
                } else if (grade <= 79) {
                    System.out.println("you got C");
                } else if (grade <= 87) {
                    System.out.println("you got B :(");
                } else {
                    System.out.println("you got A!");
                }
                System.out.println("do you have more grades?");
                dec2 = scanner.nextBoolean();
            }
        }
        
    }
}

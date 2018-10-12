import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
//    Basic Arithmetic
//    Create four separate methods. Each will perform an arithmetic operation:
//    Addition
//            Subtraction
//    Multiplication
//            Division
//    Each function needs to take two parameters/arguments so that the operation can be performed.
//    Test your functions and verify the output.
//    Add a modulus function that finds the modulus of two numbers.
//            Food for thought: What happens if we try to divide by zero? What should happen?


    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int substraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }


//    Create a method that validates that user input is in a certain range
//    The method signature should look like this:
//
//    public static int getInteger(int min, int max);
//    and is used like this:
//
//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.
//
//    Hint: recursion might be helpful here!


//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:

//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24


    public static int factorial(int num) {
        if (num < 1) return 1;
        System.out.println(num);
        return num * factorial(num - 1);
    }


//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.


    public static int randomNumber(int max) {
        int min = 1;
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }


    public static void kostki(int numSides) {
        Scanner scanner = new Scanner(System.in);
        boolean dec2 = true;
        while (dec2) {
            int firstTry = randomNumber(numSides);
            int secondTry = randomNumber(numSides);
            System.out.println("Great! you got " + firstTry + " and " + secondTry);
            System.out.println("want more?");
            dec2 = scanner.nextBoolean();
        }
    }


    public static void main(String[] args) {
        int val = addition(3, 4);
        System.out.println(val);
        int val2 = substraction(3, 5);
        System.out.println(val2);
        int val3 = multiplication(3, 4);
        System.out.println(val3);
        int val4 = division(12, 4);
        System.out.println(val4);


        //dimes
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("How many sides should your dime have?");
        int sides = scanner3.nextInt();
        kostki(sides);


        //factorial exercise
        Scanner scanner = new Scanner(System.in);

        boolean dec = true;
        while (dec) {
            System.out.println("Enter an integer between 1 and 10");
            int input = scanner.nextInt();

            if (input >= 1 && input <= 10) {

                long factorialDone = factorial(input);
                System.out.println(factorialDone);
            }
            System.out.println("want more?");
            dec = scanner.nextBoolean();
        }

    }
}

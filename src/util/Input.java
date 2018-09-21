package util;

import java.util.Scanner;

//Create directory inside of src named util. Inside of util, create a class named Input that has a private property named scanner.
//        When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.

public class Input {
    private Scanner scanner;

    //    The class should have the following methods, all of which return command line input from the user:
    public static void getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String input = scanner.next();
        System.out.println(input);
    }


    //    The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public static boolean yesNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yes or no?");
        String answer = scanner.next();

        return (answer.equals("yes") || answer.equals("y"));
    }


    //    The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
//    The getDouble method should do the same thing, but with decimal numbers.
    public static int getInt(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        int input;

        do {
            System.out.println("Enter integer");
            input = scanner.nextInt();
        } while (input >= min && input <= max);
        return input;
    }


    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer");
        int input = scanner.nextInt();
        return input;
    }


     public static double getDouble(double min, double max) {
         Scanner scanner = new Scanner(System.in);
         double input;

         do {
             System.out.println("Enter double");
             input = scanner.nextInt();
         } while (input >= min && input <= max);
         return input;
     }


    public static double getDouble(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter double");
        double input = scanner.nextInt();
        return input;
    }
}

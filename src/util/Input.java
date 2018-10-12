package util;

import java.util.Scanner;
import java.util.InputMismatchException;

//Create directory inside of src named util. Inside of util, create a class named Input that has a private property named scanner.
//        When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.

//class OutOfRangeExeption


public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    String getString() {
        System.out.println("enter a string");
        String input = scanner.next();
        return input;
    }


    boolean yesNo() {
        System.out.println("yes or no?");
        String answer = scanner.next();

        return (answer.equals("yes") || answer.equals("y"));
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.println("Enter integer");
            input = scanner.nextInt();
        } while (input >= min && input <= max);
        return input;

    }

    double getDouble(double min, double max) {
        double input;

        do {
            System.out.println("Enter double");
            input = scanner.nextDouble();
        } while (input >= min && input <= max);
        return input;

    }


    
    public int getInt() {
        System.out.println("Enter integer");
        try{
        int input = scanner.nextInt();
        return input;
        } catch (InputMismatchException e) {
            System.out.println("wrong nr type");
            scanner.next();
        }
        return 0;
    }


    public double getDouble() {
        System.out.println("Enter double");
        try{
            double input = scanner.nextDouble();
            return input;
        } catch (InputMismatchException e) {
            System.out.println("wrong nr type");
        }
        return 0;
    }


    public double getDouble1(){
        System.out.println("Enter double");
        double input;
        try {
            input = Double.valueOf(getString());
        }  catch (NumberFormatException e) {
            System.out.println("not a number");
            input = getDouble1();
        }
        return input;
    }

//    double getDouble2 (double min, double max) {
//       zrobic
//    }


    }

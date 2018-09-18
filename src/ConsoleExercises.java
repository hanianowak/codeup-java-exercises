import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        The value of pi is approximately 3.14.
        System.out.printf("The value of pi is approximately %.2f", pi);


//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        What happens if you input something that is not an integer?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userNum = scanner.nextInt();
        System.out.printf("your int is: %d", userNum);
        System.out.println("");


//        Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?
        System.out.println("Type 3 words");
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        System.out.printf("your three words: %s %s %s", first, second, third);   //println for every word
        System.out.println("");


//        Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method,
//        then display that sentence back to the user.
//        do you capture all of the words?
        System.out.println("Type a sentence");
        scanner.nextLine();
//        String mySentence = scanner.next();
        String myWholeSentence = scanner.nextLine();
//        System.out.println(mySentence);
        System.out.println(myWholeSentence);


//        Prompt the user to enter values of length and width of a classroom at Codeup.
//        Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
        System.out.println("enter length and width of this classroom ");

//        String input = scanner.nextLine();
//        System.out.println(input);

        String len = scanner.next();
        int length = Integer.parseInt(len);
        String wid = scanner.next();
        int width = Integer.parseInt(wid);

        System.out.println(length);
        System.out.println(width);


//        Display the area and perimeter of that classroom.
        int area = length * width;
        int perimeter = 2 * length + 2 * width;

        System.out.printf("area %s", area);
        System.out.printf("perimeter %s", perimeter);
    }
}

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
//        byte first = 12;
//        short second = 342;
//        int third = 310000123;
//        long fourth = -1222282877;
//        boolean fifth = false;
//        float something4 = -3.4f;
//        double something3 = 3.6f;
//        char something = 'h';
//        String something2 = "Java is awesome";
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        System.out.println(fourth);
//        System.out.println(something3);
//        System.out.println(something);
//        System.out.println(something2);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your first name?");
        String firstName = scanner.next();
        System.out.println("what is your last name?");
        String lastName = scanner.next();

        System.out.format("Hello %s %s", firstName, lastName);


    }
}

import java.sql.SQLOutput;
import java.util.Random;

public class ServerNameGenerator {
//    Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.

//    Add a main method, and inside of your main method select and random noun and adjective
//    and hyphenate the combination and display the generated name to the user.

    public static String[] adjectives = {"fast", "crazy", "shy", "noisy", "quiet", "running", "flying", "sleeping", "dead", "singing"};
    public static String[] nouns = {"duck", "adler", "chicken", "hawk", "turkey", "vulture", "sparrow", "Killdeer", "cardinal", "dove"};


    public static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String returnRandomString(String[] arr) {
        return arr[getRandomNumberInRange(0, 9)];
    }

    public static void main(String[] args) {
        System.out.println("your server name is: " + returnRandomString(adjectives) + "-" + returnRandomString(nouns));
    }


}

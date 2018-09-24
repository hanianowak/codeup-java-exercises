package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        System.out.println("Enter your choice: ");


//        Give the user a list of options for viewing all the movies or viewing movies by category.
//        Use your Input class to get input from the user, and display information based on their choice.
//        If a category is selected, only movies from that category should be displayed.

        Input input = new Input();
        int dec = input.getInt();
        Movie[] allMyMovies = MoviesArray.findAll();


        if (dec == 0) {
            System.out.println("Bye!");
            return;
        }


        if (dec == 1) {
            for (int i = 0; i < allMyMovies.length; i++) {
                System.out.println(allMyMovies[i].getName() + ", category: " + allMyMovies[i].getCategory());
            }
        }

        if (dec == 2) {
            System.out.println("movies in animated category:");
            for (int i = 0; i < allMyMovies.length; i++) {
                if (allMyMovies[i].getCategory().equals("animated")) {
                    System.out.println(allMyMovies[i].getName());
                }
            }
        }

        if (dec == 3) {
            System.out.println("movies in drama category:");
            for (int i = 0; i < allMyMovies.length; i++) {
                if (allMyMovies[i].getCategory().equals("drama")) {
                    System.out.println(allMyMovies[i].getName());
                }
            }
        }

        if (dec == 4) {
            System.out.println("movies in horror category:");
            for (int i = 0; i < allMyMovies.length; i++) {
                if (allMyMovies[i].getCategory().equals("horror")) {
                    System.out.println(allMyMovies[i].getName());
                }
            }
        }

        if (dec == 5) {
            System.out.println("movies in scifi category:");
            for (int i = 0; i < allMyMovies.length; i++) {
                if (allMyMovies[i].getCategory().equals("scifi")) {
                    System.out.println(allMyMovies[i].getName());
                }
            }
        }

    }
}

package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        int dec = 1;

        while (dec!=0) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
            System.out.println("Enter your choice: ");


            Input input = new Input();
            dec = input.getInt();
            Movie[] allMyMovies = MoviesArray.findAll();


            if (dec == 1) {
                for (int i = 0; i < allMyMovies.length; i++) {
                    System.out.println(allMyMovies[i].getName() + ", category: " + allMyMovies[i].getCategory());
                    dec = 1;
                }
            }

            if (dec == 2) {
                System.out.println("movies in animated category:");
                for (int i = 0; i < allMyMovies.length; i++) {
                    if (allMyMovies[i].getCategory().equals("animated")) {
                        System.out.println(allMyMovies[i].getName());
                    }
                    dec=2;
                }
            }

            if (dec == 3) {
                System.out.println("movies in drama category:");
                for (int i = 0; i < allMyMovies.length; i++) {
                    if (allMyMovies[i].getCategory().equals("drama")) {
                        System.out.println(allMyMovies[i].getName());
                    }
                    dec=3;
                }
            }

            if (dec == 4) {
                System.out.println("movies in horror category:");
                for (int i = 0; i < allMyMovies.length; i++) {
                    if (allMyMovies[i].getCategory().equals("horror")) {
                        System.out.println(allMyMovies[i].getName());
                    }
                    dec=4;
                }
            }

            if (dec == 5) {
                System.out.println("movies in scifi category:");
                for (int i = 0; i < allMyMovies.length; i++) {
                    if (allMyMovies[i].getCategory().equals("scifi")) {
                        System.out.println(allMyMovies[i].getName());
                    }
                    dec=5;
                }
            }
        }
    }
}

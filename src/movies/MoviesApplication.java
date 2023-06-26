package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        viewMovies();
    }

    public static void viewMovies() {
        System.out.printf("%nWhat would you like to do? %n %n 0 - exit%n 1 - view all movies%n 2 - view movies in the animated category%n 3 - view movies in the drama category%n 4 - view movies in the horror category%n 5 - view movies in the scifi category%n%n");
        Input input = new Input();
        int userInput = input.getInt();
        Movie[] movies = MoviesArray.findAll();
        if (userInput == 1) {
            for (Movie movie : movies) {
                System.out.printf("Title: %s, Category: %s %n", movie.getName(), movie.getCategory());
            }
            viewMovies();
        } else if (userInput == 2) {
            for (Movie movie : movies) {
                if ((movie.getCategory()).equals("animated")) {
                    System.out.printf("Title: %s, Category: %s%n", movie.getName(), movie.getCategory());
                }
            }
            viewMovies();
        } else if (userInput == 3) {
            for (Movie movie : movies) {
                if ((movie.getCategory()).equals("drama")) {
                    System.out.printf("Title: %s, Category: %s%n", movie.getName(), movie.getCategory());
                }
            }
            viewMovies();
        } else if (userInput == 4) {
            for (Movie movie : movies) {
                if ((movie.getCategory()).equals("horror")) {
                    System.out.printf("Title: %s, Category: %s%n", movie.getName(), movie.getCategory());
                }
            }
            viewMovies();
        } else if (userInput == 5) {
            for (Movie movie : movies) {
                if ((movie.getCategory()).equals("scifi")) {
                    System.out.printf("Title: %s, Category: %s%n", movie.getName(), movie.getCategory());
                }
            }
            viewMovies();
        } else if (userInput == 0) {
            System.out.println("Exiting...");
        }
    }
}

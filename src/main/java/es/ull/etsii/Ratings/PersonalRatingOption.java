package es.ull.etsii.Ratings;

import es.ull.etsii.Movies.Movie;
import es.ull.etsii.Movies.MovieDatabase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class PersonalRatingOption {

    private static String userName;
    private static String fileName;

    public static void menu(){

        System.out.print("¿Desea hacer su propia valoración? y/n: ");
        Scanner sc = new Scanner(System.in);
        char cScan = sc.next().charAt(0);
        if (cScan == 'y') {
            System.out.print("Introduzca nombre de usuario: ");
            sc = new Scanner(System.in);
            userName = sc.nextLine().toLowerCase();
            fileName = "src/main/resources/personalRatings/" + userName + "_rating.csv";
            Boolean exitOption = false;
            while (!exitOption) {
                searchTitle();
                System.out.print("¿Desea valorar otra película? y/n: ");
                cScan = sc.next().charAt(0);
                if (cScan != 'y') {
                    System.out.println("Saliendo...");
                    exitOption = true;
                }
            }
        }
    }
    private static void searchTitle(){
        System.out.print("Introduzca el título de la película: ");
        Scanner sc = new Scanner(System.in);
        String title = sc.next();
        ArrayList<Movie> myMovies = MovieDatabase.getMoviesByTitle(title);

        System.out.println("¿Desea valorar alguna de estas películas?");
        for (int i = 0; i < myMovies.size(); i++){
            System.out.println((i+1)+". "+myMovies.get(i).getTitle());
        }
        System.out.print("¿y/n?: ");
        char cScan = sc.next().charAt(0);

        if (cScan == 'y') {
            rateMovie(myMovies);
        }
    }

    private static void rateMovie(ArrayList<Movie> movies){

        Scanner sc = new Scanner(System.in);
        int movieIndex = -1;
        while((movieIndex < 0) || (movieIndex >= movies.size())) {
            System.out.print("Introduzca el numero de película que quiere valorar " +
                    "según su índice en el apartado anterior: ");
            movieIndex = sc.nextInt() - 1;
        }

        Movie movieSelected = movies.get(movieIndex);
        Integer rate = -1;
        while((rate < 0) || (rate >10)) {
            System.out.print("Valore " + movieSelected.getTitle() + ": ");
            rate = sc.nextInt();
        }
        writeInFile(movieSelected,rate);
    }

    private static void writeInFile(Movie m, Integer rate) {
        FileWriter f = null;
        try{
            File af = new File(fileName);
            if (!af.isFile()) {
                f = new FileWriter(af,true);
                f.write("user_name,movie_id,rating\n");
                f.close();
            }
            f = new FileWriter(af,true);
            f.write(userName+","+m.getID()+","+rate+"\n");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

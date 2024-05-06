package ui;
import model.*;

import java.util.Scanner;

public class Menu {
    public static void showMenu(){
        System.out.println("Welcome to the Media Menu");
        System.out.println("Please select one of the following options:");
        int response = 0;
        String options = """
                1) New Movie
                2) New Serie
                3) How many time you need to watch all the media?
                4) Exit
                """;
        do{
            System.out.println(options);
            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();
            switch(response){
                case 1:
                    System.out.println("Please enter the name of the movie you wish to watch: ");
                    Movies userMovies = new Movies(sc.next());
                    userMovies.writeTechnicalFile();
                    userMovies.readTechnicalFile();
                    break;
                case 2:
                    System.out.println("Please enter the name of the movie you wish to watch: ");
                    Serie userSerie = new Serie(sc.next());
                    userSerie.writeTechnicalFileSerie();
                    userSerie.readTechnicalFileSerie();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Thank you for using Media Menu!");
                    break;
                default:
                    System.out.println("Please select a valid option!");
            }
        }while(response != 4);
    }
}

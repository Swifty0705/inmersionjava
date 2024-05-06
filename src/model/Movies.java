package model;
import java.util.Scanner;

public class Movies extends Media {

    Scanner sc = new Scanner(System.in);

    public Movies(String name) {
        super(name);
    }
    public void writeTechnicalFileMovies(){
        super.writeTechnicalFile();
        System.out.println("write the duration (on minutes): ");
        super.setDurationTimeOnMinutes(sc.nextInt());
    }

}

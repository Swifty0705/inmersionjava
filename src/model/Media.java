package model;
import java.util.Scanner;

public class Media {
    private String name;
    private int releaseDate;
    private double rating;
    private boolean basicPlanIncluded;
    private String genre;
    private String sinopsis;
    private int durationTimeOnMinutes;

    Scanner sc = new Scanner(System.in);

    public Media(String name) {
        this.name = name;
    }

    public String getName() {
        return "Name: "+name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return "Date (year): " +releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return "Rating: " +rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String isBasicPlanIncluded() {
        return "Is this movie included in the Basic Plan?: " + basicPlanIncluded;
    }

    public void setBasicPlanIncluded(boolean basicPlanIncluded) {
        this.basicPlanIncluded = basicPlanIncluded;
    }

    public String getGenre() {
        return "Genre: " + genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopsis() {
        return "Sinopsis: "+ sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDurationTimeOnMinutes() {
        return "Time: " + durationTimeOnMinutes + " mins";
    }

    public void setDurationTimeOnMinutes(int durationTimeOnMinutes) {
        this.durationTimeOnMinutes = durationTimeOnMinutes;
    }

    public void writeTechnicalFile(){
        System.out.println("Write the year of release: ");
        this.setReleaseDate(sc.nextInt());
        System.out.println("Write the rating: ");
        this.setRating(sc.nextDouble());
        System.out.println("Is this movie included in the Basic Plan?: ");
        this.setBasicPlanIncluded(sc.nextBoolean());
        System.out.println("write the genre: ");
        this.setGenre(sc.next());

        System.out.println("write the sinopsis: ");
        this.setSinopsis(sc.next());
    }
    public void readTechnicalFile(){
        System.out.println("Ficha técnica de " + this.name);
        System.out.println(this.getName());
        System.out.println(this.getReleaseDate());
        System.out.println(this.getRating());
        System.out.println(this.getGenre());
        System.out.println(this.getDurationTimeOnMinutes());
        System.out.println(this.getSinopsis());
    }

}

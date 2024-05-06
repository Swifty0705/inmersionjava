package model;

public class Serie extends Media{
    private int seasons;
    private int episodesBySeasons;
    private int durationEpisodes;

    public Serie(String name) {
        super(name);
    }

    public String getEpisodesBySeasons() {
        return "Episodes: " +episodesBySeasons;
    }

    public void setEpisodesBySeasons(int episodesBySeasons) {
        this.episodesBySeasons = episodesBySeasons;
    }

    public String getDurationEpisodes() {
        return "Episode's duration: "+ durationEpisodes;
    }

    public void setDurationEpisodes(int durationEpisodes) {
        this.durationEpisodes = durationEpisodes;
    }

    public String getSeasons() {
        return "Seasons: " +seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    @Override
    public String getDurationTimeOnMinutes() {
        return "Duration: " + (seasons * durationEpisodes * episodesBySeasons);
    }

    public void writeTechnicalFileSerie(){
        super.writeTechnicalFile();
        System.out.println("Write the number of seasons:");
        this.setSeasons(sc.nextInt());
        System.out.println("Write the number of episodes:");
        this.setEpisodesBySeasons(sc.nextInt());
        System.out.println("Write the episodes duration");
        this.setDurationEpisodes(sc.nextInt());
    }

    public void readTechnicalFileSerie(){
        super.readTechnicalFile();
        System.out.println(getSeasons());
        System.out.println(getEpisodesBySeasons());
        System.out.println(getDurationEpisodes());

    }
}

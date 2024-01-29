public class Song {
    // Instance variables
    private String title; // Title of the song
    private Artist artist; // Name of the artist of the song
    private int playCount; // Number of times the song has been played
    private boolean downloadable; // Indicates if the song can be downloaded
    private int downloads; // Number of times the song has been downloaded
    private int durationInSeconds; // Duration of the song in seconds

    // Constructor
    public Song(String title, Artist artist, int durationInSeconds, boolean downloadable) {
        this.title = title; // Sets the song's title
        this.artist = artist; // Sets the artist's name
        this.durationInSeconds = durationInSeconds; // Sets the duration of the song
        this.playCount = 0; // Initializes play count to 0
        this.downloadable = downloadable; // Sets whether the song is downloadable
        this.downloads = 0; // Initializes the download count to 0
    }

    // Getters and Setters
    public String getTitle() {
        return title; // Returns the title of the song
    }

    public void setTitle(String title) {
        this.title = title; // Sets the title of the song
    }

    public Artist getArtist() {
        return artist; // Returns the name of the artist
    }

    public void setArtist(Artist artist) {
        this.artist = artist; // Sets the artist's name
    }

    public int getPlayCount() {
        return playCount; // Returns the play count of the song
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount; // Sets the play count of the song
    }

    public boolean isDownloadable() {
        return downloadable; // Returns whether the song is downloadable
    }

    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable; // Sets whether the song is downloadable
    }

    public int getDownloads() {
        return downloads; // Returns the download count of the song
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads; // Sets the download count of the song
    }

    public int getDurationInSeconds() {
        return durationInSeconds; // Returns the duration of the song in seconds
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds; // Sets the duration of the song
    }

    // Method to increment play count
    public void play() {
        playCount++; // Increments the play count by 1
    }

    // Method to handle song download
    public String download() {
        if (downloadable) { // Checks if the song is downloadable
            downloads++; // Increments the download count
            return "Download link for " + title + " by " + artist; // Returns a download link
        } else {
            return "Song is not downloadable."; // Returns a message if the song is not downloadable
        }
    }

    // Method to format the duration for display
    public String getFormattedDuration() {
        int minutes = durationInSeconds / 60; // Calculates the minutes part of the duration
        int seconds = durationInSeconds % 60; // Calculates the seconds part of the duration
        return String.format("%02d:%02d", minutes, seconds); // Formats and returns the duration as a string
    }
}

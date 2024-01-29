import java.util.ArrayList;

// Class declaration for 'Playlist'
public class Playlist {
    private String name; // Name of the playlist
    private ArrayList<Song> songs; // List to store songs in the playlist

    // Constructor
    public Playlist(String name) {
        this.name = name; // Initializes the playlist's name
        this.songs = new ArrayList<>(); // Initializes the list of songs as an empty ArrayList
    }

    // Method to add a song to the playlist
    public void addSong(Song song) {
        songs.add(song); // Adds the provided song to the playlist
    }

    // Method to remove a song from the playlist
    public void removeSong(Song song) {
        songs.remove(song); // Removes the specified song from the playlist
    }

    // Method to calculate and return the total playtime of the playlist
    public String getTotalPlaytime() {
        int totalSeconds = 0; // Initialize a variable to store total duration in seconds
        // Loop through each song in the playlist and sum their durations
        for (Song song : songs) {
            totalSeconds += song.getDurationInSeconds();
        }
        // Convert total duration from seconds to hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        // Format and return the total playtime as a string
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Getter for the playlist's name
    public String getName() {
        return name; // Returns the name of the playlist
    }

    // Setter for the playlist's name
    public void setName(String name) {
        this.name = name; // Sets the playlist's name to the provided string
    }

    // Getter for the songs in the playlist
    public ArrayList<Song> getSongs() {
        return songs; // Returns the list of songs in the playlist
    }

    // Setter for the songs in the playlist (optional, use with caution)
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs; // Replaces the current list of songs with the provided list
    }
}

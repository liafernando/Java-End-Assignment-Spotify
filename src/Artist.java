import java.util.ArrayList;
import java.util.List;

// Class declaration for 'Artist'
public class Artist { // Instance variables
    private String name; // Name of the artist

    private List<Song> songs; // List to store songs by the artist

    // Constructor
    public Artist(String name) {
        this.name = name; // Initialize the artist's name
        this.songs = new ArrayList<>(); // Initialize the list of songs as an empty ArrayList
    }

    // Method to add a song to the artist
    public void addSong(Song song) {
        songs.add(song); // Add the provided song to the artist's song list
    }

    // Getter for the artist's name
    public String getName() {
        return name; // Return the artist's name
    }

    // Setter for the artist's name
    public void setName(String name) {
        this.name = name; // Update the artist's name with the provided name
    }

    // Getter for the artist's songs
    public List<Song> getSongs() {
        return songs; // Return the list of songs by the artist
    }

    // Setter for the artist's songs
    public void setSongs(List<Song> songs) {
        this.songs = songs; // Update the artist's song list with the provided list of songs
    }
    public String toString() {
        return name; // Return the artist's name
    }
}

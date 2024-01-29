import java.util.ArrayList;
import java.util.List;

// Class declaration for 'Player'
public class Player {
    // Instance variables
    private Song currentSong; // Current song being played or selected
    private MostPlayedPlaylist mostPlayedPlaylist; // Playlist of the most played songs
    private List<Song> allSongs; // List to store all songs available in the player

    // Constructor
    public Player() {
        this.mostPlayedPlaylist = new MostPlayedPlaylist(); // Initializing mostPlayedPlaylist
        this.allSongs = new ArrayList<>(); // Initializing allSongs as an empty ArrayList
    }

    // Method to select a song
    public Song selectSong(Song song) {
        currentSong = song; // Set the current song to the one passed as argument
        // Print the selected song details
        System.out.println("Song selected: " + currentSong.getTitle() +
                " by " + currentSong.getArtist());

        return currentSong;
    }

    // Method to play the current song
    public void playSong() {
        if (currentSong != null) { // Check if a song is selected
            currentSong.play(); // Play the current song
            showPlayingSongDetails(); // Display details of the playing song
            // Add song to mostPlayedPlaylist if it's played 5 times
            if (currentSong.getPlayCount() == 5) {
                mostPlayedPlaylist.addSong(currentSong);
            }
        } else {
            System.out.println("No song selected."); // Message if no song is selected
        }
    }

    // Private method to show details of the currently playing song
    private void showPlayingSongDetails() {
        if (currentSong != null) { // Check if a song is playing
            // Display the currently playing song details
            System.out.println("Now playing: " + currentSong.getTitle() +
                    " by " + currentSong.getArtist() +
                    " Duration: " + formatDuration(currentSong.getDurationInSeconds()));
        } else {
            System.out.println("No song is currently playing."); // Message if no song is playing
        }
    }

    // Method to add a song to the player
    public void addSong(Song song) {
        allSongs.add(song); // Add the provided song to the list of all songs
    }

    // Method to get the most downloaded song
    public Song getMostDownloadedSong() {
        Song mostDownloaded = null; // Initialize variable to store the most downloaded song
        int maxDownloads = 0; // Variable to keep track of maximum downloads
        // Loop through all songs to find the most downloaded one
        for (Song song : allSongs) {
            if (song.getDownloads() > maxDownloads) {
                maxDownloads = song.getDownloads(); // Update maxDownloads
                mostDownloaded = song; // Update mostDownloaded
            }
        }
        return mostDownloaded; // Return the most downloaded song
    }

    // Private method to format the duration for display
    private String formatDuration(int durationInSeconds) {
        int minutes = durationInSeconds / 60; // Calculate minutes
        int seconds = durationInSeconds % 60; // Calculate seconds
        return String.format("%02d:%02d", minutes, seconds); // Return formatted duration
    }

    // Method to pause the current song
    public void pauseSong() {
        if (currentSong != null) { // Check if a song is selected
            System.out.println("Song paused: " + currentSong.getTitle()); // Display pause message
        }
    }

    // Method to resume the current song
    public void resumeSong() {
        if (currentSong != null) { // Check if a song is selected
            System.out.println("Song resumed: " + currentSong.getTitle()); // Display resume message
        }
    }

    // Method to skip to the next song
    public void skipToNextSong() {
        // Implementation depends on the data structure for a queue or playlist
    }

    // Method to show details of a playlist
    public void showPlaylistDetails(Playlist playlist) {
        System.out.println("Playlist: " + playlist.getName()); // Print playlist name
        // Loop through songs in the playlist and print their details
        for (Song song : playlist.getSongs()) {
            System.out.println("- " + song.getTitle() + " by " + song.getArtist());
        }
        // Print the total duration of the playlist
        System.out.println("Total Duration: " + playlist.getTotalPlaytime());
    }

    // Method to handle requests from a user
    public void handleUserRequest(User user) {
        if (user.isPremium()) {
            // Implementation for handling premium user requests
        } else {
            // Implementation for handling regular user requests
        }
    }

    // Method to update the most played playlist
    public void updateMostPlayedPlaylist() {
        // Loop through all songs and add to mostPlayedPlaylist if conditions are met
        for (Song song : allSongs) {
            if (song.getPlayCount() >= 5 && !mostPlayedPlaylist.getSongs().contains(song)) {
                mostPlayedPlaylist.addSong(song);
                // Remove the first song if playlist size exceeds the maximum
                if (mostPlayedPlaylist.getSongs().size() > MostPlayedPlaylist.getMaxSongs()) {
                    mostPlayedPlaylist.getSongs().remove(0);
                }
            }
        }
    }

    // Method to get the most played playlist
    public MostPlayedPlaylist getMostPlayedPlaylist() {
        return mostPlayedPlaylist; // Return the mostPlayedPlaylist
    }
}

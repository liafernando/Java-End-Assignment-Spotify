public class MostPlayedPlaylist extends Playlist {
    private static final int MAX_SONGS = 10; // Constant defining the maximum number of songs in the playlist

    // Constructor
    public MostPlayedPlaylist() {
        super("Most Played"); // Calls the constructor of the superclass (Playlist) with the name "Most Played"
    }

    // Override the addSong method from the Playlist class
    @Override
    public void addSong(Song song) {
        // Add a song to the playlist only if it has been played at least 5 times and the playlist is not full
        if (song.getPlayCount() >= 5 && this.getSongs().size() < MAX_SONGS) {
            super.addSong(song); // Calls the addSong method of the superclass (Playlist) to add the song
        }
    }

    // Public getter for MAX_SONGS
    public static int getMaxSongs() {
        return MAX_SONGS; // Returns the maximum number of songs allowed in the playlist
    }
}

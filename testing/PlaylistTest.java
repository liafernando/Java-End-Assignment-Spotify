import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class PlaylistTest {

    Artist artist = new Artist("Selena Gomez");


    @Test
    void addSong() {
        Playlist playlist = new Playlist("Test Playlist");
        Song song = new Song("Test Song", this.artist, 200, true);
        playlist.addSong(song);
        // Assert that the song is added to the playlist
        assertTrue(playlist.getSongs().contains(song), "The song should be added to the playlist.");
    }

    @Test
    void removeSong() {
        Playlist playlist = new Playlist("Test Playlist");
        Song song = new Song("Test Song", this.artist, 200, true);
        playlist.addSong(song);
        playlist.removeSong(song);
        // Assert that the song is removed from the playlist
        assertFalse(playlist.getSongs().contains(song), "The song should be removed from the playlist.");
    }

    @Test
    void getTotalPlaytime() {
        Playlist playlist = new Playlist("Test Playlist");
        Song song1 = new Song("Song 1", this.artist, 120, true); // 2 minutes
        Song song2 = new Song("Song 2", this.artist, 150, true); // 2.5 minutes
        playlist.addSong(song1);
        playlist.addSong(song2);
        String expectedTotalPlaytime = "00:04:30"; // 4 minutes and 30 seconds
        assertEquals(expectedTotalPlaytime, playlist.getTotalPlaytime(), "Total playtime should be calculated correctly.");
    }

    @Test
    void getName() {
        Playlist playlist = new Playlist("Test Playlist");
        assertEquals("Test Playlist", playlist.getName(), "The getName method should return the correct name.");
    }

    @Test
    void setName() {
        Playlist playlist = new Playlist("Test Playlist");
        playlist.setName("New Name");
        assertEquals("New Name", playlist.getName(), "The setName method should update the playlist name.");
    }

    @Test
    void getSongs() {
        Playlist playlist = new Playlist("Test Playlist");
        Song song = new Song("Test Song", this.artist, 200, true);
        playlist.addSong(song);
        // Assert that the getSongs method returns a list containing the added song
        assertTrue(playlist.getSongs().contains(song), "The getSongs method should return a list containing the added song.");
    }

    @Test
    void setSongs() {
        Playlist playlist = new Playlist("Test Playlist");
        ArrayList<Song> newSongs = new ArrayList<>();
        Song song1 = new Song("Song 1", this.artist, 200, true);
        Song song2 = new Song("Song 2", this.artist, 200, true);
        newSongs.add(song1);
        newSongs.add(song2);
        playlist.setSongs(newSongs);
        // Assert that the setSongs method updates the song list correctly
        assertEquals(newSongs, playlist.getSongs(), "The setSongs method should update the song list correctly.");
        assertTrue(playlist.getSongs().containsAll(newSongs), "The playlist should contain all the songs in the new list.");
    }
}

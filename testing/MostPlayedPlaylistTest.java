import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MostPlayedPlaylistTest {

    @Test
    void addSong() {
        MostPlayedPlaylist playlist = new MostPlayedPlaylist();
        Artist artist = new Artist("Selena Gomez");
        Song song1 = new Song("Song 1", artist, 300, true);
        Song song2 = new Song("Song 2", artist, 250, true);

        // Set play count less than 5
        song1.setPlayCount(3);
        playlist.addSong(song1);
        assertEquals(0, playlist.getSongs().size(), "Song with play count less than 5 should not be added.");

        // Set play count to 5 and add
        song1.setPlayCount(5);
        playlist.addSong(song1);
        assertEquals(1, playlist.getSongs().size(), "Song with play count 5 should be added.");
        assertTrue(playlist.getSongs().contains(song1), "Playlist should contain song1.");

        // Add more songs to test the MAX_SONGS limit
        for (int i = 0; i < 9; i++) {
            Song song = new Song("Song " + (i + 3), artist, 200 + i * 10, true);
            song.setPlayCount(5);
            playlist.addSong(song);
        }

        // Test adding a song when playlist is full
        song2.setPlayCount(5);
        playlist.addSong(song2);
        assertEquals(10, playlist.getSongs().size(), "No more songs should be added once the maximum limit is reached.");
        assertFalse(playlist.getSongs().contains(song2), "Playlist should not contain song2 when full.");
    }

    @Test
    void getMaxSongs() {
        assertEquals(10, MostPlayedPlaylist.getMaxSongs(), "The maximum number of songs should be 10.");
    }
}

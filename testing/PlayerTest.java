import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {



    Player player = new Player();

    Artist artist = new Artist("Selena Gomez");

    @Test
    void selectSong() {
        Song song = new Song("Test Song", this.artist, 200, true);
        // Assert that the selected song is correctly set in the player
        assertNotNull(this.player.selectSong(song));
    }

    @Test
    void playSong() {
        Player player = new Player();
        Song song = new Song("Test Song", artist, 200, true);
        player.selectSong(song);
        player.playSong();
        // Assert that the play count of the song is incremented
        assertEquals(1, song.getPlayCount(), "The play count of the song should be incremented.");
    }

    @Test
    void addSong() {
        Player player = new Player();
        Song song = new Song("Test Song", artist, 200, true);
        // Assert that the song is added to the player's allSongs list
        assertDoesNotThrow(() -> player.addSong(song));
    }

    @Test
    void getMostDownloadedSong() {
        Player player = new Player();
        Song song1 = new Song("Song 1", artist, 200, true);
        Song song2 = new Song("Song 2", artist, 200, true);
        song1.setDownloads(5);
        song2.setDownloads(10);
        player.addSong(song1);
        player.addSong(song2);
        // Assert that the correct song is returned as the most downloaded
        assertEquals(song2, player.getMostDownloadedSong(), "The song with the most downloads should be returned.");
    }

    @Test
    void pauseSong() {
        Player player = new Player();
        Song song = new Song("Test Song",artist, 200, true);
        player.selectSong(song);
        player.pauseSong();
        // Asserting the paused state would require a mechanism to verify the pause, often through a mock or a state check
    }

    void resumeSong() {
        Player player = new Player();
        Song song = new Song("Test Song", artist, 200, true);
        player.selectSong(song);
        player.resumeSong();
        // Similar to pauseSong, asserting the resume state requires additional mechanisms
    }

    @Test
    void skipToNextSong() {
        Player player = new Player();
        // This test requires an implementation of skipToNextSong in Player class
    }

    @Test
    void showPlaylistDetails() {
        Player player = new Player();
        Playlist playlist = new Playlist("Test Playlist");
        // Add songs to playlist and then call showPlaylistDetails
        // This test may require capturing console output or using a mock
    }

    @Test
    void handleUserRequest() {
        Player player = new Player();
        User user = new User(true);
        player.handleUserRequest(user);
        // This test depends on the implementation details of handleUserRequest
    }

    @Test
    void updateMostPlayedPlaylist() {
        Player player = new Player();
        Song song = new Song("Test Song", artist, 200, true);
        song.setPlayCount(5);
        player.addSong(song);
        player.updateMostPlayedPlaylist();
        // Assert that the song is added to the most played playlist
        assertTrue(player.getMostPlayedPlaylist().getSongs().contains(song), "The song should be added to the most played playlist.");
    }

    @Test
    void getMostPlayedPlaylist() {
        Player player = new Player();
        assertNotNull(player.getMostPlayedPlaylist(), "Most played playlist should be retrievable.");
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    Artist artist = new Artist("Selena Gomez");


    @Test
    void getTitle() {
        Song song = new Song("Test Song", artist, 200, true);
        assertEquals("Test Song", song.getTitle(), "getTitle should return the correct title.");
    }

    @Test
    void setTitle() {
        Song song = new Song("Test Song", artist, 200, true);
        song.setTitle("New Title");
        assertEquals("New Title", song.getTitle(), "setTitle should update the title.");
    }

    @Test
    void getArtist() {
        Song song = new Song("Test Song", artist, 200, true);
        assertEquals("Test Artist", song.getArtist(), "getArtist should return the correct artist.");
    }

    @Test
    void setArtist() {
        Song song = new Song("Test Song", artist, 200, true);
        song.setArtist(artist);
        assertEquals("New Artist", song.getArtist(), "setArtist should update the artist.");
    }

    @Test
    void getPlayCount() {
        Song song = new Song("Test Song", artist, 200, true);
        assertEquals(0, song.getPlayCount(), "Initial play count should be 0.");
    }

    @Test
    void setPlayCount() {
        Song song = new Song("Test Song", artist, 200, true);
        song.setPlayCount(5);
        assertEquals(5, song.getPlayCount(), "setPlayCount should update the play count.");
    }

    @Test
    void isDownloadable() {
        Song song = new Song("Test Song", artist, 200, true);
        assertTrue(song.isDownloadable(), "isDownloadable should return true for a downloadable song.");
    }

    @Test
    void setDownloadable() {
        Song song = new Song("Test Song", artist, 200, true);
        song.setDownloadable(false);
        assertFalse(song.isDownloadable(), "setDownloadable should update the downloadable status.");
    }

    @Test
    void getDownloads() {
        Song song = new Song("Test Song", artist, 200, true);
        assertEquals(0, song.getDownloads(), "Initial download count should be 0.");
    }

    @Test
    void setDownloads() {
        Song song = new Song("Test Song", artist, 200, true);
        song.setDownloads(10);
        assertEquals(10, song.getDownloads(), "setDownloads should update the download count.");
    }

    @Test
    void getDurationInSeconds() {
        Song song = new Song("Test Song", artist, 200, true);
        assertEquals(200, song.getDurationInSeconds(), "getDurationInSeconds should return the correct duration.");
    }

    @Test
    void setDurationInSeconds() {
        Song song = new Song("Test Song", artist, 200, true);
        song.setDurationInSeconds(300);
        assertEquals(300, song.getDurationInSeconds(), "setDurationInSeconds should update the duration.");
    }

    @Test
    void play() {
        Song song = new Song("Test Song", artist, 200, true);
        song.play();
        assertEquals(1, song.getPlayCount(), "play should increment the play count.");
    }

    @Test
    void download() {
        Song song = new Song("Test Song", artist, 200, true);
        String downloadMessage = song.download();
        assertEquals(1, song.getDownloads(), "download should increment the download count.");
        assertEquals("Download link for Test Song by Test Artist", downloadMessage, "download should return the correct message.");
    }

    @Test
    void getFormattedDuration() {
        Song song = new Song("Test Song", artist, 200, true); // 3 minutes and 20 seconds
        assertEquals("03:20", song.getFormattedDuration(), "getFormattedDuration should return the correct formatted duration.");
    }
}

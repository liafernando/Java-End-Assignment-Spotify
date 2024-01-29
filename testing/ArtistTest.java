import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ArtistTest {

    Artist artist = new Artist("Selena Gomez");
    Song song = new Song("Come Down", this.artist, 200, true);


    @Test
    void addSong() {
        assertDoesNotThrow(() -> this.artist.addSong(song));
    }

    @Test
    void getName() {

        assert(Objects.equals(this.artist.getName(), "Selena Gomez"));
        // OR
        // assert(this.artist.getName() == "Selena Gomez") <-- less safe

    }

    @Test
    void setName() {
        this.artist.setName("Ariana Grande");
        assert(Objects.equals(this.artist.getName(), "Ariana Grande"));
    }

    @Test
    void getSongs() {
        this.artist.addSong(song);
        assertNotNull(this.artist.getSongs());

    }

    @Test
    void setSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(this.song);
        assertDoesNotThrow(() -> this.artist.setSongs(songs));;
    }
}
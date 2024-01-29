public class Main {
    public static void main(String[] args) {
        // Create artists
        Artist artist1 = new Artist("Selena Gomez");
        Artist artist2 = new Artist("Arina Grande");

        // Create songs
        Song song1 = new Song("Song 1",artist1, 300, true);
        Song song2 = new Song("Song 2", artist2, 250, false);
        artist1.addSong(song1);
        artist2.addSong(song2);

        // Create playlists
        Playlist customPlaylist = new Playlist("Custom Playlist");
        customPlaylist.addSong(song1);
        customPlaylist.addSong(song2);

        // Create player instance
        Player player = new Player();
        player.addSong(song1);
        player.addSong(song2);

        // Create users
        User user1 = new User(true); // Premium user
        User user2 = new User(false); // Non-premium user

        // Select and play a song
        player.selectSong(song1);
        player.playSong();
        player.playSong(); // Play the song multiple times to ensure it's added to 'Most Played' playlist

        // For premium user, download a song
        if (user1.isPremium()) {
            System.out.println(song1.download());
        } else {
            System.out.println("Please upgrade to premium to download songs.");
        }

        // Display 'Most Played' playlist
        MostPlayedPlaylist mostPlayedPlaylist = player.getMostPlayedPlaylist();
        System.out.println("Most Played Playlist:");
        for (Song s : mostPlayedPlaylist.getSongs()) {
            System.out.println(s.getTitle() + " by " + s.getArtist());
        }

        // Display the total playtime of custom playlist
        String totalPlaytime = customPlaylist.getTotalPlaytime();
        System.out.println("Total playtime of '" + customPlaylist.getName() + "': " + totalPlaytime);
    }
}


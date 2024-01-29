Start Document Spotify

Start document of Ameli Fernando, Student number: 5078970

Problem Description

The Spotify company asked you to develop a lite version of the Spotify application. Spotify is the most used music stream service now a days. The application should consists of the player itself, songs, artists and playlists. When a song is played 5 times it should be added to the 'Most played' playlist. This playlist has a maximum of 10 songs. The user should be able to add songs to a custom playlist. The custom playlist has a name that the user can specify. It should be possible to retrieve the total playtime (hh:mm:ss) of a playlist. When the user selects a song the client should show which song is playing, the duration of the song (mm:ss) and the artist. Premium users have the possibility to download some songs. Not all songs are downloadable. When a song is downloadable it gives a download link and also tracks the amount of downloads. The player should be able to return the most downloaded song.

Input

In this section the input and output of the application will be described.

In the table below all the input (that the user has to input in order to make the application work) are described.

| Case                | Conditions                                | Type    |
| ------------------- | ----------------------------------------- | ------- |
| Song Title          | Title of the song to be played or managed | String  |
| Artist Name         | Name of the artist for the song           | String  |
| Duration in Seconds | Length of the song in seconds             | Integer |
| Downloadable Status | Whether the song is downloadable or not   | Boolean |
| User Premium Status | Whether the user is a premium subscriber  | Boolean |

Output

| Case                          | Type         |
| ----------------------------- | ------------ |
| Current Song Playing          | String       |
| Playlist Total Duration       | String       |
| Most Downloaded Song          | String       |
| Most Played Songs List        | List<String> |
| Download Link (if applicable) | String       |

Calculations

The application will perform the following calculations:

| Case                     | Description                                                |
| ------------------------ | ---------------------------------------------------------- |
| Play Count Increment     | Each time a song is played, its play count is incremented. |
| Playlist Duration        | Total duration of all songs in a playlist is calculated.   |
| Most Downloaded Song     | Determines which song has the highest number of downloads. |
| Most Played Songs Update | Updates the 'Most Played' playlist based on play counts.   |

Remarks

- Input is validated to ensure song and artist names are correct.
- All interactions with the application are logged for audit purposes.
- Unit tests will be provided for testing the application's functionality.
- The `Main class contains `System.out.println` for displaying results to the console.
- Premium features like song downloads are only accessible to users with premium status.

Class Diagram

![Screenshot 2024-01-28 at 21.53.32](/Users/liafernando/Desktop/University/Year 2/java2/SpotifySAssignment/Start Document/Screenshot 2024-01-28 at 21.53.32.png)

Test Data

### Song

| Input             | ID   | Code                                                       |
| ----------------- | ---- | ---------------------------------------------------------- |
| Title             | ID:0 | `new Song("Calm down", "Selena Gomez", 125, true)`         |
| Artist            | ID:1 | `new Song("Shake It Off", "Taylor Swift", 210, true)`      |
| DurationInSeconds | ID:2 | `new Song("Thriller", "Michael Jackson", 358, false)`      |
| Downloadable      | ID:3 | `new Song("Heal the World", "Michael Jackson", 233, true)` |
| Downloads         | ID:4 | `new Song("Dangerous Women", "Arina Grande", 228, true)`   |

### Playlist

| Input         | ID   | Code                           |
| ------------- | ---- | ------------------------------ |
| Playlist Name | ID:5 | `new Playlist("My Favorites")` |
| Songs         | ID:6 | `playlist.addSong(song)`       |

### Player

| Input        | ID   | Code                             |
| ------------ | ---- | -------------------------------- |
| Current Song | ID:7 | `player.selectSong(song)`        |
| Most Played  | ID:8 | `player.getMostPlayedPlaylist()` |
| All Songs    | ID:9 | `player.addSong(new Song(...))`  |

### User

| Input          | ID    | Code             |
| -------------- | ----- | ---------------- |
| Premium Status | ID:10 | `new User(true)` |

### MostPlayedPlaylist

| Input                     | ID    | Code                                                |
| ------------------------- | ----- | --------------------------------------------------- |
| Songs with High PlayCount | ID:11 | `mostPlayedPlaylist.addSong(songWithHighPlayCount)` |

In the following table you'll find all the data that is needed for testing.

Test Cases

In this section the testcases will be described. Every test case should be executed with the test data as starting point.

**Test Case 1: Creating a New Song**

| Step   | Input                                  | Actions                       | Expected Output                                     |
| ------ | -------------------------------------- | ----------------------------- | --------------------------------------------------- |
| Step 1 | "Calm Down", "Selena Gomez", 125, true | Instantiate a new Song object | A Song object with the specified attributes created |

**Test Case 2: Playing a Song**

| Step   | Input | Actions                 | Expected Output                                  |
| ------ | ----- | ----------------------- | ------------------------------------------------ |
| Step 1 |       | Call song.play() method | The playCount of the Song object increments by 1 |

**Test Case 3: Downloading a Downloadable Song**

| Step   | Input | Actions                     | Expected Output             |
| ------ | ----- | --------------------------- | --------------------------- |
| Step 1 |       | Call song.download() method | A download link is returned |

**Test Case 4: Attempting to Download a Non-Downloadable Song**

| Step   | Input | Actions                                                 | Expected Output                             |
| ------ | ----- | ------------------------------------------------------- | ------------------------------------------- |
| Step 1 |       | Call song.download() on a song that is not downloadable | "Song is not downloadable" message returned |

**Test Case 5: Getting Formatted Duration of a Song**

| Step   | Input | Actions                                 | Expected Output                                    |
| ------ | ----- | --------------------------------------- | -------------------------------------------------- |
| Step 1 | -     | Call song.getFormattedDuration() method | Duration of the song returned in "hh:mm:ss" format |

**Test Case 7: Adding a Song to a Playlist**

| Step   | Input       | Actions                     | Expected Output               |
| ------ | ----------- | --------------------------- | ----------------------------- |
| Step 1 | Song object | Call playlist.addSong(song) | Song is added to the playlist |

**Test Case 8: Removing a Song from a Playlist**

| **Step** | **Input**   | **Actions**                    | **Expected Output**               |
| -------- | ----------- | ------------------------------ | --------------------------------- |
| Step 1   | Song object | Call playlist.removeSong(song) | Song is removed from the playlist |

**Test Case 9: Retrieving Total Playtime of a Playlist**

| **Step** | **Input** | **Actions**                             | **Expected Output**                          |
| -------- | --------- | --------------------------------------- | -------------------------------------------- |
| Step 1   |           | Call playlist.getTotalPlaytime() method | Total playtime of the playlist in "hh:mm:ss" |

**Test Case 10: Adding a Song to Most Played Playlist**

| **Step** | **Input**           | **Actions**                           | **Expected Output**                       |
| -------- | ------------------- | ------------------------------------- | ----------------------------------------- |
| Step 1   | Song played 5 times | Call mostPlayedPlaylist.addSong(song) | Song is added to the most played playlist |

Test Case 11: Exceeding Most Played Playlist Capacity

| **Step** | **Input**                | **Actions**                           | **Expected Output**                                          |
| -------- | ------------------------ | ------------------------------------- | ------------------------------------------------------------ |
| Step 1   | 11th Song played 5 times | Call mostPlayedPlaylist.addSong(song) | 1st song removed, 11th song added to the most played playlist |

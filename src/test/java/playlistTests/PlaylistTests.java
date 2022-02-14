package playlistTests;

import PlaylistMethods.PlayListSteps;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PlaylistTests {

    private PlayListSteps playListSteps = new PlayListSteps();
    private String playListId = "5ZUKuaEdUU0fEbwd2Af3WF";

    @Test(priority = 1)
    public void createPlayListTest() {
        var playlistPojo = playListSteps.createPlayList("Playlist 1337", "New playlist", false);
        playListId = playlistPojo.getId();
        assertThat(playlistPojo.getDescription()).isEqualTo("New playlist");
    }

    @Test(priority = 2)
    public void getPlayListItemsTest() {
        var id = playListSteps.getPlayListItems(playListId);
        var href = id.getHref();
        assertThat(href).contains(playListId);
    }

    @Test(priority = 3)
    public void getPlayListTest() {
        var playlistPojo = playListSteps.getPlaylist(playListId);
        assertThat(playlistPojo.getId()).isEqualTo(playListId);
        assertThat(playlistPojo.getName()).isEqualTo("Best playlist ");
    }

    @Test(priority = 4)
    public void updatePlaylistTest() {
        var playlistPojo = playListSteps.createPlayList("Playlist 1337", "New playlist", false);
        playListSteps.updatePlaylist(playlistPojo.getId());
        var changingPlaylistPojo = playListSteps.getPlaylist(playlistPojo.getId());
        assertThat(changingPlaylistPojo.getName()).isEqualTo("Update Playlist");
    }

    @Test(priority = 5)
    public void addItemsToPlaylistTest() {
        var playlistPojo = playListSteps.createPlayList("Playlist 1337", "New playlist", false);
        var response = playListSteps.addItemsToPlaylist("spotify:track:514owCJP2ID4Q4w5YhvQ3I", playListId);
        assertThat(response.statusCode()).isEqualTo(200);
    }

    @Test(priority = 6)
    public void deletePlaylistItemsTest() {
        var playlistPojo = playListSteps.createPlayList("Playlist 1337", "New playlist", false);
        playListSteps.addItemsToPlaylist("spotify:track:514owCJP2ID4Q4w5YhvQ3I", playlistPojo.getId());
        var response = playListSteps.removeSongFromPlaylist("spotify:track:514owCJP2ID4Q4w5YhvQ3I", playlistPojo.getId());
        assertThat(response.statusCode()).isEqualTo(200);
    }
}
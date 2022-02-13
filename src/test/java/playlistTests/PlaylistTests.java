package playlistTests;

import PlaylistMethods.PlayListSteps;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PlaylistTests {

    private PlayListSteps playListSteps = new PlayListSteps();
    private String playListId;

    @Test
    public void createPlayList() {
        var ob = playListSteps.createPlayList("Playlist 1337", "New playlist", false);
        playListId = ob.getId();
        assertThat(ob.getDescription()).isEqualTo("New playlist");
    }

    @Test
    public void getPlayListItems() {
        var id = playListSteps.getPlayListItems(playListId);
       // var href = id.getHref();
       // assertThat(href).isEqualTo(playListId);
    }

    @Test
    public void getPlayList() {
        var id = playListSteps.getPlaylist("5ZUKuaEdUU0fEbwd2Af3WF");
        System.out.println(id.getDescription());
    }

    @Test
    public void updateUser() {
        var ob = playListSteps.updatePlaylist("5ZUKuaEdUU0fEbwd2Af3WF");
    }
}



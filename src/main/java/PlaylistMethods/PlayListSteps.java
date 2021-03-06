package PlaylistMethods;

import PojoDescriptor.PlayListGetPojo;
import PojoDescriptor.PlaylistCreatePojo;
import PojoDescriptor.PlaylistItemsPojo;
import io.restassured.response.Response;
import reqBuilder.RequestBuilder;
import utils.UserCredentials;
import static JsonBodyFactory.PlaylistDescriptionFactory.createPlaylistDescriptionBody;
import static io.restassured.RestAssured.given;

public class PlayListSteps {

    public PlaylistItemsPojo getPlayListItems(String playListId) {
        return given(RequestBuilder.getReqSpec())
                .pathParam("playlist_id", playListId)
                .get("playlists/{playlist_id}/tracks").as(PlaylistItemsPojo.class);
    }

    public PlayListGetPojo getPlaylist(String playListId) {
        return given(RequestBuilder.getReqSpec())
                .pathParam("playlist_id", playListId)
                .get("playlists/{playlist_id}").as(PlayListGetPojo.class);
    }

    public PlaylistCreatePojo createPlayList(String name, String descript, boolean status) {
        var jsonBody = createPlaylistDescriptionBody(name, descript, status);
        return given(RequestBuilder.getReqSpec())
                .pathParam("user_id", UserCredentials.getUser_id())
                .body(jsonBody)
                .post("users/{user_id}/playlists").as(PlaylistCreatePojo.class);
    }

    public String updatePlaylist(String playlistId) {
        var jsonBody = createPlaylistDescriptionBody("Update Playlist", " Update list", false);
        return given(RequestBuilder.getReqSpec())
                .pathParam("user_id", playlistId)
                .body(jsonBody)
                .put("users/{user_id}/playlists").then().extract().asPrettyString();
    }

    public Response addItemsToPlaylist(String addItem, String playListId) {
        return given(RequestBuilder.getReqSpec())
                .pathParam("playlist_id", playListId)
                .queryParams("uris", addItem)
                .post("users/{playlist_id}/tracks");
    }

    public Response removeSongFromPlaylist(String playListId, String soundId) {
        return given(RequestBuilder.getReqSpec())
                .pathParam("playlist_id", playListId)
                .queryParams("uris", soundId)
                .delete("playlists/{playlist_id}/tracks");
    }
}
package steps;


import JsonsRepo.PlayListJsonBodyDescriptor;
import org.junit.Test;
import reqBuilder.RequestBuilder;
import utils.UserCredentials;
import static JsonBodyCreators.PlaylistDescriptionBodyCreator.createPlaylistDescriptionObj;
import static io.restassured.RestAssured.given;

public class PlayListSteps {

    @Test
    public void getPlayListItems() {


        PlayListJsonBodyDescriptor obj  =  given(RequestBuilder.getReqSpec())
                        .pathParam("playlist_id", "5ZUKuaEdUU0fEbwd2Af3WF")
                        .get("playlists/{playlist_id}/tracks")
                        .as(PlayListJsonBodyDescriptor.class);

        System.out.println(obj.getName());
        
    }

    @Test
    public void createPlayList() {
         var jsonBody = createPlaylistDescriptionObj("Test list" , " Test list" , true);
        String req =
                given(RequestBuilder.getReqSpec())
                        .pathParam("user_id", UserCredentials.getUser_id())
                        .body(jsonBody)
                        .post("users/{user_id}/playlists")
                        .then().extract().body().asPrettyString();
        System.out.println(req);
    }

}
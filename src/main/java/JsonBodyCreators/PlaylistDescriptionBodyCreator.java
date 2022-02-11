package JsonBodyCreators;

import JsonsRepo.PlayListJsonBodyDescriptor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;

public class PlaylistDescriptionBodyCreator {

    public static String createPlaylistDescriptionObj(String name , String description ,boolean publc) {
        ObjectMapper objectMapper = new ObjectMapper();
        PlayListJsonBodyDescriptor playlistBuilder = new PlayListJsonBodyDescriptor();
        playlistBuilder.setName(name);
        playlistBuilder.setDescription(description);
       // playlistBuilder.setPublic(publc);
        String JsonPlaylistDescription = null;
        try {
            return objectMapper.writeValueAsString(playlistBuilder);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            Assert.assertTrue(JsonPlaylistDescription != null);
        }
        return JsonPlaylistDescription;
    }
}

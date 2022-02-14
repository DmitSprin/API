package JsonBodyFactory;

import PojoDescriptor.PlayListDescriptionPojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.assertj.core.api.Assertions.assertThat;

public class PlaylistDescriptionFactory {

    public static String createPlaylistDescriptionBody(String name, String description, boolean publc) {
        ObjectMapper objectMapper = new ObjectMapper();
        var playlistBuilder = PlayListDescriptionPojo.builder()
                .name(name).description(description)
                .Public(publc).build();
        String JsonPlaylistDescription = null;
        try {
            return objectMapper.writeValueAsString(playlistBuilder);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            assertThat(JsonPlaylistDescription != null);
        }
        return JsonPlaylistDescription;
    }
}
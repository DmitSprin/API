package PojoDescriptor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PlaylistItemsPojo {
    private String href;
    private List<Items> items;
}

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
class Items {
    @JsonProperty("added_at")
    private String addedAt;
    @JsonProperty("is_local")
    private boolean isLocal;
}
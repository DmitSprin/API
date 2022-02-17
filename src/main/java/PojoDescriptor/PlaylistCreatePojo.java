package PojoDescriptor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PlaylistCreatePojo {
        private String name;
        private String description;
        @JsonProperty("public")
        private boolean Public;
        @JsonProperty("id")
        private String id;
}
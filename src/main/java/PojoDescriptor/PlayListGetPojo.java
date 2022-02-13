package PojoDescriptor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PlayListGetPojo {
    private boolean collaborative;
    private String description;
    private String id;
    private String name;
}

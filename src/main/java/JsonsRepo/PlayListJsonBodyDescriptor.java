package JsonsRepo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayListJsonBodyDescriptor {
    private boolean collaborative;
    private String description;
    private String externalUrls;
    private String followers;
    private String href;
    private String id;
    private String name;
    private String owner;
    private Object primaryColor;
    private boolean welcomePublic;
    private String snapshotID;
    private String tracks;
    private String type;
    private String uri;

    @JsonProperty("collaborative")
    public boolean getCollaborative() {
        return collaborative;
    }

    @JsonProperty("collaborative")
    public void setCollaborative(boolean value) {
        this.collaborative = value;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String value) {
        this.description = value;
    }

    @JsonProperty("external_urls")
    public String getExternalUrls() {
        return externalUrls;
    }

    @JsonProperty("external_urls")
    public void setExternalUrls(String value) {
        this.externalUrls = value;
    }

    @JsonProperty("followers")
    public String getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(String value) {
        this.followers = value;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String value) {
        this.href = value;
    }

    @JsonProperty("id")
    public String getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(String value) {
        this.id = value;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String value) {
        this.owner = value;
    }

    @JsonProperty("primary_color")
    public Object getPrimaryColor() {
        return primaryColor;
    }

    @JsonProperty("primary_color")
    public void setPrimaryColor(Object value) {
        this.primaryColor = value;
    }

    @JsonProperty("public")
    public boolean getWelcomePublic() {
        return welcomePublic;
    }

    @JsonProperty("public")
    public void setWelcomePublic(boolean value) {
        this.welcomePublic = value;
    }

    @JsonProperty("snapshot_id")
    public String getSnapshotID() {
        return snapshotID;
    }

    @JsonProperty("snapshot_id")
    public void setSnapshotID(String value) {
        this.snapshotID = value;
    }

    @JsonProperty("tracks")
    public String getTracks() {
        return tracks;
    }

    @JsonProperty("tracks")
    public void setTracks(String value) {
        this.tracks = value;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String value) {
        this.type = value;
    }

    @JsonProperty("uri")
    public String getURI() {
        return uri;
    }

    @JsonProperty("uri")
    public void setURI(String value) {
        this.uri = value;
    }
}

package com.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class ExternalUrls {

    @JsonProperty("com/spotify/oauth2/tests")
    private String spotify;

    @JsonProperty("com/spotify/oauth2/tests")
    public String getSpotify() {
        return spotify;
    }

    @JsonProperty("com/spotify/oauth2/tests")
    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

}

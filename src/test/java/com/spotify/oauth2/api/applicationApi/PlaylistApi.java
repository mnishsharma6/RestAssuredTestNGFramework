package com.spotify.oauth2.api.applicationApi;

import com.spotify.oauth2.api.RestResource;
import com.spotify.oauth2.api.TokenManager;
import com.spotify.oauth2.pojo.Playlist;
import com.spotify.oauth2.utils.ConfigLoader;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static com.spotify.oauth2.api.ConstantsEndpoint.*;


public class PlaylistApi {
    @Step
    public static Response post(Playlist requestPlaylist) {
        return RestResource.post(USERS + "/" + ConfigLoader.getInstance().getUserId() + PLAYLISTS, TokenManager.getToken(), requestPlaylist);
    }

    @Step
    public static Response post(String token, Playlist requestPlaylist) {
        return RestResource.post(USERS + "/" + ConfigLoader.getInstance().getUserId() + PLAYLISTS, token, requestPlaylist);
    }

    @Step
    public static Response get(String playlistId) {
        return RestResource.get(PLAYLISTS + "/" + playlistId, TokenManager.getToken());
    }

    @Step
    public static Response put(String playlistId, Playlist requestPlaylist) {
        return RestResource.put(PLAYLISTS + "/" + playlistId, TokenManager.getToken(), requestPlaylist);
    }
}

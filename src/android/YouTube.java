/**
 * Cordova YouTube Plugin
**/

package com.jpl.cordova.plugins.youtube;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class YouTube extends CordovaPlugin {

    @Override
     public boolean execute (String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            String videoId = args.getString(0);
            int startTimeMillis = args.getInt(1);
            boolean autoplay = args.getBoolean(2);
            boolean lightboxMode = args.getBoolean(3);

            openStandalonePlayer(videoId, startTimeMillis, autoplay, lightboxMode);
            return true;
        } catch (JSONException e) {
            return false;
        }
    }

    private void openStandalonePlayer (String videoid, int startTimeMillis, boolean autoplay, boolean lightboxMode) {
        Intent youtubeIntent = YouTubeStandalonePlayer.createVideoIntent((Activity) this.cordova, Config.API_KEY, videoid, startTimeMillis, autoplay, lightboxMode);
        this.cordova.startActivityForResult(this, youtubeIntent, 0);
    }

}

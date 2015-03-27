# Cordova YouTube Plugin
Play YouTube Videos using the [YouTube Android Player API v1.2.1](https://developers.google.com/youtube/android/player/downloads/)

## Installation

### Add the plugin
```sh
cordova plugin add https://github.com/jplcreative/cordova-plugin-youtube.git
```

### Add your API Key
1. Follow the [Register Your App](https://developers.google.com/youtube/android/player/register) instructions to generate an API key
1. Enter the API key in Config.java (within the `plugins/android/com.jpl.cordova.plugins.youtube/src/android` directory)

## Usage
```javascript
YouTube.playVideo(videoId, startTimeMillis, autoplay, lightboxMode, success, error);
```

### Parameters
See [YouTubeStandalonePlayer Reference Guide](https://developers.google.com/youtube/android/player/reference/com/google/android/youtube/player/YouTubeStandalonePlayer)

| Parameter     | Description   |
| ------------- | ------------- |
| videoId       | The YouTube video id |
| timeMillis    | The time, in milliseconds, where playback should start in the video. |
| autoplay      | `true` to have the video start playback as soon as the standalone player loads, `false` to cue the video. |
| lightboxMode  | `true` to have the video play in a dialog view above your current Activity, `false` to have the video play fullscreen. |

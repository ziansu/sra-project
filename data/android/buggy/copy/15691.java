public void onPlayPauseClicked(android.view.View v) {
    com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.utils.LogHelper.d(com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.TAG, "play-pause clicked");
    switch (currentSongState) {
        case com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.STATE_STOPPED :
        case com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.STATE_PAUSED :
            sendResumeMessageToService();
            break;
        case com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.STATE_PLAYING :
            sendPauseMessageToService();
            break;
        default :
            break;
    }
}
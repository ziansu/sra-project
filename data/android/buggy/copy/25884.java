public void onPrevClicked(android.view.View v) {
    com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.utils.LogHelper.d(com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.TAG, "prev clicked");
    sendSkipToPrevMessageToService();
}
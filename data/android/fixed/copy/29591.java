private void onSucces(java.io.File response) throws java.io.IOException {
    android.util.Log.d("Download", "Download succeeded");
    for (org.bottiger.podcast.service.Downloader.engines.Callback callback : mExternalCallback) {
        callback.downloadCompleted(mEpisode);
    }
}
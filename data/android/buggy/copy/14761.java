private boolean isLocalVideoPlaying() {
    timber.log.Timber.d("VideoDetailsFragment : isLocalVideoPlaying()");
    return exoPlayer.getPlayWhenReady();
}
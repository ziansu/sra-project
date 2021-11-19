private void playRemoteVideo(long position, boolean autoPlay) {
    timber.log.Timber.d("VideoDetailsFragment : playRemoteVideo()");
    updateRemoteVideoPosition(position);
    loadRemoteMedia(position, autoPlay);
}
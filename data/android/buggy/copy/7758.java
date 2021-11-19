private void updateLocalVideoPosition(long position) {
    timber.log.Timber.d("VideoDetailsFragment : updateLocalVideoPosition() : getFormattedPosition(position) - %s", getFormattedPosition(position));
    exoPlayer.seekTo(position);
}
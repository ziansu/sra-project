private void updateRemoteVideoPosition(long position) {
    timber.log.Timber.d("VideoDetailsFragment : updateRemoteVideoPosition() : getFormattedPosition(position) - %s", getFormattedPosition(position));
    castSession.getRemoteMediaClient().seek(position, RemoteMediaClient.RESUME_STATE_UNCHANGED);
}
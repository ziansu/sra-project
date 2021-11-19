private void resumeRemoteVideo() {
    if ((castSession) != null) {
        com.google.android.gms.cast.framework.media.RemoteMediaClient remoteMediaClient = castSession.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.play();
        }
    }
}
@java.lang.Override
public void setDataSource(android.content.Context context, android.net.Uri uri) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
    org.bottiger.podcast.player.exoplayer.ExoPlayerMediaSourceHelper mediaSourceHelper = new org.bottiger.podcast.player.exoplayer.ExoPlayerMediaSourceHelper(context);
    com.google.android.exoplayer2.source.MediaSource source = mediaSourceHelper.buildMediaSource(uri);
    mExoplayer.prepare(source);
}
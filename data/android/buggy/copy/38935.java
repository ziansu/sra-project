@java.lang.Override
protected void onQueueInputBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer buffer) {
    if (((com.google.android.exoplayer2.util.Util.SDK_INT) < 23) && (tunneling)) {
        maybeNotifyRenderedFirstFrame();
    }
}
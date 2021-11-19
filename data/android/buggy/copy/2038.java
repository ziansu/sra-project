public void release() {
    continueLoadingHandler.removeCallbacksAndMessages(null);
    manifestFetcher.release();
    for (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper sampleStreamWrapper : sampleStreamWrappers) {
        sampleStreamWrapper.release();
    }
}
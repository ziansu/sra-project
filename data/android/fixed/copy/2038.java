public void release() {
    continueLoadingHandler.removeCallbacksAndMessages(null);
    manifestFetcher.release();
    if ((sampleStreamWrappers) != null) {
        for (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper sampleStreamWrapper : sampleStreamWrappers) {
            sampleStreamWrapper.release();
        }
    }
}
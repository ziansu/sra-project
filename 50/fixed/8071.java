private void flvFrameCacheAdd(net.ossrs.rtmp.SrsFlvMuxer.SrsFlvFrame frame) {
    try {
        mFlvTagCache.add(frame);
    } catch (java.lang.IllegalStateException e) {
        android.util.Log.i(net.ossrs.rtmp.SrsFlvMuxer.TAG, "frame discarded");
    }
}
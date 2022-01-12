public boolean startRecord(java.lang.String recPath) {
    return ((mMp4Muxer) != null) && (mMp4Muxer.record(new java.io.File(recPath)));
}
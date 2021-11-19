protected void prepare() throws java.io.IOException {
    if ((mState) < (com.tanosys.videolibrary.MediaDecoder.STATE_PREPARED)) {
        mState = com.tanosys.videolibrary.MediaDecoder.STATE_PREPARED;
    }else {
        configure();
    }
}
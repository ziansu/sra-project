@java.lang.Override
void endVideo() {
    synchronized(this) {
        mMediaRecorder.stop();
        mMediaRecorder.release();
        mMediaRecorder = null;
        mCameraListener.onVideoTaken(mVideoFile);
    }
}
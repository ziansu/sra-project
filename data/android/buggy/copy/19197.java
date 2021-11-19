@java.lang.Override
void endVideo() {
    mMediaRecorder.stop();
    mMediaRecorder.release();
    mMediaRecorder = null;
    mCameraListener.onVideoTaken(mVideoFile);
}
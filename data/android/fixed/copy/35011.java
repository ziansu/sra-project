public void stopRecorder() {
    mIsRecording = false;
    com.wlanjie.ffmpeg.FFmpeg.getInstance().endSection();
    mAudioProcessor.stopEncode();
    mVideoRenderer.stopEncoder();
}
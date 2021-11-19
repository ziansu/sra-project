public void pauseAudio() {
    if ((mAudioTrack) == null)
        return ;
    
    mAudioTrack.flush();
    mAudioTrack.pause();
    com.drbeef.quakegearvr.QGVRAudioCallback.reqThreadrunning = false;
}
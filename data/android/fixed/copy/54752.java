@java.lang.Override
public void setTime(int time) {
    if ((nativeVideo) != null) {
        nativeVideo.seekTo(time);
    }
}
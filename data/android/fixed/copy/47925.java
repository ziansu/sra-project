@java.lang.Override
public void onCreate() {
    super.onCreate();
    mTrackPosition = 0;
    if ((mPlayer) == null) {
        mPlayer = new android.media.MediaPlayer();
    }
    initMusicPlayer();
}
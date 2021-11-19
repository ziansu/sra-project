@java.lang.Override
public void onSeekComplete(@android.support.annotation.NonNull
com.devbrackets.android.playlistcore.api.MediaPlayerApi mediaPlayerApi) {
    if (pausedForSeek) {
        performPlay();
        pausedForSeek = false;
    }else {
        performPause();
    }
}
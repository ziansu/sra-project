@java.lang.Override
public void onAudioFocusChange(int focusChange) {
    if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS)) {
        mAudioManager.abandonAudioFocus(afChangeListener);
        if ((null != (mPlayer)) && (mPlayer.isPlaying()))
            stopPlaying();
        
    }
}
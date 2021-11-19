@java.lang.Override
public void onAudioFocusChange(int focusChange) {
    switch (focusChange) {
        case android.media.AudioManager.AUDIOFOCUS_LOSS :
        case android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT :
        case android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK :
            pause();
            break;
        case android.media.AudioManager.AUDIOFOCUS_GAIN :
            resume();
            break;
    }
}
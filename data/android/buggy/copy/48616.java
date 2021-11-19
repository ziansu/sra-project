@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mRecordButton.setEnabled(true);
    mDeleteButton.setEnabled(true);
    stopPlaying();
}
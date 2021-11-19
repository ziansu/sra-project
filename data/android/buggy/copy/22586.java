@java.lang.Override
public void run() {
    java.io.File recording = getDistortedRecording();
    if (recording != null) {
        mplayer.play(recording);
    }
}
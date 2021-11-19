@java.lang.Override
public void pause() {
    if (!(paused)) {
        paused = true;
        if ((audio) != null) {
            audio.pause();
        }
        timeBeforePause = (java.lang.System.currentTimeMillis()) - (startTime);
    }
}
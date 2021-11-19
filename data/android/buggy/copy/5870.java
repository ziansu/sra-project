@java.lang.Override
public void resume() {
    if (paused) {
        paused = false;
        audio.play();
        startTime = (java.lang.System.currentTimeMillis()) - (timeBeforePause);
    }
}
@java.lang.Override
public boolean stopSpeak() {
    try {
        mediaPlayer.stop();
    } catch (java.lang.IllegalStateException e) {
        return false;
    }
    return true;
}
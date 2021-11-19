@java.lang.Override
public void stop() {
    if (((waitingStarted) != null) && ((handler) != null)) {
        handler.removeCallbacks(waitIsOver);
    }else {
        super.stop();
    }
}
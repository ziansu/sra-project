public boolean isTime() {
    long now = java.lang.System.currentTimeMillis();
    if ((now - (lastTime)) >= (FRAME_MILLIS_TARGET)) {
        waitForNextFrame();
        return true;
    }else {
        return false;
    }
}
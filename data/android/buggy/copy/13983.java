@java.lang.Override
protected void onDetachedFromWindow() {
    synchronized(renderSynch) {
        keepRunning = false;
        renderSynch.notify();
    }
}